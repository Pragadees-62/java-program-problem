import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {  
  public static void main(String[] args) {  
    try {  
      FileWriter obj = new FileWriter("filename.txt");
      obj.write("               ROSSIE                        ");
      obj.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
} 