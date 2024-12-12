public class inheritance2{
    int a=1;
    void a(){
        System.out.println("ram");  // multi level inheritance
    }
}
class child1 extends inheritance2{
    int b=2;
    void b(){
        System.out.println("hanuman");
    }
}
class child2 extends child1 {
    int c = 3;

    void c() {
        System.out.println("seetha");
    }

    public void main(String[] args) {
        child2 c2 = new child2();
        c2.c();
        c2.b();
        c2.a();
    }
}
