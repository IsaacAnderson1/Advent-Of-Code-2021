import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {



  public static void main(String[] args) {
    System.out.println(isIncreasing(importFile("en.txt")));
    partB(importFile("en.txt"));  //en.txt is the input of regular integers
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

 public static int isIncreasing(ArrayList<Integer> nums){
   int count = 0;
   for(int i = 0; i < nums.size()-1; i++){
    if(nums.get(i) < nums.get(i+1)){
      count++;
    }
   }
   return count;
 }


    public static void partB(ArrayList<Integer> nums){
    int increases = 0;
		int sum1 = nums.get(0) + nums.get(1) + nums.get(2);

		for (int i = 1; i <= nums.size() - 3; i++) {
			int sum2 = nums.get(i) + nums.get(i + 1) + nums.get(i + 2);
			if (sum2 > sum1)
				increases++;
			
			sum1 = sum2;
		}
		System.out.println(increases);
	}
}
