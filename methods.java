public class methods {

    public static void age(){
        System.out.println("My age is 20");
    }

    public static void name(String name){
        System.out.println(name);
    }

    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        // dont need to write my age again again directly call the age function
        age();
        age();

        name("Deep");
        name("Bishal");

        sum(10,20);
        sum(40,50);
    }
}
