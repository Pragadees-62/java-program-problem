class Main{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;
    public void pubshow(){
        System.out.println(a);
    }
    private void prishow(){
        System.out.println(b);

    }
    protected void proshow(){
        System.out.println(c);
    }
    void defshow(){
        System.out.println(d);
    }
    public void callprivate(){
        prishow();
    }
}
public class modifier {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.pubshow();
        // obj.prishow();
        obj.proshow();
        obj.defshow();
        obj.callprivate();
    }
}
