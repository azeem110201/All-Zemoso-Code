package streams.classestoworkon;

import streams.classestoworkon.Employee;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public String name = null;
    public boolean isClassic = false;
    public String director = null;
    private List<Employee.Actor> actors = new ArrayList<Employee.Actor>();

    public Movie(String name, boolean isClassic) {
        this.setName(name);
        this.setClassic(isClassic);
    }

    public Movie(String name, boolean isClassic, String director) {
        this.setName(name);
        this.setClassic(isClassic);
        this.setDirector(director);
    }

    public Movie(String name, List<Employee.Actor> actors) {
        this.setName(name);
        this.setActors(actors);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + "]";
    }
    public boolean isClassic() {
        return this.isClassic;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setClassic(boolean isClassic) {
        this.isClassic = isClassic;
    }

    public Movie(String name) {
        this.setName(name);
    }

    public List<Employee.Actor> getActors() {
        return this.actors;
    }

    public void setActors(List<Employee.Actor> actors) {
        this.actors = actors;
    }

}
