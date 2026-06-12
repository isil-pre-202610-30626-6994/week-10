
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("Jorge");
        list.add("Marcos");
        list.add("Maria");
        list.add("Carlos");
        list.add("Ana");
        list.add("Lucia");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
