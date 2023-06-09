package dp;

public class Fibonacci {

    private static int n = 10;
    private static int dp[];

    public static void main(String[] args) {
        dp = new int[n + 1]; // Initialize dp array
        //System.out.println(tdFib(n));

        System.out.println(buFib(n));
    }

    // Top-down approach OR recursive
    private static int tdFib(int n){
        // Step 1: Return base condition if either n=0 or n=1
        if (n==0 || n==1)
            return n;

        // Step 2: Check if result exists in dp then return dp
        if (dp[n] != 0)
            return dp[n];

        // Step 3: Do recursion and set result obtained in dp
        dp[n] = tdFib(n-1) + tdFib(n-2);
        return dp[n];
    }

    // Bottom-up approach OR iterative
    private static int buFib(int n){
        // Step 1 : Initialize array
        dp = new int[n + 1];

        // Step 2: Set base conditions
        dp[0] = 0;
        dp[1] = 1;

        // Step 3: Iterate from 2 -> n
        for (int i = 2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
