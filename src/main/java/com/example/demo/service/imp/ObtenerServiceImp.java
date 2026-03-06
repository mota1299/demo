package com.example.demo.service.imp;

import com.example.demo.model.response.SumaResponse;
import com.example.demo.service.IObtenerSuma;
import org.springframework.stereotype.Service;

@Service
public class ObtenerServiceImp implements IObtenerSuma {

    @Override
    public SumaResponse getSuma(Integer num1, Integer num2) {
        SumaResponse response = new SumaResponse();
        response.setSuma(num1+num2);
        return response;
    }
}
