package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class bus {
    @GetMapping("/bus")
    public String getData () {return "Please book you bus tickets from mmt Kindly book ticket from New Delhi to anywhere";}
}
