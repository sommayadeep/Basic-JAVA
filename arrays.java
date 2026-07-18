import java.util.Arrays;
public class arrays {
    public static void main(String[] args){
        int[] marks = new int[3];  //--------------------> [] one dimentional array
        marks[0] = 92;
        marks[1] = 98;
        marks[2] = 82;

        System.out.println(marks);   //garbage value
        System.out.println(marks[0]);  //individula marks
        System.out.println(marks[1]);  //individula marks
        System.out.println(marks[2]);  //individula marks


        System.out.println(marks.length);  //no need to length() as it calls directly in the array

        Arrays.sort(marks);  //pre defined function ---------------------------->"import java.util.Arrays"
        System.out.println(marks[0]);    //print 82 in 0 (after sorting) as in code 82 in the 2 position 



        int[] marks1 = {92,95,85}; //we can also write like that  




        int[][] marksfor2student = {{91,92,93} , {82,84,89}};
        System.out.println(marksfor2student[0][2]);
    }
}
