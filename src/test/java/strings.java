import java.util.Locale;

public class strings {
    public static void main(String[] args) {
        String s = "nani";
        String s1 = new String("kitty");
        System.out.println(s.hashCode());
        s = "naresh";
//        System.out.println(s1.hashCode());
        System.out.println(s);
        System.out.println(s.hashCode());
        s = "rakesh123";
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.charAt(0));  // first character
        System.out.println(s.charAt(5));  // last character
        System.out.println(s.contains("rak"));  // contains methods shows true or false
        System.out.println(s.startsWith("r"));  // its showing only boolean
        System.out.println(s.endsWith("h"));  //its showing only boolean
        System.out.println(s.equals("rakesh123"));
        System.out.println(s.equalsIgnoreCase("RAKESH123"));
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(3));
        System.out.println(s.concat("\tameerpet"));
        System.out.println(s.replace("123", "143"));
        // System.out.println(s.toCharArray());  // its changing char toa array we have to store new variable
        char[] c = s.toCharArray();
//        for(int i=0;i< c.length;i++){  //we get print vertical out
//            System.out.println(c[i]);
        for (char j : c) {     // we get print vertival in for each loop
            System.out.println(j);
        String[] d=s.split("h");  //saparate or divide the string
        System.out.println(d[1]);
        }
    }
}