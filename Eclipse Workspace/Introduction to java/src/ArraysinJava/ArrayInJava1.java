package ArraysinJava;

public class ArrayInJava1 {
	public static void main(String[]args) {
		/*
		 *2D array
		 * 
		 * */
		int [][]arr = new int [2][2];//2*2->4
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][0] = 30;
		arr[0][1] = 40;
		arr[0][0] = 50;
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); 
			
			
		}
	}

}
