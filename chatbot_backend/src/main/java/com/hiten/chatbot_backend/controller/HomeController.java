package com.hiten.chatbot_backend.controller;


import com.hiten.chatbot_backend.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping()
    public ResponseEntity<ApiResponse> homeController(){
        ApiResponse response= new ApiResponse();
        response.setMessage("Welcome to Ai ChatBot");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
