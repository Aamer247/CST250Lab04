package lab04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myGrid = { {1,7,3,4}, {12,6,7,8}, {57,15,478,023}};

		printMaxOfEachRow(myGrid);
	}
	public static void printMaxOfEachRow(int[][] inputArray) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < inputArray.length; i++) {
			max = Integer.MIN_VALUE;
			for(int j = 0; j < inputArray[i].length; j++) {
				if(inputArray[i][j] > max) {
					max = inputArray[i][j];
				}
			}
			System.out.println("Max at row " + i + " is : " +max);
		}
	}

}
