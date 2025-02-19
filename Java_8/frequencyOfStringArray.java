package Java_8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class frequencyOfStringArray {
    public static void main(String[] args) {

        List<String> randomList = List.of("Mona","Uma","Mona","Ravi");

        Map<String, Long > frequency = randomList.stream()
                        .collect(Collectors.groupingBy(i->i,Collectors.counting()));

        System.out.println("Frequency: "+frequency);
    }

}
