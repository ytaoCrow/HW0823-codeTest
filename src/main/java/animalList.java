import java.util.*;
import java.util.stream.Collectors;

public class animalList {
    public static void main(String[] args) {
        //constructor
        List<Map<String, String>> animalList = List.of(
                Map.of("ocean", "shark"),
                Map.of("ocean", "jelly fish"),
                Map.of("ocean", "whale"),
                Map.of("land", "bear"),
                Map.of("land", "moose"),
                Map.of("swamp", "heron"),
                Map.of("swamp", "frog")
        );
        //logic
        //順便學一下怎麼用併發流
        Map<String,List<String>> newAnimalList =
                animalList.parallelStream()
                          .flatMap(m -> m.entrySet().parallelStream())
                          .collect(Collectors
                                  .groupingBy(
                                          Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));


        //print
        newAnimalList.forEach((k,v)-> {
            System.out.println(k + " : " + v);
        });
    }

}
