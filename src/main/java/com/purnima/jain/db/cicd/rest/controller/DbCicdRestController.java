package com.purnima.jain.db.cicd.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbCicdRestController {
	
	@GetMapping("/messages")
    public String getMessage() {
        return "Hello from db-cicd 3 !!";
    }

}
