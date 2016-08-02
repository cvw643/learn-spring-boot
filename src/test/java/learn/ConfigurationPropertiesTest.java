package learn;

import hello.SampleApplication;
import hello.SampleProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by cvw643 on 2016/8/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleApplication.class)
public class ConfigurationPropertiesTest {

    @Autowired
    private SampleProperties sampleProperties;

    @Test
    public void testMyProperties() throws Exception {

        Assert.assertNotNull(sampleProperties);

        Assert.assertEquals("Hello", sampleProperties.getGreeting());
    }
}
