import java.util.*;

public class Solution {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();


        System.out.println(findCombinationsCount(n,m));


    }

    private static int findCombinationsCount(int n, int m) {
        if (n < 0) {
            return 0;
        }
        if (m == 0) {
            return 0;
        }

        int dp[] = new int[n + 1];
        dp[0] = 1;
        int vals[]= new int[m];
        vals[0] = 1;

        for (int i = 0; i < m; ++i) {
            for (int j = vals[i]; j <= n; ++j) {
                dp[j] += dp[j - vals[i]];
            }
        }
        return dp[n];
    }



}