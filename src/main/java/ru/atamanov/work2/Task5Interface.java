package ru.atamanov.work2;

import java.util.LinkedList;
import java.util.Queue;

public class Task5Interface implements Task{
    private Queue<String> dataQueue = new LinkedList<>();
    private boolean isRunning = false;

    public void addData(String data) {
        dataQueue.offer(data);
        if (isRunning) {
            processNext();
        }
    }

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Обработка запущена");
        processNext();
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Обработка остановлена");
    }

    private void processNext() {
        while (isRunning && !dataQueue.isEmpty()) {
            String data = dataQueue.poll();
            System.out.println("Обработка: " + data);
        }
    }
}

interface Task{
    void start();
    void stop();
}
