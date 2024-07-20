public class Multi_array {
    
	public static void main(String[] args) {

		int[] oneDimensionalArray = {12, 49, 922}; 
		System.out.println(oneDimensionalArray[1]);
		
		int[][] multi_Array = {{12, 49, 922}, {23, 56, 78, 12}, {12, 34, 56}};
		
		System.out.println(multi_Array[1][3]);
		System.out.println(multi_Array[2][1]);
		
		double[][] doublearray = new double[4][2];
		
		doublearray[3][1] = 2.6;
		System.out.println(doublearray[3][1]);
		
		for(int array=0; array < multi_Array.length; array++) {
			for(int item=0; item < multi_Array[array].length; item++) {
				System.out.print(multi_Array[array][item] + "\t");
			}
			System.out.println();
		}
	}
}
