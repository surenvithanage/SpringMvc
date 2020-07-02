package in.anandm.apps.interceptor;

import in.anandm.apps.bean.session.SessionBean;
import in.anandm.apps.service.AccessControlService;
import in.anandm.apps.varlist.SessionVarlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Project apps
 * User : suren_v
 * Date : 7/2/2020
 * Time : 10:59 AM
 */
public class CheckAccessInterceptor implements HandlerInterceptor {

    @Autowired
    private SessionBean sessionBean;

    /**
     * @return the sessionBean
     */
    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        boolean accessStatus = false;
        if (o instanceof HandlerMethod) {
            HandlerMethod method = (HandlerMethod) o;
            // obtaining the method name
            String methodName = method.getMethod().getName();
            if (sessionBean.getWebSystemUserBean() != null) {
                ServletContext ctx = request.getServletContext();
                HashMap<String, String> userMap = (HashMap<String, String>) ctx.getAttribute(SessionVarlist.USERMAP);
                String sessionId = userMap.get(sessionBean.getWebSystemUserBean().getUsername());
                if (sessionId.equals(request.getSession(false).getId())) {
                    if (method.getBean() instanceof AccessControlService) {
                        if (((AccessControlService) method.getBean()).checkAccess(methodName, sessionBean.getWebSystemUserBean().getUserrolecode())) {
                            accessStatus = true;
                        } else {
                            RequestDispatcher requestDispatcher = request.getRequestDispatcher("logout");
                            requestDispatcher.forward(request, response);
                        }
                    }
                } else {
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("logout");
                    requestDispatcher.forward(request, response);
                    accessStatus = false;
                }
            } else {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("logout");
                requestDispatcher.forward(request, response);
                accessStatus = false;
            }
        }
        return accessStatus;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
