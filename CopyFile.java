import java.io.*;

public class CopyFile {
  public static void main(String[] args) {
    try (FileInputStream input = new FileInputStream("image.jpg");
         FileOutputStream output = new FileOutputStream("copy.jpg")) {
            System.out.println("File Opened Successfully");
            int i;
            while ((i = input.read()) != -1) {
                output.write(i);  
            }
        System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
    } 
}