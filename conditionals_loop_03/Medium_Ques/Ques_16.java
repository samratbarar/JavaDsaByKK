package conditionals_loop_03.Medium_Ques;

import java.util.*;

// Reverse A String In Java

public class Ques_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str = sc.nextLine();

        char[] arrStr = new char[str.length()];
        
        for (int i = 0; i < str.length()/2; i++) {
            arrStr[i] = str.charAt(str.length()-1-i);
            arrStr[arrStr.length-1-i] = str.charAt(i);
        }

        str = new String(arrStr);

        System.out.println("The reversed string is " + str);

        sc.close();
    }
}
