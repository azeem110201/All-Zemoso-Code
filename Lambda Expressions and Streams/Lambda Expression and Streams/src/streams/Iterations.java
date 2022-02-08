package streams;

import streams.classestoworkon.Movie;
import streams.classestoworkon.MovieUtil;

import java.util.List;

public class Iterations {
    public void iterateClassicMovies(){
        List<Movie> movies = MovieUtil.createMovies();
        movies.parallelStream()
                .filter(Movie::isClassic)
                .limit(2)
                .map(Movie::getName)
                .forEach(System.out::println);
    }

    public void iterateClassicMovieInClassicWay(){
        List<Movie> movies = MovieUtil.createMovies();
        int counter = 0;
        for(Movie movie: movies){
            if(movie.isClassic){
                System.out.println(movie.name);
                counter++;
            }
            if(counter >= 2){
                break;
            }
        }
    }

    public static void main(String[] args) {
        new Iterations().iterateClassicMovies();  //using streams
        new Iterations().iterateClassicMovieInClassicWay();   //using classic for loop
    }
}
