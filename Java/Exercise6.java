/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 13/10/2024 
*/

//Khai báo thư viện
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhận dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao mot chuoi hoac mot so: ");
        String input = scanner.nextLine();
        
        //Đảo ngược chuỗi.
        String reversedInput = new StringBuilder(input).reverse().toString();

        //Kiểm tra Palindrome và in kết quả.
        if (input.equals(reversedInput)) {
            System.out.println(input + " la Palindrome");
        } else {
            System.out.println(input + " khong la Palindrome");
        }
    }
}

