import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.runAllProgramm();
    }

    Random random = new Random();

    void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    void checkSumSign(){
        int a,b;
        a = random.nextInt(100) - 50;
        b = random.nextInt(100) - 50;

        int sum = a + b;

        if (sum >= 0){
            System.out.println("Сумма положительная: " + sum);
        } else {
            System.out.println("Сумма отрицательная: " + sum);
        }
    }

    void printColor(){
        int value;
        value = random.nextInt(1000) - 500;

        if (value <= 0){
            System.out.println("Красный: " + value);
        } else if (value < 100) {
            System.out.println("Жёлтый: " + value);
        } else {
            System.out.println("Зелёненький: " + value);
        }
    }

    void compareNumbers(){
        int a,b;
        a = random.nextInt(100) - 50;
        b = random.nextInt(100) - 50;

        if (a >= b){
            System.out.println("a >= b ( " + a + " >= " + b + " )");
        } else {
            System.out.println("a < b ( " + a + " < " + b + " )");
        }
    }

    void runAllProgramm(){
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
    }
}