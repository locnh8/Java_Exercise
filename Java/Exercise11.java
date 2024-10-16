/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 14/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao mot chuoi: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();

        // Khởi tạo biến đếm cho nguyên âm và phụ âm
        int vowels = 0, consonants = 0;

        //Đếm chữ cái nguyên âm và phụ âm.
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        //Hiển thị kết quả số lượng chữ cái nguyên âm và số lượng chữ cái phụ âm.
        System.out.println("So chu cai nguyen am la: " + vowels);
        System.out.println("So chu cai phu am la: " + consonants);
    }
}
