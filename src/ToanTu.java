import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        width = scanner.nextFloat();
        System.out.print("Nhap chieu dai: ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println(area);
    }

}
