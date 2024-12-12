import java.io.InputStream;

public class scannerconcept {
    public scannerconcept(InputStream in) {
    }
    public String next() {
        return null;
    }

    public static void main(String[] args) {
        scannerconcept sc = new scannerconcept(System.in);
        System.out.println("enter the value");
//        String i = sc.nextline();
        String i = sc.next();
        System.out.println("pin number" + i);

    }

}
