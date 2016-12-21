package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class SampleApplication {

    @Autowired
    private SampleProperties sampleProperties;

    @GetMapping("/")
    @ResponseBody
    String home() {
        return sampleProperties.getGreeting();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleApplication.class, args);
    }
}