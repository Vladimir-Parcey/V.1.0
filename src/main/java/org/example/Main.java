package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nПутин и Лукашенко лучшие друзья!");
        System.out.println();

        for (int i = 1; i < 101; i++){
            int n;
            if (i%20 >= 10) {
                n = 10- i%10;
            }
            else  {
                n = i%10;
            }
            for (int j = 0; j < n; j++){
                System.out.print(" ");
            }
            System.out.println(i%10);
        }
    }
}
