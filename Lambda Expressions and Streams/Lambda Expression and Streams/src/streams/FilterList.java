package streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(88);
        marks.add(67);
        marks.add(49);
        marks.add(38);
        marks.add(65);

        //imperative technique

//        for(int i = 0; i < marks.size(); i++){
//            if(marks.get(i) >= 50){
//                System.out.println("Pass");
//            }
//            else{
//                System.out.println("Fail");
//            }
//        }


        //declarative technique using streams

        marks = marks.stream()
                .filter(mark -> mark >= 50)
                .collect(Collectors.toList());

        marks.forEach(System.out::println);
    }
}
