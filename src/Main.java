import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number,total=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sayi giriniz : ");
        number = scanner.nextInt();

        while ((number % 2 == 0)){
            if(number % 2 == 0 && number % 4 == 0){
                total = total + number;
            }
            number = scanner.nextInt();
        }
        System.out.println("Total is :" + total);
    }
}