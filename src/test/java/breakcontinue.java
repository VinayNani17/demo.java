public class breakcontinue {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++)
        {
            System.out.println(i);
            if(i==3){
                System.out.println("i is 3");
                break;
            }
            System.out.println("out of the loop");
            continue;
        }
    }
}
