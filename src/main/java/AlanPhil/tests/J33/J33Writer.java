package main.java.tests.J33;

import java.io.FileWriter;
import java.io.IOException;

class J33Writer {
    private char flag = 'A';

    synchronized void print(char letter) throws InterruptedException {
        while (letter != flag) wait();
        System.out.print(letter);
        flag = (letter == 'C') ? 'A' : (char) (letter + 1);
        notifyAll();
    }

    synchronized void write(String string) {
        try (FileWriter writer = new FileWriter("1.txt", true)) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
