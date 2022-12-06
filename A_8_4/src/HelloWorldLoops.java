import java.awt.*;

public class HelloWorldLoops {
    public static void HelloWorldWhile(int n){
        int i = 0;
        while (n > i) {
            System.out.println("Hello World!");
            i++;
        }
    }

    public static void HelloWorldDoWhile(int n){
        int i = 0;
        do{
            System.out.println("Hello World!");
            i++;
        }while (n > i);
    }

    public static void HelloWorldFor(int n){
        for(int i = 0; i < n; i++){
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        int iterations = 5;
        System.out.println("While-loop:");
        HelloWorldWhile(iterations);
        System.out.println("Do-while-loop:");
        HelloWorldDoWhile(iterations);
        System.out.println("For-Loop:");
        HelloWorldFor(iterations);
    }
}