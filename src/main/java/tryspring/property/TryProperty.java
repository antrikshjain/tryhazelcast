package tryspring.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by antjain on 2/13/20.
 */
@Component
public class TryProperty implements CommandLineRunner
{

    @Value("${search2lib.elasticUrl:${SEARCH_SC_ADDRESS:http://elasticsearch6:9200}}")
    private String elasticUrl;

    @Value("${aprop:NOT FOUND}")
    private String aProp;

    public void run(String... args) throws Exception
    {
        System.out.println("ELASTICURL:" + elasticUrl);
        System.out.println("APROP:" + aProp);
    }
}
