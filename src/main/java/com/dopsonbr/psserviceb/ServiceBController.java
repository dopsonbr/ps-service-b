package com.dopsonbr.psservicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String HelloFeign() {
        return "hello world";
    }
}
