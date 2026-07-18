import java.util.Scanner;

import javax.lang.model.element.Name;
public class input {
    public static void main(String[] args){
        // how to write an inpu
        Scanner sc = new Scanner (System.in);      //import java.util.scanner  
        System.out.print("Input your age : ");
        int age = sc.nextInt();  //nextint for to store integer // nextFloat for storing float value
    



        Scanner sc1 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc1.next();  //next only take tockens (SINGLE WORD)


        Scanner sc2 = new Scanner(System.in);
        System.out.print("enter the line: ");
        String line = sc2.nextLine();
        System.out.println(line);

        
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(line);

    }
}
