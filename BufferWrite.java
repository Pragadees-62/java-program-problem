import java.io.*;
public class BufferWrite{
  public static void main(String[] args) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"))) {
      bw.write("   ROSSIE");
      bw.newLine();
      bw.write("   DUKE");
      bw.newLine();
      bw.write("   250");
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}