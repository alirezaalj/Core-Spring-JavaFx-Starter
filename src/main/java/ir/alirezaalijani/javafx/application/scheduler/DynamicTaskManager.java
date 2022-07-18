package ir.alirezaalijani.javafx.application.scheduler;

public interface DynamicTaskManager {
    void startTask(SchedulersIds taskId,Runnable runnable ,long period);
    void startTask(SchedulersIds taskId,long period);
    void stopTask(SchedulersIds taskId);
    void changeTaskPeriod(SchedulersIds taskId,long period);
}
