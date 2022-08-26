import javax.xml.transform.Source;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');

        System.out.println("a" + "b");

        System.out.println((char)('a' + 3));

        System.out.println('a'  + 1);
        //this is same  as  "a" + 1
        // integer will  be converted to Integer that will call toString()

        System.out.println("kshitij" + new ArrayList<>());

        System.out.println("Kshitij" + new Integer(56));

        System.out.println(new Integer(56) + "" + new ArrayList<>());

        // + operator only works for primitives and complex classes only when co
        //ntanicated with string
    }
}
