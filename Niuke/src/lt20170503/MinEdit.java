package lt20170503;
/**
 * 最小编辑代价
 * @author litong
 *
 */
public class MinEdit {

	public static void main(String[] args) {
		String str1 = "ab12cd3";
		String str2 = "abcdf";
		int ic = 5;
		int dc = 3;
		int rc = 2;
		System.out.println(minCost1(str1,str2,ic,dc,rc));
	}

	private static int minCost1(String str1, String str2, int ic, int dc, int rc) {
	
		if(str1 == null || str2 == null){
			return 0;
		}
		char[] chs1 = str1.toCharArray();
		char[] chs2 = str2.toCharArray();
		int row = chs1.length + 1;
		int col = chs2.length + 1;
		int[][] dp = new int[row][col];
		for (int i = 0; i < row; i++) {
			dp[i][0] = dc * i;
		}
		for (int j = 0; j < col; j++) {
			dp[0][j] = ic * j;
		}
		
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if(chs1[i - 1]==chs2[j - 1]){
					dp[i][j] = dp[i - 1][j - 1];
				}else{
					dp[i][j] = dp[i - 1][j - 1] + rc;
				}
				dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + rc);
				dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + dc);
				
			}
		}
		return dp[row - 1][col - 1];
	}
	
	
}
