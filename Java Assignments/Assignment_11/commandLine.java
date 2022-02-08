import java.io.*;
import java.util.*;

class commandLine {
    public static void main(String[] args) {
        System.out.println("The entered file name is:" + args[0]);
        Map<Character, Integer> countChars = new HashMap<>();
        try {
            FileReader fr = new FileReader(args[0]);
            int i;

            while ((i = fr.read()) != -1) {
                if (countChars.containsKey((char) i)) {
                    int value = countChars.get((char) i);
                    countChars.put((char) i, value + 1);
                } else {
                    countChars.put((char) i, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : countChars.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }

            fr.close();
        } catch (Exception e) {
            System.out.println("Could not find the specified file.");
        }

        // writing to the file
        String fileOutputPath = "output.txt";
        File file = new File(fileOutputPath);

        BufferedWriter bf = null;

        try {

            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));

            // iterate map entries
            bf.write("Character\tCount");
            for (Map.Entry<Character, Integer> entry : countChars.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + "\t" + entry.getValue());

                // new line
                bf.newLine();
            }

            bf.flush();
        } catch (Exception e) {
            System.out.println("Could not create the file.");
        }

    }
}