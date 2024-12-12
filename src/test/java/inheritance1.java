public class inheritance{
    int x=7;
    void a(){
        System.out.println("hello");  //inheritance
    }
}
class sample extends inheritance{
    int y=5;
    void b(){
        System.out.println("world");
    }
}
class sample1 extends sample{
    int z=9;
    void c(){
        System.out.println("nani");
    }
}
public void main(String[] args) {
    inheritance ih = new inheritance();
    sample s1 = new sample();
    sample1 s2 = new sample1();
    System.out.println(ih.x);
    ih.a();
    System.out.println(s1.y);
    s1.b();
    System.out.println(s2.z);
    s2.c();
}



