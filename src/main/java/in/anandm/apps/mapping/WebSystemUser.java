package in.anandm.apps.mapping;

import javax.persistence.*;
import java.util.Date;

/**
 * Project apps
 * User : suren_v
 * Date : 7/2/2020
 * Time : 10:13 AM
 */
@Entity
@Table(name = "WEB_SYSTEMUSER")
public class WebSystemUser implements java.io.Serializable {

    @Id
    @Column(name = "USERNAME", unique = true, nullable = false, length = 64)
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LASTUPDATEDTIME", nullable = false, length = 19)
    private Date lastupdatedtime;

    @Temporal(TemporalType.DATE)
    @Column(name = "EXPIRYDATE", length = 10)
    private Date expirydate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOGGEDDATE", nullable = false, length = 19)
    private Date loggeddate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATEOFBIRTH", length = 10)
    private Date dateofbirth;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATETIME", nullable = false, length = 19)
    private Date createtime;

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
