package tryspring.commandline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLiner implements CommandLineRunner
{
    public void run(String... args)
    {
        System.out.println("Start:: COMMAND LINER 1");
        System.out.println("End:: COMMAND LINER 1");
    }
}
