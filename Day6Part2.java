import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sonarp2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = importFile("en.txt");
		int nums = increaseCount(num);
		System.out.print(nums);
	}
	public static ArrayList<Integer> importFile(String fileName){
	    ArrayList<Integer> words = new ArrayList<>();
	    try {
	      File myObj = new File(fileName);
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        int data = myReader.nextInt();
	        words.add(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	    return words;
	  }
	public static int increaseCount(ArrayList<Integer> num) {
		int count = 0;
		for(int i = 0; i < num.size()-3;i++) {
			int a = num.get(i) + num.get(i + 1) + num.get(i + 2);
			int b = num.get(i+1) + num.get(i + 2) + num.get(i + 3);
			if( b > a) {
				count++;
			}
			
		}
		return count;
	}
}
