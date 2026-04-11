import java.io.*;
public class createfile {
    public static void main(String[] args) {
        try{
            File obj=new File("Filename.txt");
            if(obj.createNewFile()){
                System.out.print("File Created : "+obj.getName());
            }else{
                System.out.println("Already File Name Existed");
            }
        }
        catch(IOException e){
            System.err.println("Error Occur");
            e.printStackTrace();
        }
    }
}
