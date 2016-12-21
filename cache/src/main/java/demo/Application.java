package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

/**
 * @author YQ.Huang
 */
@SpringBootApplication
@EnableCaching
@RestController
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private CacheableService cacheableService;

    @GetMapping("/{key}")
    public String find(@PathVariable String key) throws InterruptedException {
        return cacheableService.get(key);
    }

    @PostMapping("/{key}")
    public String update(@PathVariable String key) throws InterruptedException {
        return cacheableService.update(key);
    }

    @DeleteMapping("/{key}")
    public void delete(@PathVariable String key) throws InterruptedException {
        cacheableService.delete(key);
    }
}
