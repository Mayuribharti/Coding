package Java_8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {

        List<Integer> randomList = List.of(54,5,2,54,2,5,2,1,6);

      Map<Integer,Long> frequency = randomList.stream()
              .collect(Collectors.groupingBy(i->i,Collectors.counting()));

        System.out.println("Frequency : "+frequency);
    }
}
