package lt20170321;

public class Atest2 {

	public static void main(String[] args) {
		
	}
	 /**
     * 计算你能获得的最大收益
     * 
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
    	int len = prices.length;
    	if(len==2){
    		if(prices[0] >= prices[1]){
    			return 0;
    		}else{
    			return prices[1]-prices[0];
    		}
    	}
    	
		return 0;

        
    }
}
