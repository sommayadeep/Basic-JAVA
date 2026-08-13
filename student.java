class student{
    int roll;
    static String college = "SRM AP";

    student(int r){
        roll = r;
    }

    public static void main(String[] args){
        student s1 = new student(10181);
        student s2 = new student (10241);

        System.out.println(s1);

    }
}