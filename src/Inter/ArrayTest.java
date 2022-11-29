package Inter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTest {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,4,22,5,26,22,5,4);

        System.out.println(list.stream().distinct().collect(Collectors.toList()));



    }
}
