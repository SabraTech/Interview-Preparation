boolean subsetSum(int[] arr) {
    int[][] mem = new int[arr.length][100001];
    int sum = 0;
    for(int a : arr){
        sum += a;
    }
    if(sum % 2 != 0){
        return false;
    }
    for(int i = 0 ; i < arr.length ; i ++){
        Arrays.fill(mem[i] , -1);
    }
    return subsetSumHelper(arr,0,mem,sum/2) == 1;
}

int subsetSumHelper(int[] arr , int idx , int[][] mem , int targetSum){
    if(targetSum < 0)return 0;
    if(idx == arr.length){
        if(targetSum == 0){
            return 1;
        }
        return 0;
    }
    if(mem[idx][targetSum] != -1){
        return mem[idx][targetSum];
    }
    int choice1 = subsetSumHelper(arr,idx+1,mem,targetSum - arr[idx]);
    int choice2 = subsetSumHelper(arr,idx+1,mem,targetSum);
    return mem[idx][targetSum] = Math.max(choice1 , choice2);
}

// here if you want to print the indices of the subset;
void printSubsetSumHelper(int[] arr , int idx , int[][] mem , int targetSum,ArrayList<Integer> answer){
    if(targetSum < 0)return;
    if(idx == arr.length){
        return ;
    }
    int choice1 = subsetSumHelper(arr,idx+1,mem,targetSum - arr[idx]);
    if(choice1 == mem[idx][targetSum]){
        answer.add(idx);
        printSubsetSumHelper(arr,idx+1,mem,targetSum-arr[idx],answer);
    }else{
        printSubsetSumHelper(arr,idx+1,mem,targetSum,answer);
    }
}

// Or
// ============================================================================

boolean subsetSum(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    if(sum % 2 != 0) return false;
    boolean[][] visited = new boolean[arr.length+2][sum/2+2];
    boolean[][] dp = new boolean[arr.length+2][sum/2+2];
    return subset(arr, 0, sum/2, dp, visited);
}
boolean subset(int[] arr, int i, int sum, boolean[][] dp, boolean[][] visited) {

    if(visited[i][sum]) return dp[i][sum];
    visited[i][sum] = true;
    if(sum == 0)
        return dp[i][sum] = true;
    if(i >= arr.length) {
        return  dp[i][sum] = false;
    }
    if( sum - arr[i] < 0){
      return  dp[i][sum] = subset(arr,i+1,sum,dp,visited);
    }
    return  dp[i][sum] = subset(arr,i+1,sum-arr[i],dp,visited) || subset(arr,i+1,sum,dp,visited);
}
