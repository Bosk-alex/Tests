package AlanPhil.tests.J33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class J33Main {
    public static void main(String[] args) {

        System.out.println("Task 1:");
        try {
            Files.delete(Paths.get("1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        J33Writer writer = new J33Writer();
        new J33Thread(writer, 'A', "Mother\n");
        new J33Thread(writer, 'B', "Father\n");
        new J33Thread(writer, 'C', "Child\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nTask 2: look to file 1.txt.\n");

        System.out.println("Task 3:");
        J33MFD device = new J33MFD();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " started to print.");
                device.print();
            }).start();
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " started to scan.");
                device.scan();
            }).start();
        }
    }
}