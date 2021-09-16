public class Array {
	public static void main(String[] args) {
	int[][] num = { {9, 8, 7,}, {6, 5, 4, 3, 2, 1} };
	for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num[i].length; j++) {
			System.out.println(num[i][j]);
			}
		}
	}
}