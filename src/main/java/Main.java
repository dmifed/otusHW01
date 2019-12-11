import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DIMA on 11.12.2019.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        List<Integer> reversList = Lists.reverse(list);
        System.out.println(reversList);
    }
}
