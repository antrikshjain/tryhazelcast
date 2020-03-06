package tryspring.impl.scheduler;


import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableAsync
public class TryScheduler {

    @Async
    @Scheduled(fixedRate = 3000)
    public void scheduledMethod() {
        System.out.println(LocalDateTime.now() + ":scheduledMethod-1");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    @Scheduled(fixedRate = 1000)
    public void scheduledMethod2() {
        System.out.println(LocalDateTime.now() + ":scheduledMethod-2");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
