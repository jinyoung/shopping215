package shopping.common;


import shopping.ShoppingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ShoppingApplication.class })
public class CucumberSpingConfiguration {
    
}
