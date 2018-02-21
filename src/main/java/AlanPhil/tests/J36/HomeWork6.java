package AlanPhil.tests.J36;

import java.util.Arrays;
import org.slf4j.*;

public class HomeWork6 {
    private static final int SIZE = 30;
    public static final Logger logger = LoggerFactory.getLogger(HomeWork6.class);

    public static void main(String[] args) {
        ArrayTasks tasks = new ArrayTasks();
        DataBase dataBase = new DataBase("school.db");
        logger.info("Start log");
        logger.info(logger.getClass().getName());

        int[] startArray = new int[SIZE];
        for (int j = 0; j < SIZE; j++) startArray[j] = (int) (Math.random() * 10);
        logger.info("Array: " + Arrays.toString(startArray));
        logger.info("SubArray: " + Arrays.toString(tasks.subArray(startArray))+ "\n");

        int[] array = {1, 1, 4};
        logger.info("Array is passed: " + tasks.oneFour(array));

        dataBase.makeDB();
        dataBase.updateDB("100");
        logger.info(dataBase.selectFromDB("20"));
    }
}
