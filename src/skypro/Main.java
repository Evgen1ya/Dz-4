package skypro;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        System.out.print("Задача 1 \n");
        int i = 0;
        while (i <= 9) {
            i++;
            System.out.print(i + " ");
            if (i == 10) {
                System.out.print("\n");
            }
        }
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // Задача 2
        System.out.print("\n\nЗадача 2\n");
        int n = 4;
        for (; n <= 31; n = n +7) {
            System.out.print("Сегодня пятница, " + n + "-е число. Необходимо подготовить отчет.\n");
        }
        // Задача 3
        System.out.print("\nЗадача 3\n");
        int m = 2021;
        for (int s = 0; s <= m + 100;s = s + 79) {
            if (s >= m - 200){
                System.out.print(s + "\n");
            }
        }
    }
}







