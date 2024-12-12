import java.util.HashSet;

public class collection2 {
    public static <Hashset> void main(String[] args) {  // hash set program
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(7);
        hs.add(5);
        hs.add(0);
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.contains(2));
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove(null));
        System.out.println(hs);
        System.out.println(hs.size());

           String s="nit";
           String[] ss=s.split("");
           for(int i=0;i<ss.length;i++){
               hs.add(Integer.valueOf(ss[i]));
               System.out.println(hs);
           }
    }
}
