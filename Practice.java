public class Practice {
    void PracticeA(){
        System.out.println("a class method");
    }

    public static void main(String[] args) {
        Practice ob1=new Practice();
        ob1.PracticeA();

        B ob2 =new B();
        ob2.PracticeA();
        ob2.PracticeB();
   }
}
class B extends Practice {
    void PracticeB(){
        System.out.println("b class method");
    }

    
}
