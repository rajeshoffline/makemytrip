package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hotels {
    @GetMapping("/hotels")
    public String getData () {return "Please book you hotel from mmt Kindly book ticket from New Delhi to anywhere";}
}