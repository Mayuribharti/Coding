package Java_8;

import java.util.List;

public class AllStreamMethods {
    public static void main(String[] args) {
        List<Integer> randomlist = List.of(4,2,4,2,3,8);

        // 1. filter() - filters elements based on a predicate
        List<Integer> even = randomlist.stream().filter(i->i%2==0).toList();
        System.out.println("Even Numbers :"+even);

        // 2. map() - applies a function to each element of the stream
        List<Integer> multipleEachNumberBy3 = randomlist.stream().map(i->i*3).toList();
        System.out.println("Multiple Each number by 3 :"+multipleEachNumberBy3);

        // 3. distinct() - returns a stream of distinct elements
        List<Integer> distinctElement = randomlist.stream().distinct().toList();
        System.out.println("Distinct Element : "+distinctElement);

        // 4. forEach() - performs an action for each element
        System.out.println("printing out the element");
        randomlist.forEach(System.out::println);

        //5.  sorted() - sorts the elements of the stream
        List<Integer> sortedElement = randomlist.stream().sorted().toList();
        System.out.println("sorted elements :"+sortedElement);

        // 6. limit() - truncates the stream to a specified size
        List<Integer> startingThreeData = randomlist.stream().limit(3).toList();
        System.out.println("Starting three data : "+startingThreeData);

        //7. skip() - skips a specified number of elements
        List<Integer> skip2Data = randomlist.stream().skip(3).toList();
        System.out.println("Skip two data : "+skip2Data);

        // 8. anyMatch() - checks if any element satisfies the given predicate
        boolean isContainEven = randomlist.stream().anyMatch(i->i%2==0);
        System.out.println("isContainEven :"+isContainEven);

        // 9. allMatch() - checks if all elements satisfy the given predicate
        boolean isAllEven = randomlist.stream().allMatch(i->i%2==0);
        System.out.println("isAllEven :"+isAllEven);

        //10. reduce() - performs a reduction on the elements of the stream
        int sum = randomlist.stream().reduce(0,Integer::sum);
        System.out.println("Sum :"+sum);

















    }
}
