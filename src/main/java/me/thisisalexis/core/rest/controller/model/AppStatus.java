package me.thisisalexis.core.rest.controller.model;

public class AppStatus implements RestResponse {

    private boolean status;

    AppStatus() {}

    AppStatus(Boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "App Status is:" + this.status;
    }

    public static final AppStatus getInstance() { return new AppStatus(); }

}
