public class StatsCalc {
    public static void main(String[] args) {

        double[][] grades = {
            {85.5, 90.0, 78.5, 92.0},
            {76.0, 88.5, 90.0, 85.0},
            {95.0, 92.0, 94.5, 98.0},
            {60.0, 70.5, 65.0, 72.0},
            {82.0, 84.0, 80.0, 88.0}
        };

        System.out.println("--- GradeBook Statistics ---");

        System.out.println("\nStudent Averages:");
        calculateStudentAverages(grades);

        System.out.println("\nAssignment Averages:");
        calculateAssignmentAverages(grades);

        System.out.println();
        findHighestScore(grades);

        System.out.println("\nWeighted Averages:");
        calculateWeightedAverages(grades);

    }
    
    public static void calculateStudentAverages(double[][] data) {

        for (int i = 0; i < data.length; i++) {
            double sum = 0;

            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            
            double average = sum / data[i].length;
            System.out.printf("Student %d: %.2f%n", (i + 1), average);


        }
    }

    public static void calculateAssignmentAverages(double[][] data) {
        int rows = data.length;
        int cols = data[0].length;

        for (int j = 0; j < cols; j++) {
            double sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += data[i][j];
            }
            
            double average = sum / rows;

            System.out.printf("Assignment %d: %.2f%n", (j + 1), average);

        }
    }
    
    public static void findHighestScore(double[][] data) {
        double highest = data[0][0];
        int studentIndex = 0;
        int assignmentIndex = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > highest) {
                    highest = data[i][j];
                    studentIndex = i;
                    assignmentIndex = j;
            }
        }
    }

     System.out.printf(
            "Highest Score in Class: %.2f (Student %d, Assignment %d)%n",
            highest,
            (studentIndex + 1),
            (assignmentIndex + 1)
     );
    }



    public static void calculateWeightedAverages(double[][] data) {
        double[] weights = {0.40, 0.30, 0.20, 0.10};

        for (int i = 0; i < data.length; i++) {
            double weightedSum = 0;

            for (int j = 0; j < data[i].length; j++) {
                weightedSum += data[i][j] * weights[j];
            }
            System.out.printf(
                "Student %d: %.2f%n",
                (i + 1),
                weightedSum
            );
        }
    }
}
