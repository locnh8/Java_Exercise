/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 15/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao mot so: ");
        int number = scanner.nextInt();

        //Khai báo các biến cần thiết.
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        // Đếm số lượng chữ số của số đã nhập
        while (originalNumber != 0) {
            digits++;
            originalNumber /= 10;
        }
        // Đặt lại giá trị của originalNumber về số ban đầu
        originalNumber = number;
        
        // Đặt lại giá trị của originalNumber về số ban đầu
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, digits);
            originalNumber /= 10;
        }

        // Kiểm tra xem tổng các lũy thừa có bằng với số ban đầu không và in ra kết quả.
        if (sum == number) {
            System.out.println(number + " la mot so Armstrong");
        } else {
            System.out.println(number + " khong phai la so Armstrong");
        }
    }
}