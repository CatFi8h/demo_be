package com.example.demo.controller;

import com.example.demo.model.Log;
import com.example.demo.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class DemoApi {

    private final LogRepository logRepository;

    @GetMapping("hello")
    public String getTestMessage() {
        return "Hello World";
    }

    @GetMapping(value = "log", produces = "application/json")
    public ResponseEntity<Log> logTime() {
        Log log = logRepository.save(new Log());
        System.out.println(log);
        ResponseEntity<Log> ok = ResponseEntity.ok().header("Access-Control-Allow-Origin", "*").body(log);

        return ok;
    }

}
