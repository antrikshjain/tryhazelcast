package tryspring.impl;

import com.antriksh.OutsideApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanOperation
{
    @Autowired
    OutsideApp outsideApp;

    @PostConstruct
    public void postConstruct()
    {
        //System.out.println("BEAN OPERATION, POST CONSTRUCT");
    }

    @PreDestroy
    public void preDestroy()
    {
       // System.out.println("BEAN OPERATION, PRE DESTROY");
    }

    public void m()
    {
        outsideApp.m();
    }
}
