public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        //both raining and warm are true

        boolean combined = isRaining || isWarm;
        System.out.println("Is Raining or Warm?  " + combined);

        isRaining = false;
        combined = isRaining && isWarm;
        System.out.println("Is Raining and Warm ?  " + combined);

        combined = !isRaining;
        System.out.println("Is Raining ? " + combined);


        //raining is true and warm is false

        isRaining = true;
        isWarm = false;

        combined = isRaining || isWarm;
        System.out.println("Is Raining or Warm?  " + combined);

        isRaining = false;
        combined = isRaining && isWarm;
        System.out.println("Is Raining and Warm ?  " + combined);

        combined = !isRaining;
        System.out.println("Is Raining ? " + combined);


        // raining and warm both are false
        isRaining = false;
        isWarm = false;

        combined = isRaining || isWarm;
        System.out.println("Is Raining or Warm?  " + combined);

        isRaining = false;
        combined = isRaining && isWarm;
        System.out.println("Is Raining and Warm ?  " + combined);

        combined = !isRaining;
        System.out.println("Is Raining ? " + combined);
    }
}
