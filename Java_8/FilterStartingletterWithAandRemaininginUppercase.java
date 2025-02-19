package Java_8;

import java.util.List;

public class FilterStartingletterWithAandRemaininginUppercase {
    public static void main(String[] args) {

        List<String> randomList = List.of("Mona","Ravi","Anu","Kuku","Sonu");

        List<String> finalList = randomList.stream().filter(i->i.startsWith("A"))
                .map(String:: toUpperCase)
                .toList();

        System.out.println("Final List  :"+finalList);

    }
}
