package main.java.tests.Threads;

class QueueThread extends Thread {
    private static int currentMax = 1;
    private final int mainID;
    private final Object waitObject;


    private QueueThread(int id, Object waitObject) {
        mainID = id;
        this.waitObject = waitObject;
    }

    public static void example() {
        Object waitObject = new Object();
        for (int i = currentMax; i <= 10 ; i++) {
            Thread thread = new QueueThread(i, waitObject);
            thread.start();
        }
    }

    public void run() {
        try {
            System.out.println("Start " + mainID);
            synchronized (waitObject) {
                System.out.println("Sync " + mainID);
                while (mainID > currentMax) {
                    System.out.println("Before wait " + mainID);
                    waitObject.wait();
                    System.out.println("After wait " + mainID);
                }

                currentMax++;
                System.out.println("Work " + mainID);
                waitObject.notifyAll();
                System.out.println("Notify " + mainID);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
