import static afu.org.checkerframework.checker.units.UnitsTools.m;

public class methodoverloading {
    void a(){
        System.out.println("nani");
    }
    void a(int x){
        System.out.println("hari");
    }
    void a(int x,int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        methodoverloading md=new methodoverloading();
        md.a();
        md.a(1,2);
    }
}

