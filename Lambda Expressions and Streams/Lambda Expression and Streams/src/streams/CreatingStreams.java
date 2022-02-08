package streams;

import streams.classestoworkon.Movie;
import streams.classestoworkon.MovieUtil;

import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public void createEmptyStream(){
        Stream<Movie> emptyMovieStream = Stream.empty();

        System.out.println("The size of the stream is: " + emptyMovieStream.count());
    }
    public void createStreamsUsingList(){
        String[] movieNames = new String[]{"avengers", "doctor strangers","squid games","money heist"};
        Stream<String> streamsUsingList = Stream.of(movieNames);

        streamsUsingList.forEach(System.out::println);
    }
    public void createStreamsOfMovieClass(){
        List<Movie> movies = MovieUtil.createMovies();

        movies.forEach(System.out::println);
    }
    public void testGenerateIterateStreams() {
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.forEach(System.out::println);

    }

    public static void main(String[] args) {

        new CreatingStreams().createEmptyStream();
        new CreatingStreams().createStreamsUsingList();
        new CreatingStreams().createStreamsOfMovieClass();
//        new CreatingStreams().testGenerateIterateStreams();
    }
}
