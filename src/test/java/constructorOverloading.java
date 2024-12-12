public class constructorOverloading {
    constructorOverloading() {
        System.out.println("ram");
    }

    constructorOverloading(int i){
        System.out.println("rajesh");
    }
    constructorOverloading(float b){
        System.out.println("kitty");

    }

    public static void main(String[] args) {
//constructorOverloading co=new constructorOverloading();
constructorOverloading co1=new constructorOverloading(3);
constructorOverloading co2=new constructorOverloading(1.2f);
    }
}
