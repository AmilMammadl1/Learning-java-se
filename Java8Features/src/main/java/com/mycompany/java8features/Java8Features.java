/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.java8features;

import java.lang.reflect.Array;
import static java.nio.file.Files.find;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author amila
 */
public class Java8Features {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args) {
//        List<String> words = Arrays.asList("SOZ1", "Soz1", "Soz3", "Soz4", "Soz5");
////        for (String word : words) {
////            
////        }
//        words.forEach(System.out::println);
//        //    words.forEach((s)->System.out.println(s));
//        words.forEach((s) -> {
//            System.out.println("s chapa verildi");
//            System.out.println(s);
//        });
//        Optional<String> foundwordOpt = find(words,"soz1");
//        foundwordOpt.ifPresent(System.out::println);
//        if(foundwordOpt.isPresent()){
//            String foundWord = foundwordOpt.get();            
//        }
//        find(words, "soz1").ifPresent(System.out::println);
        //find(words, "soz1").ifPresent(Java8Features::foo);
        //    List<String> words = 

//        Arrays.asList("SOZ1", "Soz1", "Soz3", "Soz4", "Soz5").stream()
//                .filter((word) -> word.equalsIgnoreCase("soz1"))
//                .findFirst()Arrays.asList
//                .ifPresent(Java8Features::foo);
//        Stream.of("SOZ1", "Soz1", "Soz3", "Soz4", "Soz5")
//                .filter((word) -> word.equalsIgnoreCase("soz1"))
//                .findFirst()
//                .ifPresent(Java8Features::foo);
//        Arrays.asList("SOZ1", "Soz1", "Soz3", "Soz4", "Soz5").parallelStream()
//                .filter((word) -> word.equalsIgnoreCase("soz1"))
//                .findAny()
//                .ifPresent(Java8Features::foo);
//        List<String> words = Arrays.asList("SOZ1", "Soz1", "Soz3", "Soz4", "Soz5");
//        List<String> UpperWords = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        List<String> words = Arrays.asList("SOZ1", "Soz1", "Soz3", "Soz4", "Soz5");
//        int result = words.stream()
//                .map(String::length)
//                .reduce(1, (a,b)-> a*b);
//                //.reduce(0, Integer::sum);
//        System.out.println(result);
//        String result = words.stream()
//                .filter((s) -> s.equalsIgnoreCase("soz10"))
//                .findAny()
//                .orElse("not found");
//        
//        System.out.println(result);
//        words.stream()
//                .map((s) -> {
//                    s = s + " soz";
//                    s = s.toUpperCase();
//                    return s;
//                })
//                .forEach(System.out::println);
        // System.out.println(UpperWords);
//        words.stream()
//                .filter((word) -> word.equalsIgnoreCase("soz1"))
//                .findFirst()
//                .ifPresent(Java8Features::foo);
        List<List<String>> words = Arrays.asList(
                Arrays.asList("1-Soz1", "1-soz2", "1-Soz3", "1-Soz4", "1-Soz5"),
                Arrays.asList("2-Soz1", "2-Soz3", "2-Soz4", "2-Soz5"),
                Arrays.asList("3-Soz1", "3-Soz3", "3-Soz4", "3-Soz5")
        );
        List<List<Integer>> l = words.stream()
                .map(list -> list.stream().map(String::length))
                .map(Stream -> Stream.collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(l);

        List<Integer> ll = words.stream()
                .flatMap(list -> list.stream().map(String::length))
                .collect(Collectors.toList());
        System.out.println(ll);
    }

    private static void foo(String s) {
        System.out.println(s);
    }

//    private static Optional<String> find(List<String> words, String s) {
//        for (String word : words) {
//            if (word.equalsIgnoreCase(s)) {
//                return Optional.of(word);
//            }
//        }
//        return Optional.empty();
//    }
    private static Optional<String> find(List<String> words, String s) {
        return words.stream().filter((word) -> word.equalsIgnoreCase(s)).findFirst();
    }
}
