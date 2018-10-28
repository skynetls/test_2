import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите згачение 10, 20 или 30");
        int i = scanner.nextInt();

        if (i==10) {
            System.out.println("Вы ввели 10");
        }
        else if (i==20) {
            System.out.println("Вы ввели 20");
        }
        else if (i==30) {
            System.out.println("Вы ввели 30");
        }
        else {
            System.out.println("Значение некорректно");
        }

        scanner.close();
    }
}
