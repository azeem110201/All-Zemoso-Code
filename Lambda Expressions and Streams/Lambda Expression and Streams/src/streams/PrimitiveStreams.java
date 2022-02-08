package streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public void primitiveIntegerStream(){
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStreams = IntStream.of(nums);

        intStreams.forEach(System.out::println);
    }

    public void primitiveDoubleStream(){
        double[] nums = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        DoubleStream doubleStreams = DoubleStream.of(nums);

        doubleStreams.forEach(System.out::println);
    }
    // also you can convert one datatype to another using mapTo<DataType>. For Ex: mapToInt, mapToDouble
    public static void main(String[] args) {
        new PrimitiveStreams().primitiveIntegerStream();
        new PrimitiveStreams().primitiveDoubleStream();
    }
}
