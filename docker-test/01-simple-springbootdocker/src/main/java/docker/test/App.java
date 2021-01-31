package docker.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/list")
    public List<User> list(){
        List<User> list =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName("name" + i);
            user.setAge(Integer.toString((int)(Math.random() * 30 + 20)));
            list.add(user);
        }
        return list;
    }
}
