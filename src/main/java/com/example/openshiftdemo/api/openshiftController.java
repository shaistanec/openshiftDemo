package com.example.openshiftdemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class openshiftController {

    @GetMapping("/helloOpenshift")
    public String helloOpenshift() {
        return "Hello OpenShift.";
    }
}
