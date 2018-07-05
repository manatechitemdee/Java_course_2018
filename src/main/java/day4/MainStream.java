package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        MainStream p = new MainStream();
        p.start();
    }

    private void start() {
        // TODO Auto-generated method stub
        String[] datas = new String[] {"one","two","Three"};
        Stream<String> stream = Arrays.stream(datas);
   //     stream.forEach(System.out::print);
        //Collection
        List<String> lists = new ArrayList<String>();
        lists.add("One");
        lists.add("Two");
        lists.add("Three");
        Stream<String> stream2 = lists.stream();
  //      stream2.forEach(System.out::print);
        
        List<String> lists2 = new ArrayList<String>();
        lists2.add("One");
        lists2.add("Two");
        lists2.add("Three");
 //       lists2.stream().forEach(System.out::print);
        //Fillter data that start wiht "T"
        List<String> after = new ArrayList<>();
        for (String string : lists) {
            if(string.startsWith("T")){
                after.add(string);
                System.out.println(string);
            }
        }
        //Filter string new 
        System.out.println("Only Filter with T");
        lists.stream().filter(string -> string.startsWith("T")).forEach(System.out::print);
        System.out.println("");
        System.out.println("Only Filter with T and convert to uppercase");
        // filter and convert string to uppercase
        lists.stream().filter(string -> string.startsWith("T")).map(string -> string.toUpperCase()).forEach(System.out::print);
        
        System.out.println("\n+++++++++++++++++++++++++++++++=");
        List<String> result = lists.stream().filter(String -> String.startsWith("T")).map(String -> String.toLowerCase()).collect(Collectors.toList());
        result.forEach(System.out::print);
        System.out.println("\n+++++++++++++++++++++++++++++++=");
    }
}
