public class inheritance3 {
    void a(){
        System.out.println("ram");  // hirraical level inheritance
    }
}
class child1 extends inheritance3{
    void b(){
        System.out.println("hanuman");
    }
}
class child2 extends inheritance3 {
    void c() {
        System.out.println("seetha");
    }
}

public void main(String[] args) {
    child2 c2=new child2();
    c2.c();
}
