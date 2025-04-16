public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //task 2
        System.out.println("Task 2");
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //task 3
        System.out.println("Task 3");
        for(int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //task 4
        System.out.println("Task 4");
        for(int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //task 5
        System.out.println("Task 5");
        for(int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //task 6
        System.out.println("Task 6");
        for(int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //task 7
        System.out.println("Task 7");
        for(int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //task 8
        System.out.println("Task 8");
        int contribution = 0;
        for(int i = 1; i <= 12; i++) {
            contribution = contribution + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + contribution + " рублей");
        }
        //task 9
        System.out.println("Task 9");
        int contributionPercent = 29000;
        int percent = 0;
        for(int i = 1; i <= 12; i++) {
            percent = percent + percent / 100;
            percent = percent + contributionPercent;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + percent + " рублей");
        }

    }
}