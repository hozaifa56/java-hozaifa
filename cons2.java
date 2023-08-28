class abc{
    int result;
    abc(int x, int y){
        result=x+y;
    }
    abc(int x, int y, int z){
        result=x+y+z;
    }
}
public class cons2 {
    public static void main(String[] args) {
    abc obj1=new abc(5, 5);
    abc obj2=new abc(5,6,7);
    System.out.println(obj1.result);
    System.out.println(obj2.result);    
    }    
}
