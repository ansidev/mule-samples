
package xyz.ansidev.domain;


import java.io.Serializable;

public class Email implements Serializable {

    private static final long serialVersionUID = 6412135990330505529L;
    private String primary;
    private String secondary;

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }
}