/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 16/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao mot van ban: ");
        String message = scanner.nextLine();

        System.out.print("Nhap gia tri dich chuyen: ");
        int shift = scanner.nextInt();

        // Mã hóa và giải mã văn bản sử dụng giá trị dịch chuyển
        String encryptedMessage = encrypt(message, shift);
        String decryptedMessage = decrypt(encryptedMessage, shift);

        // In kết quả văn bản đã mã hóa và giải mã
        System.out.println("Van ban duoc ma hoa: " + encryptedMessage);
        System.out.println("Van ban duoc giai ma: " + decryptedMessage);
    }

    // Phương thức mã hóa văn bản bằng Caesar Cipher
    public static String encrypt(String message, int shift) {

         // Tạo StringBuilder để lưu kết quả mã hóa
        StringBuilder encrypted = new StringBuilder();

        // Duyệt qua từng ký tự của văn bản để tiến hành mã hóa.
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }
            encrypted.append(c);
        }

        // Trả về chuỗi đã mã hóa
        return encrypted.toString();
    }

    // Phương thức giải mã văn bản bằng cách sử dụng lại hàm mã hóa nhưng dịch ngược lại
    public static String decrypt(String message, int shift) {
        return encrypt(message, 26 - shift);
    }
}
