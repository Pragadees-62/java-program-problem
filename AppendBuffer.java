import java.io.*;
public class AppendBuffer {
  public static void main(String[] args) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt", true))){   
        bw.newLine();                  
      bw.write("Welcomes You");
      System.out.println("Successfully appended to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}