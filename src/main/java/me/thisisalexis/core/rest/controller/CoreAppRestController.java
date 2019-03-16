package me.thisisalexis.core.rest.controller;

import me.thisisalexis.core.rest.controller.model.AppStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="app")
public class CoreAppRestController {

    @GetMapping(value="status")
    public ResponseEntity<AppStatus> getAppStatus() {
        ResponseEntity<AppStatus> appStatusResponseEntity = new ResponseEntity<>(AppStatus.getInstance(), HttpStatus.OK);

        return appStatusResponseEntity;
    }

}
