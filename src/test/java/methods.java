
public class methods {
    int a = 5;

    void a() {
        System.out.println("nani");
    }

    void b() {
        System.out.println(5 + 1);
    }

    void d(int i) {
        System.out.println(i + 7);
    }

    void e(int x, int y) {
        System.out.println(x + y);
    }

    int c() {
        return 5;
    }

    void f(int x, float y) {
        System.out.println(x + y);
    }

    void g(int x, float y, char z) {
        System.out.println(x + y + z);
    }

    public static void main(String[] args) {
//          System.out.println(m.a);
//       m.c();
//      int x=();
//         m.d(6);
//         m.e(2,5);
      methods m = new methods();
       m.a();
       m.b();
        m.f(1,2);
        m.g(2, 3, 'v');
//        System.out.println("x is" +x);
//    }
        accessmodifiers am = new accessmodifiers(); //accessmofifiers 
        am.b();
    }
}

