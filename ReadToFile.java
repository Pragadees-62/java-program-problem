import java.io.*;
import java.util.Scanner;
public class ReadToFile {
    public static void main(String[] args) {
        File obj =new File("Filename.txt");
        try(Scanner sc=new Scanner(obj)){
            while(sc.hasNextLine()){
                String data =sc.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.err.println("Error Occur");
            e.printStackTrace();
        }
    }
}
