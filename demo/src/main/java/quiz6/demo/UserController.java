package quiz6.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/add/first/{first}/second/{second}")

    public String addNumbers(@PathVariable int first, @PathVariable int second) {
        int sum = first + second;
        return "Suma este: " + sum;
    }
}
