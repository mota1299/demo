package com.example.demo.controller;

import com.example.demo.model.response.DemoResponse;
import com.example.demo.service.IObtenerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class demoController {

    @Autowired
    private IObtenerDataService iObtenerDataService;

    @GetMapping("/hola")
    public ResponseEntity<DemoResponse> getDemo(){
        DemoResponse response = iObtenerDataService.getInfo();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
