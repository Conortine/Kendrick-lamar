package Practice;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 : ");
        int age = sc.nextInt();

        if(age >= 20 && age <30){
            System.out.print("20대시군요");
        }
        else if(age >= 10 && age <20) {
            System.out.print("10대시군요");
        }
        else if(age >= 30) {
            System.out.print("나이가 있으시군요");
        }
        else {
            System.out.print("어린이군요");
        }
    }

}
