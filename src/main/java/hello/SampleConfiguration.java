package hello;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cvw643 on 2016/8/2.
 */
@Configuration
@EnableConfigurationProperties(SampleProperties.class)
public class SampleConfiguration {

}
