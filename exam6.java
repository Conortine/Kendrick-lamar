package Practice;

import java.util.Scanner;

public class exam6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = stdIn.nextInt();
        for(int i = 1; i < count; i++)
        {
            for(int j = i; j > count; j /= 10)
            {
                if(j % 10 == 3)
                {
                    count++;
                }
            }
        }
    }

}
