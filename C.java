class A {
    void showA(){
        System.out.println("a class member");
    }
}
class B extends A{
    void showB(){
        System.out.println("b class member");
    }
}
class C extends A{
    void showC(){
        System.out.println("c class member");
    }
    public static void main(String[] args) {
        A ob1=new A();
        ob1.showA();

        B ob2=new B();
        ob2.showA();
        ob2.showB();

        C ob3=new C();
        ob3.showA();
      //  ob3.showB();
        ob3.showC();
    }

}
