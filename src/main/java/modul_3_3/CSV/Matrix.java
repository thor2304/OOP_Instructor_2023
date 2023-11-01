package modul_3_3.CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private static final String FOLDER_PATH = "src/main/java/modul_3_3/CSV/";
    private double[][] data;

    public Matrix(String filename) {
        File myObj = new File(FOLDER_PATH + filename);
        ArrayList<double[]> tempData = new ArrayList<>();

        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] entries = data.split(",");
                double[] parsedData = new double[entries.length];

                for (int i = 0; i < entries.length; i++) {
                    parsedData[i] = Double.parseDouble(entries[i]);
                }
                tempData.add(parsedData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        this.data = tempData.toArray(new double[][]{{}}); // I think that this is just as cursed as you do
    }

    public Matrix(int width, int height) {
        this.data = new double[height][width];
    }

    public void setCell(int xIndex, int yIndex, double newValue) {
        this.data[yIndex][xIndex] = newValue;
    }

    public double getCell(int xIndex, int yIndex) {
        return this.data[yIndex][xIndex];
    }

    public void save(String filename) {
        File myFile = new File(FOLDER_PATH + filename);

        try (PrintWriter printWriter = new PrintWriter(myFile)) {
            for (int y = 0; y< this.data.length; y++) {
                double[] lineData = this.data[y];

                StringBuilder outLine = new StringBuilder();

                for (int i = 0; i < lineData.length; i++) {
                    outLine.append(lineData[i]);
                    if (i == lineData.length -1){
                        continue;
                    }
                    outLine.append(",");
                }

                printWriter.println(outLine);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Matrix tester = new Matrix("input.csv");
        tester.save("saved.csv");
    }
}
