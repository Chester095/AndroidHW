public class HomeWorkApp {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) throws InterruptedException {
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

    public static void printColor() throws InterruptedException {
        int value = 200;
        if (value <= 0) strPrnt("Красный", "red");
        else if (value > 0 && value <= 100) strPrnt("Жёлтый", "yellow");
        else strPrnt("Зелёный", "green");
    }

    public static void compareNumbers() {
        int a = 1, b = 0;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }



    static void strPrnt(String text, String colour) throws InterruptedException {
        if (colour.equals("red")) System.out.print(ANSI_RED);
        else if (colour.equals("yellow")) System.out.print(ANSI_YELLOW);
        else if (colour.equals("green")) System.out.print(ANSI_GREEN);
        else System.out.println(ANSI_RESET);
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(150);
        }
        Thread.sleep(1000);
        strDel(text);
        strUpperPrnt(text);
        System.out.println(ANSI_RESET+"\n");
    }

    static void strUpperPrnt(String text) throws InterruptedException {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(String.valueOf(text.charAt(i)).toUpperCase());
            Thread.sleep(150);
        }
    }

    static void strDel(String text) throws InterruptedException {
        for (int i = 1; i <= text.length(); i++) {
            System.out.print("\b");
            Thread.sleep(200);
        }
    }


}
