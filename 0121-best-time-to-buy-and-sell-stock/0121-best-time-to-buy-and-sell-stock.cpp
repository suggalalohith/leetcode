class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int minProfit=0;
        int minPrice=prices[0];
        if(prices.empty()) return 0;
        for(int i=1;i<n;i++){
            minProfit = max(minProfit, prices[i] - minPrice);
            minPrice = min(minPrice, prices[i]);

        }
        return minProfit;
        
    }
};