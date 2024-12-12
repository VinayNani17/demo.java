public class variablescope {
    int a=0; // instance variable
static int si=4; //static  variable
    public static void main(String[] args) {
        int c=9;  //local variable
        variablescope vs=new variablescope();
        System.out.println(vs.a);
        System.out.println(vs.b);
        System.out.println(variablescope.si);
    }
int b=1;
}
