import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    part1(importFile("en.txt"));  //en.txt is filled with binary numbers given by the problem.
  }
//en.txt is the file of integers
  public static ArrayList<String> importFile(String fileName){
    ArrayList<String> nums = new ArrayList<>();
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        nums.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return nums;
  }

 public static void part1(ArrayList<String> nums) {
		String gamma = "";
		String epsilon = "";
		for (int col = 0; col < nums.get(0).length(); col++) {
			int ones = 0;
			int zeroes = 0;
			for (int row = 0; row < nums.size(); row++) {
				if (nums.get(row).charAt(col) == '0')
					zeroes++;
				else
					ones++;
			}
			gamma += (ones > zeroes ? "1" : "0");
			epsilon += (ones < zeroes ? "1" : "0");
		}
		System.out.println(Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2));

	}
}
