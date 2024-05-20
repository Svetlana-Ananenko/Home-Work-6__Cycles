public class Main {
    public static void main(String[] args) {
        System.out.println("___Задача №1___");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("___Задача №2___");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("___Задача №3___");
        for (int i = 0; i <= 17; i=i+2) {
            System.out.println(i);
        }

        System.out.println("___Задача №4___");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }


        System.out.println("___Задача №5___");

        for (int i = 1904; i < 2096; i=i+4) {
            System.out.println(i + " год является високосным");
        }


        System.out.println("___Задача №6___");

        for (int i = 7; i <=98; i=i+7) {
            System.out.println(i);
        }


        System.out.println("___Задача №7___");

        for (int i = 1; i <=512; i=i+i) {
            System.out.println(i);
        }

        System.out.println("___Задача №8___");
        int summa = 29000;
        int sediments = 0;

        for (int i = 1; i <= 12; i+=1) {
            sediments = sediments + summa;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sediments + " рублей");
        }


        System.out.println("___Задача №9___");
        int summa2 = 29000;
        int sediments2 = 0;

        for (int i = 1; i <= 12; i+=1) {
            sediments2 = sediments2 + sediments2/100;
            sediments2 = sediments2 + summa2;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sediments2 + " рублей");
        }


        System.out.println("___Задача №10___");
        int two2 = 2;


        for (int i = 1; i <= 10; i=i+1) {
            int results = two2 * i;
            System.out.println( two2 + " * " + i + " = " + results );
        }




























    }
}