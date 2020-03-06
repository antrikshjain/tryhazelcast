package tryspring.java;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class ConcurrentHashMapPOC implements CommandLineRunner
{
    Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

    public void run(String... args) throws Exception
    {
        newThread();
        newThread();
        newThread();
        newThread();
    }

    private ExecutorService executorService;

    @PostConstruct
    public void init()
    {
        this.executorService = Executors.newFixedThreadPool(5);
    }

    public void newThread() throws Exception
    {
        executorService.submit(()->logic());
    }

    public void logic()
    {
        try {
            int i = 0;
            while (++i < 5000) {
                //System.out.println("Thread name:" + Thread.currentThread().getName() + ":" + i);
                //Thread.sleep(3000);

            }
        }
        catch (Exception e)
        {
            System.out.println(e);
            return;
        }
        System.out.println("Map:" + concurrentMap);
    }
}
