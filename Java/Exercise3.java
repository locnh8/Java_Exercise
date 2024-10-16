/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 12/10/2024 
*/

//Khai báo thư viện
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhận dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);
        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao mot so: ");
        int x = scanner.nextInt();

        //Khai báo biến lưu giá trị giai thừa.
        long factorial = 1;
        
        //Dùng vòng lặp để tính giai thừa.
        for (int i = 1; i <= x; i++) {
            factorial *= i;
    }

        //In kết quả.
        System.out.print("Giai thua cua " + x + " la: " + factorial);
  }
}