package streams.operations;

import streams.classestoworkon.Movie;
import streams.classestoworkon.MovieUtil;
import streams.classestoworkon.Trade;
import streams.classestoworkon.TradeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Collecting {
    List<Trade> trades = TradeUtil.createTrades();
    public void collectIntoList(){
        List<Trade> tradeList = trades.parallelStream()
                .collect(Collectors.toList());

        tradeList.forEach(System.out::println);

    }

    public void collectIntoSet(){
        Set<Trade> tradeSet = trades.parallelStream()
                .collect(Collectors.toSet());

        tradeSet.forEach(System.out::println);
    }

    public void collectIntoMap(){
        List<Movie> movies = MovieUtil.createMovies();
        Map<String, Movie> movieMap =
                movies.stream().collect(toMap(Movie::getName, movie -> movie));

        System.out.println(movieMap);
    }
    public static void main(String[] args) {
        new Collecting().collectIntoList();
        new Collecting().collectIntoMap();
    }
}
