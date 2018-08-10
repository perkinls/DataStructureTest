package com.perkinl.queue;

import java.util.Random;

public class Main {

    // 测试使用q运行opCount个enqueueu和dequeue操作所需要的时间，单位：秒
    private static double testQueue(Queue<Integer> q, int opCount){

        long startTime = System.nanoTime();

        Random random = new Random();
        for(int i = 0 ; i < opCount ; i ++)
            //入队一个随机数
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0 ; i < opCount ; i ++)
            //出队操作
            q.dequeue();

        long endTime = System.nanoTime();
        //纳秒转换成秒
        return (endTime - startTime) / 1000000000.0;
    }

    /**
     * loopQueue  为0.02秒
     * ArrayQueue  为4.6秒
     * @param args
     */
    public static void main(String[] args) {

        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("普通队列：ArrayQueue, time: " + time1 + " s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("循环队列：LoopQueue, time: " + time2 + " s");
    }
}
