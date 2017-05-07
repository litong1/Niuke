package lt20170507;

public class Juzhen {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(matrix);
	}

	private static void rotate(int[][] matrix) {
		int tR = 0;
		int tC = 0;
		int dR = matrix.length - 1;
		int dC = matrix[0].length - 1;
		while(tR < dR){
			printEdge(matrix,tR++,tC++,dR--,dC--);
		}
				
		
	}

	private static void printEdge(int[][] m, int tR, int tC, int dR, int dC) {
		if(tR == dR){
			for (int i = tC; i <= dC; i++) {
				System.out.println(m[tR][i] + " ");
			}
		}else if (tC == dC) {
			for (int i = tR; i <= dR; i++) {
				System.out.println(m[i][tC] + " ");
			}
		}else{
			int curC = tC;
			int curR = tR;
			while(curC != dC){
				System.out.println(m[tR][curC] + " ");
				curC++;
			}
			while(curR != dR){
				System.out.println(m[curR][dC] + " ");
				curR++;
			}
			while(curC != tC){
				System.out.println(m[dR][curC] + " ");
				curC--;
			}
			while(curR != tR){
				System.out.println(m[curR][tC] + " ");
				curR--;
			}
		}
		
	}
}
