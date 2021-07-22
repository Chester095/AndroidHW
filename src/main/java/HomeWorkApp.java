public class HomeWorkApp {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign() {
        int a = 1, b = 2;
        if (a + b >= 0) System.out.println("Сумма положительная\n");
        else System.out.println("Сумма отрицательная\n");
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) System.out.println(ANSI_RED + "Красный\n" + ANSI_RESET);
        else if (value > 0 && value <= 100) System.out.println(ANSI_YELLOW + "Желтый\n" + ANSI_RESET);
        else System.out.println(ANSI_GREEN + "Зеленый\n" + ANSI_RESET);
    }

    public static void compareNumbers() {
        int a = 1, b = 0;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
