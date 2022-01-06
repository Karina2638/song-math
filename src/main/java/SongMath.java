//remember imports
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SongMath {
    public static void main(String[] args) {

        //remember FileReader, BufferedReader for reading
        //FileWriter, BufferedWriter for writing
        int total = 0;
        try (FileReader file = new FileReader("twenty.txt");
             BufferedReader reader = new BufferedReader(file)) {
            String line;
            int three = 0;
            int sixnine = 0;
            int skater = 0;
            int seven = 0;
            int eleven = 0;
            int twenty = 0;
            int thirty = 0;
            int sixty = 0;
            int forward = 0;
            int back = 0;
            int nine = 0;
            int four = 0;
            int fifteen = 0;
            int freshman = 0;
            int senior = 0;
            int six = 0;
            int dime = 0;
            int five = 0;
            while ( (line = reader.readLine()) != null) {
                if (line.contains("3")) {
                    three = three + 3;
                } if (line.contains("'69")) {
                    sixnine = sixnine + 69;
                } if (line.contains("skater") || line.contains("Skater")) {
                    skater = skater + 8;
                } if (line.contains("seven") || line.contains("Seven")) {
                    seven = seven + 7;
                } if (line.contains("eleven") || line.contains("Eleven")) {
                    eleven = eleven + 11;
                } if (line.contains("twenty") || line.contains("Twenty")) {
                    twenty = twenty + 20;
                } if (line.contains("thirty") || line.contains("Thirty")) {
                    thirty = thirty + 30;
                } if (line.contains("sixty") || line.contains("Sixty")) {
                    sixty = sixty + 60;
                } if (line.contains("forward") || line.contains("Forward")) {
                    forward++;
                } if (line.contains("back") || line.contains("Back")) {
                    back = back - 3;
                } if (line.contains("nine") || line.contains("Nine")) {
                    nine = nine + 9;
                } if (line.contains("four") || line.contains("Four")) {
                    four = four + 4;
                } if (line.contains("fifteen") || line.contains("Fifteen")) {
                    fifteen = fifteen + 15;
                } if (line.contains("freshman") || line.contains("Freshman")) {
                    freshman = freshman - 9;
                } if (line.contains("senior") || line.contains("Senior")) {
                    senior = senior - 12;
                } if (line.contains("six") || line.contains("Six")) {
                    six = six + 6;
                } if (line.contains("dime") || line.contains("Dime")) {
                    dime = dime + 10;
                } if (line.contains("five") || line.contains("Five")) {
                    five = five + 5;
                }
            }//end of while there is a line to read
            total = three + sixnine + skater + seven + eleven + twenty + thirty + sixty+ forward + back +
                    nine + four + fifteen + freshman + senior + six + dime + five;
        } catch (FileNotFoundException badFile) {
            System.out.println("Cannot find file to read from");
        } catch (IOException bad) {
            System.out.println("Error reading from file");
        }
        String songMath = "songmath.txt";
        try(FileWriter file = new FileWriter(songMath); BufferedWriter writer = new BufferedWriter(file)) {
            writer.write(total + " is an interesting number to get, huh?");
        } catch (FileNotFoundException noFile) {
            System.out.println("Error creating or finding file.");
            noFile.printStackTrace();
        } catch (IOException bad) {
            System.out.println("Error writing into file.");
            bad.printStackTrace();
        }
    }//end of main
}//end of class
