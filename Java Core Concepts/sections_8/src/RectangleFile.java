import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFile {
    public static double[] converToNumber(String[] rectData){
        double[] newRectData = new double[rectData.length];
        for(int i = 0; i < rectData.length; i++){
            newRectData[i] = Double.parseDouble(rectData[i]);
        }
        return newRectData;
    }
    public static void main(String[] args) {
        Scanner input;
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        try{
            input = new Scanner(new File("rectangle_data.txt"));

            String data;

            while(input.hasNext()){
                data = input.nextLine();
                String[] rectData = data.split(" ");

                double[] newRectData = converToNumber(rectData);
                rectangles.add(new Rectangle(newRectData[0], newRectData[1]));
            }
            input.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


        for(int i = 0; i < rectangles.size(); i++){
            System.out.println("Length of rectangle is " + rectangles.get(i).getLength());
            System.out.println("Width of rectangle is " + rectangles.get(i).getWidth());
            System.out.println("Area of rectangle is " + rectangles.get(i).area());
            System.out.println("Perimeter of rectangle is " + rectangles.get(i).perimeter());

            System.out.println("*****************************************");
        }

    }
}
