class Main{
    private long accno;
    private long mobno;
    private int ifscno;
    public void setName(long accno,long mobno,int ifscno){
        this.accno=accno;
        this.mobno=mobno;
        this.ifscno=ifscno;
    }
    public String getName(){
        return "Account Number :"+accno+" Mobile Number: "+ mobno+" IFSC Code: "+ifscno;
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Main obj =new Main();
        obj.setName(35434567,81240043,345423);
        System.out.println(obj.getName());
    }
}