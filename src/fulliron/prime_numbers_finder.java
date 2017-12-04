package fulliron;

import java.util.Scanner;





import java.util.Scanner;






public class prime_numbers_finder {
    // A function to print all prime factors
    // of a given number n
    public static void primeFactors(int n)
    {
        if (n > 2) {
            if (n == 1) {System.out.print(1);}
            return;
        }
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }


        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }

        System.out.print(n);
    }

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        primeFactors(n);
    }
}
