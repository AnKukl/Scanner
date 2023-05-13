package HW3;

import java.util.Scanner;

public class Scanners3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String word1 = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String word2 = scanner.nextLine();
        int l1 = word1.length();
        int l2 = word2.length();
        System.out.println(word1.substring(0, l1/2) + word2.substring(l2/2, l2));


    }
}
