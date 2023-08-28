
public class factorial {
    static int fact(int x){
        if(x==0||x==1)
            return 1;
        else
            return x*fact(x-1);
        
    }   
    public static void main(String[] args) {
        int number =5;
        
        int result=fact(number);
        System.out.println(result);
        
        
    }
}
