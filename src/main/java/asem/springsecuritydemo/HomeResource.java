package asem.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/read")
    public String home() {
        return ("Welcome");
    }

    @GetMapping("/write")
    public String user() {
        return ("Welcome User");
    }
}
