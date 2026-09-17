package SriEshwar.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    String hello(){
        return "Hello World";
    }
    String Thankyu(){
        return "Thanks";
    }
}

