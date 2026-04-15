import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeProcessor {
    public static void main(String[] args) {
        try {
            File inputFile = new File("student_data.txt");
            Scanner fileReader = new Scanner(inputFile);

            PrintWriter writer = new PrintWriter("grade_report.txt");

            System.out.println("Processing file...");

            writer.println("Name\tAverage\tStatus");
            writer.println("--------------------------------");

            while (fileReader.hasNextLine()) {

                String line = fileReader.nextLine();
                String[] parts = line.split(" ");

                String name = parts[0];

                double score1 = Double.parseDouble(parts[1]);
                double score2 = Double.parseDouble(parts[2]);
                double score3 = Double.parseDouble(parts[3]);

                double average = (score1 + score2 + score3) / 3;

                String status;
                if (average >= 70) {
                    status = "Pass";
                } else {
                    status = "Fail";
                }

                writer.printf("%s\t%.1f\t%s%n", name, average, status);
            }

            fileReader.close();
            writer.close();

            System.out.println("Done! Check grade_report.txt for results.");

        } catch (FileNotFoundException e) {

            // Handle missing file gracefully
            System.out.println("Error: Input file 'student_data.txt' was not found.");

        }
    }
}
