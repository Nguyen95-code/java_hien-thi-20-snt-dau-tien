import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter the number: ");
        number = input.nextInt();
        int count = 0;
        int i = 2;
        while (count < number) {
            boolean check = false;
            for (int j = 2; j < Math.round(Math.sqrt(count)); j++) {
                check = count % i == 0;
                if (check) {
                    break;
                }
            }
            if (!check) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
