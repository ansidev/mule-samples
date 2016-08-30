
package xyz.ansidev.domain;


import java.io.Serializable;

public class Contact implements Serializable {

    private static final long serialVersionUID = 8191183310915009265L;
    private String homePhone;
    private String cellPhone;
    private String fax;
    private Email email;

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}