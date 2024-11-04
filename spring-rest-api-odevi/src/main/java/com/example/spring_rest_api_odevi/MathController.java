package com.example.spring_rest_api_odevi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	@GetMapping("/topla")
    public ResponseEntity<Double> topla(
            @RequestParam double sayi1,
            @RequestParam double sayi2) {
        double sonuc = sayi1 + sayi2;
        return ResponseEntity.ok(sonuc);
    }
}