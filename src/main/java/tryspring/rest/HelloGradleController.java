package tryspring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tryspring.impl.BeanOperation;

@RestController("/")
public class HelloGradleController
{

    @Autowired
    BeanOperation beanOperation;
    @GetMapping
    public String helloGradle() {
        beanOperation.m();
        return "Hello Gradle!";
    }

}
