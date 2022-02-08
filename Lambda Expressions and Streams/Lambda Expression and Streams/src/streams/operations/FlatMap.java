package streams.operations;

import streams.classestoworkon.Employee;
import streams.classestoworkon.Movie;
import streams.classestoworkon.MovieUtil;

import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
    List<Movie> movies = MovieUtil.createMoviesAndActors();
    String[] fruits = new String[]{"apples","oranges"};
    String[] veggies = new String[]{"beans","peas"};

    public void printAllActors(){
        for(Movie movie: movies){
            for(Employee.Actor actor: movie.getActors()){
                System.out.println(actor);
            }
        }
    }

    public void flatMapMovies(){
        // printAllActors() can also be written using flatmap stream API.

        Stream<Employee.Actor> actorsStream = movies.stream()
                .flatMap(m -> m.getActors().stream());

        actorsStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new FlatMap().printAllActors();
        System.out.println("**********************************************");
        new FlatMap().flatMapMovies();
    }
}
