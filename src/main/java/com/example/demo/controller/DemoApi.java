package com.example.demo.controller;

import com.example.demo.model.Log;
import com.example.demo.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("log")
@RequiredArgsConstructor
public class DemoApi {

    private final LogRepository logRepository;

    @GetMapping("hello")
    public String getTestMessage() {
        return "Hello World";
    }

    @GetMapping()
    public ResponseEntity<Log> logTime() {
        Log log = logRepository.save(new Log());
        System.out.println(log);
        return ResponseEntity.ok(log);
    }
}
