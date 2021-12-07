import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(isIncreasing(importFile("en.txt")));
  }
//en.txt is the file of integers
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

}
