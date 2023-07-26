package com.samy.template.api;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
@RestController
@RequestMapping("/test")
public class MyController {
    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello World");
    }
}
