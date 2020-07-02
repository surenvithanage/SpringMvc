package in.anandm.apps.bean.session;

import in.anandm.apps.bean.websystemuser.WebSystemUserBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Project apps
 * User : suren_v
 * Date : 7/2/2020
 * Time : 10:45 AM
 */
@Component
@Scope("session")
public class SessionBean implements Serializable {

    WebSystemUserBean webSystemUserBean;

    public WebSystemUserBean getWebSystemUserBean() {
        return webSystemUserBean;
    }

    public void setWebSystemUserBean(WebSystemUserBean webSystemUserBean) {
        this.webSystemUserBean = webSystemUserBean;
    }
}
