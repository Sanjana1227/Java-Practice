import java.io.*;
public class try1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter s=new OutputStreamWriter(System.out);
        String s1="I Love My India";
    
        String str=s1.replaceAll(" ","");
        s.write(str);
        s.flush();
        s.close();
        
    }
}
