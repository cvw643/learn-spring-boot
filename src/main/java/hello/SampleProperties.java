package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by cvw643 on 2016/8/2.
 */
@ConfigurationProperties(prefix = "sample")
public class SampleProperties {

    private String greeting = "Hello World";

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
