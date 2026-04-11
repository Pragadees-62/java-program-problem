import java.io.*;
import java.util.*;
public class DeleteFile {
    public static void main(String[] args) {
        File obj =new File("Filename.txt");
        if(obj.delete()){
            System.out.println("File Name: "+obj.getName());
        }else{
            System.out.println("Already File Has been Deleted");
        }
    }
}
