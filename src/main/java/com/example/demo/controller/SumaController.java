package com.example.demo.controller;

import com.example.demo.model.response.DemoResponse;
import com.example.demo.model.response.SumaResponse;
import com.example.demo.service.IObtenerDataService;
import com.example.demo.service.IObtenerSuma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class SumaController {

    @Autowired
    private IObtenerSuma iObtenerSuma; //interfaz del servicio

    @GetMapping("/suma")
    public ResponseEntity<SumaResponse> getDemo(@RequestParam("num1")Integer num1,
                                                @RequestParam("num2") Integer num2){
        SumaResponse response = iObtenerSuma.getSuma(num1,num2);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
