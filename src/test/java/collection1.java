import java.util.ArrayList;

public class collection1 {

    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(8);
        al.add(5);
        al.add(0);
        al.add(9);
        al.add(7);
        System.out.println(al);
        System.out.println(al.get(4));
        System.out.println(al.contains(1));
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(9));
        System.out.println(al.remove(4));
        System.out.println(al.size());

    }
}
