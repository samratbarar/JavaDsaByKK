package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Power In Java

public class Ques_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number and power to wich it is raised");
        int num = sc.nextInt(), deg = sc.nextInt();

        if (num == 0 && deg == 0) {
            System.out.println("power is not definite");
            sc.close();
            return;
        } else if (num == 0) {
            System.out.println("result = 0");
            sc.close();
            return;
        } else if (deg == 0) {
            System.out.println("result = 1");
            sc.close();
            return;
        }

        double pow = 1;
        
        if (deg > 0) {
            for (int i = 1; i <= deg; i++) {
                pow *= num;
            }
        } else if (deg < 0) {
            for (int i = 1; i <= -deg; i++) {
                pow *= 1.0/num;
            }
        }

        System.out.println("The result = " + pow);

        sc.close();
    }
}
