class a{
    public int m1(){
        return 5;
    }
}
class b extends a{
    public int m1(){
        return 10;
    }
}
public class ovrd {
    public static void main(String[] args) {
        a o1=new a();
        b o2=new b();
        int res1=o1.m1();
        int res2=o2.m1();
        System.out.println("i am in base class "+res1);
        System.out.println("i am in sub class "+res2);


    }
}
