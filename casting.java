public class casting {
    public static void main(String[] args){
        double price = 100;
        System.out.println(price+18.0);

        int price1 = 100;
        int finalprice = (int)(price1 + 18.0) ;  //casting changing float to int
        System.out.println(finalprice);


        //----------------------------------CONSTANTS------------------------------------
        // float pi = 3.14F;
        // pi = 1.1F;  // dont get error as the PI value is not fixed 

        final float pi = 3.14F;
        // pi=1.1F ---------------------> //getting error as it was fixed 



       // --------------------MAX, MIN------------------------

       System.out.println(Math.max(21,1));
       System.out.println(Math.min(21,1));
       System.out.println(Math.random());  //less then 1
       System.out.println((int)Math.random());  //always get 0 as 0 is less then 1

    }
}
