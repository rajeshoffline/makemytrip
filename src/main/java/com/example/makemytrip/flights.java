package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class flights {
    @GetMapping("/flights")
    public String getData () {return "Please book you flight from Indigo Kindly book ticket from New Delhi to anywhere";}
}
