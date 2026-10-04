package task.manager;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean state = true;

        while (state == true) {
                  Random random = new Random();
        System.out.println("Intro a task to do;");
        Scanner kb = new Scanner(System.in);
        String task = kb.next();
        int task_num = random.nextInt();
        HashMap < Integer, String> tasks = new HashMap < Integer, String>();
        tasks.put(task_num, task);  
        if (task.equalsIgnoreCase("exit")) {
            state = false;
        }

        }

    }
}