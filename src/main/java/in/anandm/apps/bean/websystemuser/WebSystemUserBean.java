package in.anandm.apps.bean.websystemuser;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Project apps
 * User : suren_v
 * Date : 7/2/2020
 * Time : 10:46 AM
 */
@Component
public class WebSystemUserBean implements Serializable {

    private String username;

    private String userrolecode;

    private String empid;

    private String fullname;

    private String address;

    private String address2;

    private String city;

    private String mobile;

    private String telno;

    private String fax;

    private String email;

    private String sessionid;

    private String statuscode;

    private String password;

    private Byte noofinvlidattempt;

    private Byte initialloginstatus;

    private String nic;

    private String lastupdateduser;

    private Date lastupdatedtime;

    private Date expirydate;

    private Date loggeddate;

    private Date dateofbirth;

    private Date createtime;

    public WebSystemUserBean() {
    }

    public WebSystemUserBean(String username, String userrolecode, String empid, String fullname, String address, String address2, String city, String mobile, String telno, String fax, String email, String sessionid, String statuscode, String password, Byte noofinvlidattempt, Byte initialloginstatus, String nic, String lastupdateduser, Date lastupdatedtime, Date expirydate, Date loggeddate, Date dateofbirth, Date createtime) {
        this.username = username;
        this.userrolecode = userrolecode;
        this.empid = empid;
        this.fullname = fullname;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.mobile = mobile;
        this.telno = telno;
        this.fax = fax;
        this.email = email;
        this.sessionid = sessionid;
        this.statuscode = statuscode;
        this.password = password;
        this.noofinvlidattempt = noofinvlidattempt;
        this.initialloginstatus = initialloginstatus;
        this.nic = nic;
        this.lastupdateduser = lastupdateduser;
        this.lastupdatedtime = lastupdatedtime;
        this.expirydate = expirydate;
        this.loggeddate = loggeddate;
        this.dateofbirth = dateofbirth;
        this.createtime = createtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserrolecode() {
        return userrolecode;
    }

    public void setUserrolecode(String userrolecode) {
        this.userrolecode = userrolecode;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getNoofinvlidattempt() {
        return noofinvlidattempt;
    }

    public void setNoofinvlidattempt(Byte noofinvlidattempt) {
        this.noofinvlidattempt = noofinvlidattempt;
    }

    public Byte getInitialloginstatus() {
        return initialloginstatus;
    }

    public void setInitialloginstatus(Byte initialloginstatus) {
        this.initialloginstatus = initialloginstatus;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLastupdateduser() {
        return lastupdateduser;
    }

    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Date getLoggeddate() {
        return loggeddate;
    }

    public void setLoggeddate(Date loggeddate) {
        this.loggeddate = loggeddate;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
