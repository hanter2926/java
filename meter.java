public class meter {
    int x; int y;           
    
    meter(int p, int q){
        x=p; y=q;

    }
    void show()
    {
     System.out.println(x + " "+ y);   

    }
}
class test{
    public static void main(String[] args){
        meter r; r=new meter(100,200); 
        r.show();
    }

}
