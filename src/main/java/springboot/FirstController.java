package springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class FirstController {

    Random random = new Random();

    @GetMapping("/random")
    public int generateRandom(){
        return random.nextInt();
    }

    @GetMapping("/greet/{name}")
    public String greetUser(@PathVariable String name){
        return "Hello, " + name +"!";
    }

}
