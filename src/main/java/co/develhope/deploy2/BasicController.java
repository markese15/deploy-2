package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping
    public int somma(){
        int a=1;
        int b=2;
        return a + b;
    }
}
