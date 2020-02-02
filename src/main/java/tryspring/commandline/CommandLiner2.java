package tryspring.commandline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tryspring.impl.threads.SpanThread;

/**
 * Created by antjain on 1/11/20.
 */
@Component
public class CommandLiner2 implements CommandLineRunner
{

    @Autowired
    SpanThread spanThread;

    public void run(String... args) throws Exception
    {
        System.out.println("Start:: COMMAND LINER 2");
        System.out.println("End:: COMMAND LINER 2");
    }
}
