class MaximumCuts{

// Function that eturns the maximum
// number of rods that can be
// made from the rod of length N
static int cuttingRod(int arr[], int N) {
	int []dp = new int[N + 1];

	// Initializing the number of rods we
	// can make from length 0
	dp[0] = 0;

	// Iterating over lengths that can
	// be formed
	for(int i = 1; i <= N; i++) {
		
		// Initializing the possible
		// cuts as infinite
		dp[i] = Integer.MIN_VALUE;

		// Cutting the desired lengths
		for(int j = 0; j < 3; j++) {
			
			// Checking whether the length of
			// rod becomes 0 or if after cutting
			// the rod, it becomes useless
			if ((i - arr[j]) >= 0 &&
			dp[i - arr[j]] != Integer.MIN_VALUE) {
				
				// Choosing the maximum
				// possible desired
				// length cuts to be made
				dp[i] = Math.max(dp[i - arr[j]] + 1,
								dp[i]);
			}
		}
	}
	return dp[N];
}

// Driver code
public static void main(String[] args) {
	int N = 17;
	int arr[] = { 10, 11, 3 };
	
	System.out.print(cuttingRod(arr, N));
}
}

// This code is contributed by Princi Singh
