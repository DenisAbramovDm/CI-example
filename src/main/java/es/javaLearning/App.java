package es.javaLearning;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        int b = multiplication(a);
        System.out.println("Ваше число, умноженное на десять: " + b);
    }
    public static int multiplication(int a){
        return a * 10;
    }
}
