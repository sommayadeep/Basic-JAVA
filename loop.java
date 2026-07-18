import java.util.Scanner; 
public class loop {
    public static void main(String[] args){

        //for loop
        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }


        //while loop
        int j = 20;
        while(j <= 50){
            System.out.println(j);
            j++;
        }
        


        //Do while
        int k = 100;
        do{
            System.out.println(k);
            k++;
        } while(k < 150);



        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("tell the number");
            number = sc.nextInt();
            System.out.println(number);
            number++;
        } while(number < 10);
        System.out.println("THE END");
    }
    
}
