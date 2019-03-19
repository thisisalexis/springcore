package me.thisisalexis.core.rest.controller.model;

/**
 * Response implementation to represent response sent back for AppStatus REST service
 *
 * @author Alexis Bravo
 * @version 0.0.1
 * @since 0.0.1
 */
public class AppStatus implements RestResponse {

    private Boolean status;

    AppStatus() {}

    AppStatus(Boolean status) {
        this.status = status;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "App Status is:" + this.status;
    }

    public static final AppStatus getInstance() { return new AppStatus(); }

}
