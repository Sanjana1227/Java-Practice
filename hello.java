public class hello {
    int i;
    void display(hello hd){
        System.out.println("hello");
    }
    void show(){
        display(this);
    }
    public static void main(String[] args) {
        hello hd=new hello();

        hd.show();

    }
}
