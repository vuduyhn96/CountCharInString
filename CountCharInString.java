import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char targetChar = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + targetChar + "' trong chuỗi là: " + count);
        scanner.close();
    }

}
