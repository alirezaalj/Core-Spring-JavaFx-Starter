package ir.alirezaalijani.javafx.application.scheduler;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

public class MyCustomTask implements SchedulerContent {

    private final String schedulerName;
    private Runnable runnable;
    private ScheduledFuture<?> future;


    public MyCustomTask(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    @Override
    public String getSchedulerName() {
        return this.schedulerName;
    }

    @Override
    public Runnable getRunnable() {
        return this.runnable;
    }

    @Override
    public Future<?> getFuture() {
        return this.future;
    }

    @Override
    public void setFuture(Future<?> future) {
        this.future= (ScheduledFuture<?>) future;
    }

    @Override
    public void setRunnable(Runnable runnable) {
        this.runnable=runnable;
    }

}
