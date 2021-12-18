import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

	System.out.println(ans(importFile()));
  }
    public static int[][] importFile(){
		Scanner reader = null;
    ArrayList<String> nums = new ArrayList<String>();
		try {
			reader = new Scanner(new File("en.txt")); //en.txt contains lines of random integers ex: 4162893367
			while (reader.hasNext()) {                                                
				nums.add(reader.nextLine());
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("file not found");
		}
		int[][] map = new int[nums.size()][nums.get(0).length()];
		for (int row = 0; row < nums.size(); row++) {
			for (int col = 0; col < nums.get(0).length(); col++) {
				map[row][col] = Integer.parseInt(nums.get(row).substring(col, col + 1));
			}
		}
    return map;
	}

	public static int ans(int[][] map) {
		int sum = 0;
		for (int row = 0; row < map.length; row++) {
			for (int col = 0; col < map[0].length; col++) {
				if (isLowPoint(map, row, col)) {
					sum += 1 + map[row][col];
				}
			}
		}
		return sum;
	}



	public static boolean isLowPoint(int[][] map, int row, int col) {
		int height = map[row][col];
		int up = (row > 0 ? map[row - 1][col] : 9);
		int down = (row <= map.length - 2 ? map[row + 1][col] : 9);
		int left = (col > 0 ? map[row][col - 1] : 9);
		int right = (col <= map[0].length - 2 ? map[row][col + 1] : 9);

		return (height < up && height < down && height < left && height < right);
	}
}
