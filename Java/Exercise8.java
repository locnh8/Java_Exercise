/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 13/10/2024 
*/

//Khai báo thư viện
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhận dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao mot so: ");
        long number = scanner.nextLong();

        //Khai báo biến sum lưu giá trị.
        long sum = 0;

        //Tính tổng các chữ số của một số.
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        //In kết quả.
        System.out.println("Tong cac chu so cua so do la: " + sum);
    }
}