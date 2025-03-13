//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            int capacity = Integer.parseInt(br.readLine());
            String[] valInput = br.readLine().split(" ");
            String[] wtInput = br.readLine().split(" ");

            int[] val = new int[valInput.length];
            int[] wt = new int[wtInput.length];

            for (int i = 0; i < valInput.length; i++) {
                val[i] = Integer.parseInt(valInput[i]);
            }

            for (int i = 0; i < wtInput.length; i++) {
                wt[i] = Integer.parseInt(wtInput[i]);
            }

            System.out.println(Solution.knapsack(capacity, val, wt));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int knapsackRec(int W, int[] val, int[] wt, int n, int[][] memo) {

        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // Check if we have previously calculated the same subproblem
        if (memo[n][W] != -1)
            return memo[n][W];

        int pick = 0;

        // Pick nth item if it does not exceed the capacity of knapsack
        if (wt[n - 1] <= W)
            pick = val[n - 1] + knapsackRec(W - wt[n - 1], val, wt, n - 1, memo);

        // Don't pick the nth item
        int notPick = knapsackRec(W, val, wt, n - 1, memo);

        // Store the result in memo[n][W] and return it
        return memo[n][W] = Math.max(pick, notPick);
    }

    static int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;

        // Memoization table to store the results
        int[][] memo = new int[n + 1][W + 1];

        // Initialize memoization table with -1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++)
                memo[i][j] = -1;
        }

        return knapsackRec(W, val, wt, n, memo);
    }
}
