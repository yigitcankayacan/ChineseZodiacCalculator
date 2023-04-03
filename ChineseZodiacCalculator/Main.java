import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        String msg = "Your Chinese Zodiac Sign: ";
        System.out.print("Please enter your birth year:");
        age = scanner.nextInt();
        double result = age % 12;


        if (result == 0) {
            System.out.println(msg + "Maymun");
        } else if (result == 1) {
            System.out.println(msg + "Horoz");
        } else if (result == 2) {
            System.out.println(msg + "Köpek");
        } else if (result == 3) {
            System.out.println(msg + "Domuz");
        } else if (result == 4) {
            System.out.println(msg + "Fare");
        } else if (result == 5) {
            System.out.println(msg + "Öküz");
        } else if (result == 6) {
            System.out.println(msg + "Kaplan");
        } else if (result == 7) {
            System.out.println(msg + "Tavşan");
        } else if (result == 8) {
            System.out.println(msg + "Ejderha");
        } else if (result == 9) {
            System.out.println(msg + "Yılan");
        } else if (result == 10) {
            System.out.println(msg + "At");
        } else if (result == 11) {
            System.out.println(msg + "Koyun");
        }


    }
}

