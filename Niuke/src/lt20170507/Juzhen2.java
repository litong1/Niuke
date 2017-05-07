package lt20170507;

import java.util.ArrayList;

public class Juzhen2 {

	public static void main(String[] args) {
		int[][] matrix = {{1}};
		System.out.println(rotate(matrix).toString());
	}

	private static ArrayList<Integer> rotate(int[][] matrix) {
		int tR = 0;
		int tC = 0;
		int dR = matrix.length - 1;
		int dC = matrix[0].length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		while(tR <= dR && tC <= dC){
		
			printEdge(list,matrix,tR++,tC++,dR--,dC--);
		}
		return list;
				
		
	}

	private static void printEdge(ArrayList<Integer> list,int[][] m, int tR, int tC, int dR, int dC) {
		if(tR == dR){
			for (int i = tC; i <= dC; i++) {
				list.add(m[tR][i]);
			}
		}else if (tC == dC) {
			for (int i = tR; i <= dR; i++) {
				list.add(m[i][tC]);
			}
		}else{
			int curC = tC;
			int curR = tR;
			while(curC != dC){
				list.add(m[tR][curC]);
				curC++;
			}
			while(curR != dR){
				list.add(m[curR][dC]);
				curR++;
			}
			while(curC != tC){
				list.add(m[dR][curC]);
				curC--;
			}
			while(curR != tR){
				list.add(m[curR][tC]);
				curR--;
			}
		}
		
	}
}

