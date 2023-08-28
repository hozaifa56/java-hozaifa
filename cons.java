//print name and age of 3 students/parametrised constructor
class b{
    String name;
    int age;
    b(String n, int a){
        name=n;
        age=a;
    }
}
public class cons {
    public static void main(String[] args) {
        b student1=new b("hozaifa",21);
        b student2=new b("john",22);
        b student3=new b("shawn",23);
        System.out.println("student 1 = "+ student1.name+" "+student1.age);
        System.out.println("student 2 = " +student2.name+" "+student2.age);
        System.out.println("student 3 = " +student3.name+" "+student3.age);

        System.out.println();
    }
}
