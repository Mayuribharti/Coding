package Java_8;

import java.util.List;
import java.util.Optional;

public class MaxAndMin {
    public static void main(String[] args) {

        List<Integer> randomList = List.of(3,1,6,4,3,2,1,8,9);

    int max = randomList.stream().reduce(0,Integer::max);
    Optional<Integer> max1 = randomList.stream().reduce(Integer::sum);

    int min = randomList.stream().reduce(0,Integer::min);
    Optional<Integer> min1 = randomList.stream().reduce(Integer::min);

        System.out.println("Max : "+max+"\nMin :"+ min1);



    }
}
