public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*
class Solution {

    private final int MOD = 1000000007;
    //cache
    private int[][][] memo;

    private int combine(int n, int total, int con) {
        if (total >= 2 || con >= 3) return 0;
        if (n == 0) return 1;
        if (memo[n][total][con] != -1) return memo[n][total][con];
        int count = 0;
        //choose P
        count = combine(n - 1, total, 0) % MOD;
        //choose A
        count += combine(n - 1, total + 1, 0) % MOD;
        //choose L
        count += combine(n - 1, total, con + 1) % MOD;
        return memo[n][total][con] = count;
    }

    public int checkRecord(int n) {
        memo = new int[n + 1][2][3];
       for (int[][] array2D : memo) {
            for (int[] array1D : array2D) {
                Arrays.fill(array1D, -1);
            }
        }
        // Return count of combinations of length 'n' eligible for the award.
        return combine(n, 0, 0);
    }
}
 */