import java.util.Scanner;
public class breakandcontinue {
    public static void main(String[] args){
        System.out.print("enter: ");
        Scanner sc = new Scanner(System.in)  ;
        int numbers = sc.nextInt();
        if (numbers > 20){
            for ( ; numbers <100; numbers ++){
                if(numbers == 29){
                    continue;
                }
                else if (numbers == 36){
                    break;
                }
            System.out.println(numbers);
            
            }
        }
    else{
            System.out.println("greater then 34");
        }
        sc.close();
    }
}
