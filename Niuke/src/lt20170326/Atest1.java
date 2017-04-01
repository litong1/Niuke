package lt20170326;

public class Atest1 {

	public static void main(String[] args) {

		int[] A = {461,533,323,533,320,191,167};
		System.out.println(calcMonoSum(A, 7));
	}

	public static int calcMonoSum(int[] A, int n) {
		int sum = 0;
		int total = 0;
		for (int i = 0; i < A.length; i++) {
			sum = 0;
			for (int j = 0; j < A.length; j++) {				
				if(j<i){
					if(A[j] <= A[i]){					
						sum += A[j];						
					}
				}
			}
			System.out.println(sum);
			total +=sum;
		}
		return total;
	}
}
