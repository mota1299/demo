package com.example.demo.service.imp;

import com.example.demo.model.response.DemoResponse;
import com.example.demo.service.IObtenerDataService;
import org.springframework.stereotype.Service;

@Service
public class ObtenerDataServiceImp implements IObtenerDataService {

    @Override
    public DemoResponse getInfo() {
        DemoResponse response = new DemoResponse("Hola mundo 1",1);
        return response;
    }
}
