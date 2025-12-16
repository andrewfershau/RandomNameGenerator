import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    Random r = new Random();
    String fileName = "names.txt";

    int element;
    int counter = 0;
    char again = 'Y';
    ArrayList<String> names = new ArrayList<>();
    File nameFile = new File(fileName);
    try {
      Scanner fileIn = new Scanner(nameFile);

      while (fileIn.hasNextLine()) {
        String temp = fileIn.nextLine();

        names.add(temp);

      }
      fileIn.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // print complete list, randomized
    while (names.size() > 0) {
      counter++;
      System.out.print(counter + ". ");
      element = r.nextInt(names.size());
      System.out.println(names.get(element));
      names.remove(element);
    }

    /*
     * old version - names one at a time
     * 
     * while(again=='Y'){ element = r.nextInt(names.size()); System.out.println(
     * names.get(element) );
     * 
     * names.remove(element);
     * 
     * 
     * if(names.size()>=1){ System.out.print("Again? (Y/N): "); again =
     * ((in.next()).toUpperCase()).charAt(0); }else{
     * System.out.println("Everybody's been selected!"); again = 'N'; }
     * 
     * }
     */

    System.out.println("\nEnd of processing");
  }
}
