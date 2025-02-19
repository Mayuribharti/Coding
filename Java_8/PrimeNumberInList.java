package Java_8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberInList {
    public static void main(String[] args) {

        List<Integer> ranomList = List.of(3,11,5,2,1,4,3,8,9);

        List<Integer> primeList = ranomList.stream()
                .filter(PrimeNumberInList::isPrime)
                .toList();

        System.out.println("Prime List :"+primeList);

    }

    private static boolean isPrime(Integer n) {

        return  IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0);
        

    }
}