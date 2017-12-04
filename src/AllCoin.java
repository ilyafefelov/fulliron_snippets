import java.util.*;

class AllCoins {
    public static int count;

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);



        int n = in.nextInt();
        int m = in.nextInt();
        int [] coins = new int [m];
        for (int i = 0; i < coins.length-1; i++) {
            int coin = coins[i];

        }

        // for formatting the string outputs
        Map<Integer, String> names = new HashMap<Integer, String>();
        names.put(25, "quarter(s)");
        names.put(10, "dime(s)");
        names.put(5, "nickel(s)");

        // to keep track of the current amounts of each type of coin
        Map<String, Integer> curr = new HashMap<String, Integer>();
        curr.put(names.get(25), 0);
        curr.put(names.get(10), 0);
        curr.put(names.get(5), 0);

        findCoins(n, 0, coins, names, curr);
    }

    /*
        recursive function to print all combinations of coins that sum to goal
        @param left - amount left that we need to sum to with remaining coins
        @param index - index of current coin denomination we are working with
        @param coins - array of coin values
        @param names - map of names for string formatting
        @param curr - current amounts of each type of coin we have
    */
    private static void findCoins(int left, int index, int[] coins, Map<Integer, String> names, Map<String, Integer> curr) {
        // not the last type of coin
        if (index < coins.length - 1) {
            // if we have not reached our goal value yet
            if (left > 0) {
                int coinAmount = coins[index];
                if (coinAmount <= left) {
                    // try all possible numbers of current coin given the amount
                    // that is left
                    for (int i = 0; i <= left / coinAmount; i++) {
                        curr.put(names.get(coinAmount), i);
                        findCoins(left - coinAmount * i, index + 1, coins, names, curr);
                    }
                    // reset the current coin amount to zero before recursing
                    curr.put(names.get(coinAmount), 0);
                }
                // case when there is a coin whose value is greater than the goal
                else {
                    findCoins(left, index + 1, coins, names, curr);
                }
            }
            // we've reached our goal, print out the current coin amounts
            else {
                count++;
            }
        }
        // last type of coin
        else {
            // if we have not reached our goal value yet
            if (left > 0) {
                int coinAmount = coins[index];
                if (coinAmount <= left) {
                    // if the remainder of our goal is evenly divisble by our last
                    // coin value, we can make the goal amount
                    if (left % coinAmount == 0) {
                        // add last coin amount and print current values out
                        curr.put(names.get(coinAmount), left / coinAmount);
                        count++;

                        // reset this coin amount to zero before recursing
                        curr.put(names.get(coinAmount), 0);
                    }
                }
            }
            // we've reached our goal, print out the current coin amounts
            else {
                count++;
            }
        }
    }

    private void printCurr(Map<String, Integer> curr) {
        Iterator<String> iter = curr.keySet().iterator();
        while (iter.hasNext()) {
            String denom = iter.next();
            count++;
        }
        System.out.println(count);
    }
}