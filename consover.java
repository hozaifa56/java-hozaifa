class A{
    int val1;
    int val2;
    String first;
    String second;int c; String C;
    A(int a, int b ){
        val1=a;
        val2=b;
        c=val1+val2;
    }

    A(String a, String b){
        first=a;
        second=b;
        C=first+second;
    }

}
public class consover {
    public static void main(String[] args) {
        
        A o2=new A(5, 6);
        A o3=new A("hello ", "Hozaifa");
        System.out.println(o2.c);
        System.out.println(o3.C);

        

    }
}
