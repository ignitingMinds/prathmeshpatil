package com.company;

public class solution {
    public static int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<coins.length;i++){
            if(amount>0){
                int subAns = coinChange(coins,amount-coins[i]);
                if(subAns != Integer.MAX_VALUE && subAns+1<ans){
                    ans = subAns + 1;
                    System.out.println(ans);
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] coins = {1,2};
        int ans = coinChange(coins,3);
        System.out.println(ans);
    }
}