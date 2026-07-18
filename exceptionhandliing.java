public class exceptionhandliing {
    public static void main(String[] args){
        int a = 20;
        int b = 20;
        try{
            if(a+b != 50){
                throw new Exception("the input value is wrong");
            }
            System.out.println("the sum is: 50");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
