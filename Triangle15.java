import java.util.Scanner;

public class Triangle15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc15.nextInt();
        int i = 1;
        while(i <= N){
            int j = 1;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println("*");
        }
    }
}