package streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalType {
    public void Attendees(){
        List<Integer> nums = Arrays.asList(22, 32, 42, 52);
        Optional<Integer> sumOfListElements = nums.parallelStream()
                .reduce(Integer::sum);

        System.out.println(sumOfListElements.get());
    }

    public void noAttendees(){
        List<Integer> nums = Arrays.asList();
        Optional<Integer> sumOfListElements = nums.parallelStream()
                .reduce(Integer::sum);
        sumOfListElements.ifPresent(System.out::println);
    }
    public static void main(String[] args) {
        new OptionalType().Attendees();
        new OptionalType().noAttendees();   // will not print anything
    }
}
