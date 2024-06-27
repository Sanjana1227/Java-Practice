import java.util.*;
public class HashSet_prac {
    public static void main(String[] args) {

        HashSet hs=new HashSet();

        hs.add(10);
        hs.add("Sanjana");
        hs.add(10.5);

        System.out.println(hs);

        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
