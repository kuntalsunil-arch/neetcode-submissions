class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int l=0;
        int r =l+1;

        while(r<prices.length){
            if(prices[r] > prices[l]){
                p = Math.max(prices[r]-prices[l],p);
                r++;
            }else{
                l=r;
                r++;
            }
           
        }
        return p;
    
    }

    }

