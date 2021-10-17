import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int count = 0;

        while (count < t) {
            String vilao = scan.next();

            if(1 < vilao.chars().count() && vilao.chars().count() < 26){
                System.out.println("Y");
            } else{
                System.out.println("N");
            }
            count++;
        }
    }
}