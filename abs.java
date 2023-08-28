abstract class a{
    abstract void callme();
    void callmetoo(){
        System.out.println("call me too");
    }
}
class b extends a{
    void callme(){
        System.out.println("call me");
    }
}
public class abs {
    public static void main(String[] args) {
        b obj1=new b();
        obj1.callme();
        obj1.callmetoo();
    }
}
