package HW3;

public class Pizza {
    public static void main(String[] args) {
        int a = 28;
        int b = 24;
        double square1 = (a * a) /(4 * 3.14);
        double square2 = (b * b) /(4 * 3.14);
        double kcal1 = square1 * 40;
        double kcal2 = square2 * 40;
        double diff = kcal1 - kcal2;
        System.out.println("Если вы закажете пиццу диаметром 28 см вместо 24 см, то лишнее количество употреблённых каллорий составит: " + diff);


    }
}
