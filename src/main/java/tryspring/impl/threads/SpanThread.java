package tryspring.impl.threads;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Component
public class SpanThread
{
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
            while (++i < 5) {
                System.out.println("Thread name:" + Thread.currentThread().getName() + ":" + i);
                Thread.sleep(3000);
            }
        }
        catch (Exception e)
        {

        }
    }
}
