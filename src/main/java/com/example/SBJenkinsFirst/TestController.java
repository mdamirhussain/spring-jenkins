package com.example.SBJenkinsFirst;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class TestController {
 @GetMapping("/test")
 public ResponseEntity<Object> getMethodName() {
	 System.out.println("call test endpoint");
     return ResponseEntity.ok("success");
 }
}
