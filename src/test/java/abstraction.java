
abstract class ab {
    void a() {
        System.out.println("concrete method a");
    }

//    void b() {
//        abstract void c;
//        ();

        class abstraction extends ab {   //concrete class
            public void main(String[] args) {
                System.out.println("concrete method c");
//         ab x=new ab(); we cannot create object
                abstraction y = new abstraction();
                y.a();
//                y.b();
            }
        }
    }
