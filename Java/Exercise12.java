/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 14/10/2024 
*/

// Khai báo thư viện
import java.util.Random;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        // Tạo đối tượng random để tạo số ngẫu nhiên
        Random random = new Random();
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Tạo các biến cần thiết.
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        // Hiển thị thông báo yêu cầu người dùng đoán số
        System.out.println("Doan mot so trong khoang tu 1 toi 100: ");

        // Vòng lặp cho đến khi người dùng đoán đúng
        while (!win) {
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Qua thap! Thu lan nua nao:");
            } else {
                System.out.println("Qua cao! Thu lan nua nao:");
            }
        }
        // Hiển thị thông báo chúc mừng và số lần đoán
        System.out.println("Chuc mung ban! Ban da doan duoc trong " + numberOfTries + " lan thu");
    }
}