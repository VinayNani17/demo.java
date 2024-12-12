public class accessmodifiers {

 int x=1;
 void b(){
        System.out.println("ram");}
}
class example {
    public void main(String[] args) {
        accessmodifiers am = new accessmodifiers();
//        System.out.println(am.x);
   am.b();
    }
}