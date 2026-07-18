public class variable {
    public static void main(String[] args){ 
        String name = "Aman";                       //in memory separate box called name and inside box saved aman
        int age = 21;                               ///in memory separate box called age and inside box saved 21
        String neighbour = "ram";

        // String freind = "ram";                       // ram is already saved in one of the box in memory
        String friend = neighbour;                      // same ram saved in different box called friend 

        System.out.println(name);
        System.out.println(friend);
        System.out.println(age);

        System.out.println(name.length());              //length of aman(4)
        System.out.println(name.charAt(3));
        
    }
}
