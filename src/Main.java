import java.util.Scanner;

public class Main {
    public static void voterAge(int age){
        if (age > 18){
            System.out.println("Yes... You are eligible for vote");
        }else {
            System.out.println("No... You are not eligible for vote");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        voterAge(age);
    }
}