public class statics {
    int a = 10;
    int b = 20;
    static int c = 0;

    void inc(){
        c++;
    }
    
    public static void main(String[] args){
        statics s1 = new statics();
        statics s2 = new statics();

        s1.inc();
        s2.inc();

        System.out.println("a = " + s1.a);
        System.out.println("b = " + s2.b);
        System.out.println("c = " + c);
    }
}
