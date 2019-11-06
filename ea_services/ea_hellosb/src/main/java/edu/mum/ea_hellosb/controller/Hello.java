package edu.mum.ea_hellosb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/test")
public class Hello {
    @RequestMapping("/hello")
    public String say() throws UnknownHostException {
        return "Hello From " + InetAddress.getLocalHost().getHostAddress();
    }
}
