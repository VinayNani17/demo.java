import java.util.TreeSet;

public class collection3 {
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet<String>();
        ts.add("ram");
        ts.add("vamsi");
        ts.add("prasad");
        ts.add("naresh");
        ts.add("naresh");
        ts.add("Naresh");
//        ts.add(null);  // cannot add null values
        System.out.println(ts);
        System.out.println(ts.last());
        System.out.println(ts.first());
        System.out.println(ts.contains("prasad"));
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());;
    }
}
