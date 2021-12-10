import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(part1(importFile("en.txt")));  //en.txt is a text file of instructions on each line similar to "forward 6"
  }

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

 public static int part1(ArrayList<String> text) {
		int horizontal = 0, depth = 0;
		for (String str : text) {
			String[] s = str.split(" ");
			if (s[0].equals("forward")) {
				horizontal += Integer.parseInt(s[1]);
			} else if (s[0].equals("down")) {
				depth += Integer.parseInt(s[1]);
			} else if (s[0].equals("up")) {
				depth -= Integer.parseInt(s[1]);
			}
		}
    return horizontal * depth;
 }
}
