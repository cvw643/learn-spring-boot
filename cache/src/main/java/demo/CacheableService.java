package demo;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author YQ.Huang
 */
@Service
public class CacheableService {

    @Cacheable(value = "demo", key = "#key")
    public String get(String key) throws InterruptedException {
        Thread.sleep(5000);
        return key;
    }

    @CachePut(value = "demo", key = "#key")
    public String update(String key) {
        return key + " <updated>";
    }

    @CacheEvict(value = "demo", key = "#key")
    public void delete(String key) {

    }
}
