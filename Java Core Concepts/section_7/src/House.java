public class House {
    private int numStories;
    private int numWindows;
    private String color;

    House(){
        this.numStories = 2;
        this.numWindows = 4;
        this. color = "blue";
    }

    // Parameterized Constructor
    House(int numStories, int numWindows, String color){
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    }
    public int getNumStories(){
        return this.numStories;
    }
    public void setNumStories(int numStories){
        this.numStories = numStories;
    }
    public int getNumWindows(){
        return this.numWindows;
    }
    public void setNumWindows(int numWindows){
        this.numWindows = numWindows;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
