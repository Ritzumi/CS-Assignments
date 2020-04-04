import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class E_LogarithmAnanlysis {
    public static void main(String[] args) throws IOException {
        // Declaration
        FileWriter fw = new FileWriter("File\\4_Logarithm.csv");
        BufferedWriter writer = new BufferedWriter(fw);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate, endDate;
        long startEach, endEach;
        long startOperationn, endOperation;
        double length, average = 0;

        // Range
        length = Math.pow(10, 25);
        
        // Execution
        startDate = new Date();
        writer.write("Start date for logarithm operation is " + date.format(startDate) + "\n");
        System.out.println("Start date for logarithm operation is " + date.format(startDate));
        startEach = System.currentTimeMillis();
        // Execution
        startOperationn = System.currentTimeMillis();
        for (double i = 1; i <= length;) {
            average = 0;
            writer.write(i + ", ");
            for (int j = 0; j < 10; j++) {
                startEach = System.currentTimeMillis();
                log(1, i);
                endEach = System.currentTimeMillis();
                writer.write((endEach - startEach) + ", ");
                average += (endEach - startEach);
                writer.flush();
            }
            average /= 10;
            writer.write(average + "");
            writer.newLine();
            i *= 10;
        }
        writer.flush();
        endOperation = System.currentTimeMillis();

        endDate = new Date();
        String finishDay = date.format(endDate);
        System.out.println("End date for logarithm operation is " + finishDay);
        writer.write("End date for logarithm operation is " + finishDay + "\n");
        System.out.println("This operation take :" + (endOperation - startOperationn) + " milliseconds");
        writer.write("This operation take : " + (endOperation - startOperationn) + " milliseconds" + "\n");
        writer.close();
}

    public static double log(double from, double to) {
        double answer = 0;
        for (double i = to; i >= from; i /= 2) {
            answer += i;
        }
        return answer;
    }
}