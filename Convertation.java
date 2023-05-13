package HW3;

import java.util.Scanner;

public class Convertation {
    public static void main(String[] args) {
        Scanner baks = new Scanner(System.in);
        System.out.println("Введите сумму в Евро: ");
        String evro = baks.nextLine();
        double e = Integer.parseInt(String.valueOf(evro));
        double d = e * 1.09;
        System.out.println("Результат конвертации в Долларах(США): " + d);
    }
}
