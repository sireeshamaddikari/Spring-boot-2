package com.example.date;

import org.springframework.web.bind.annotation.RestController; 

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate; // Import LocalDate class for date handling

import java.time.format.DateTimeFormatter; // Import DateTimeFormatter class for formatting dates


@RestController

public class MyController {

    // @GetMapping("/")

    // public String hmyController(){

    //         LocalDate today = LocalDate.now();

    //         DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");

    //         String formatted = today.format(formatter);

    //         return formatted;

    // }


     @GetMapping("/")
    public String hmyController(){
        LocalDate today = LocalDate.now(); 
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatted = today.format(formatter);
        
        return formatted; 
    }
}



