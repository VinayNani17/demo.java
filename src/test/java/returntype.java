public class returntype {
    int a() {
        System.out.println("return type");
        return 5;
    }
    void b(){
        System.out.println(2);
    }
    float c(){
        System.out.println("return");
        return 1.2f;
    }
    int d(char x,char y){
        return x+y;
    }    public static void main(String[] args) {
     returntype rt=new returntype();
     int x=rt.a();
//     int rt.b();
//        float y=rt.c();
        System.out.println(rt.d('x','y'));
//        System.out.println(x+2);
//        System.out.println(y+2);
    }
}

