import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A_EmpericalAnalysis {
    public static void main(String[] args) {
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter("File\\EmpericalTest.csv");
            bw = new BufferedWriter(fw);
            //
            long oS, oE;
            Date startDate = new Date(), endDate;
            long sT = System.currentTimeMillis(), eT;
            SimpleDateFormat f = new SimpleDateFormat("dd/MMM/yyyy");
            String today = f.format(startDate);

            // --------------------------------------------------
            bw.write("Start date for linear is " + today + "\n");
            System.out.println("Start date for linear is " + today);
            //
            double n = Math.pow(10, 8);
            double avg;
            //
            oS = System.currentTimeMillis();
            for (double i = 0; i <= n;) {
                avg = 0;
                bw.write(i + ", ");
                for (int j = 0; j < 10; j++) {
                    sT = System.currentTimeMillis();
                    add(1, i);
                    eT = System.currentTimeMillis();
                    bw.write((eT - sT) + ", ");
                    avg += (eT - sT);
                }
                avg /= 10;
                bw.write(avg + "");
                bw.newLine();
                i += Math.pow(10, String.valueOf((int) i).length() - 1);
            }
            bw.flush();
            oE = System.currentTimeMillis();

            endDate = new Date();
            String finishDay = f.format(endDate);
            System.out.println("End date for linear is " + finishDay);
            bw.write("End date for linear is " + finishDay + "\n");
            System.out.println("This operation take :" + (oE - oS) + " milliseconds");
            bw.write("This operation take : " + (oE - oS) + " milliseconds" + "\n");
            bw.flush();
            // ------------------------------------------------------------------

            System.out.println();
            startDate = new Date();
            today = f.format(startDate);
            bw.write("Start date for Quadratic is " + today + "\n");
            System.out.println("Start date for Quadratic is " + today);

            oS = System.currentTimeMillis();
            n = Math.pow(10, 4);
            for (double i = 0; i <= n;) {
                avg = 0;
                bw.write(i + ", ");
                for (int j = 0; j < 10; j++) {
                    sT = System.currentTimeMillis();
                    sumOfAdd(1, i);
                    eT = System.currentTimeMillis();
                    bw.write((eT - sT) + ", ");
                    avg += (eT - sT);
                    bw.flush();
                }
                avg /= 10;
                bw.write(avg + "");
                bw.newLine();
                i += Math.pow(10, String.valueOf((int) i).length() - 1);
            }
            bw.flush();
            oE = System.currentTimeMillis();

            endDate = new Date();
            finishDay = f.format(endDate);
            System.out.println("End date for Quadratic is " + finishDay);
            bw.write("End date for Quadratic is " + finishDay + "\n");
            System.out.println("This operation take :" + (oE - oS) + " milliseconds");
            bw.write("This operation take : " + (oE - oS) + " milliseconds" + "\n");
            bw.flush(); // ------------------------------------------------------------

            System.out.println();
            startDate = new Date();
            today = f.format(startDate);

            bw.write("Start date for Cubic is " + today + "\n");
            System.out.println("Start date for Cubic is " + today);

            oS = System.currentTimeMillis();
            n = Math.pow(10, 3);
            for (double i = 0; i <= n;) {
                avg = 0;
                bw.write(i + ", ");
                for (int j = 0; j < 10; j++) {
                    sT = System.currentTimeMillis();
                    sumInCubic(1, i);
                    eT = System.currentTimeMillis();
                    bw.write((eT - sT) + ", ");
                    avg += (eT - sT);
                    bw.flush();
                }
                avg /= 10;
                bw.write(avg + "");
                bw.newLine();
                i += Math.pow(10, String.valueOf((int) i).length() - 1);
            }
            bw.flush();
            oE = System.currentTimeMillis();

            endDate = new Date();
            finishDay = f.format(endDate);
            System.out.println("End date for Cubic is " + finishDay);
            bw.write("End date for Cubic is " + finishDay + "\n");
            System.out.println("This operation take :" + (oE - oS) + " milliseconds");
            bw.write("This operation take : " + (oE - oS) + " milliseconds" + "\n");
            // ----------------------------------------------------

            System.out.println();
            startDate = new Date();
            today = f.format(startDate);
            bw.write("Start date for Log is " + today + "\n");
            System.out.println("Start date for Log is " + today);

            oS = System.currentTimeMillis();
            n = Math.pow(10, 25);
            for (double i = 1; i <= n; i *= 10) {
                avg = 0;
                bw.write(i + ", ");
                for (int j = 0; j < 10; j++) {
                    sT = System.currentTimeMillis();
                    sumInLogarithm(1, i);
                    eT = System.currentTimeMillis();
                    bw.write((eT - sT) + ", ");
                    avg += (eT - sT);
                    bw.flush();
                }
                avg /= 10;
                bw.write(avg + "");
                bw.newLine();
            }
            bw.flush();
            oE = System.currentTimeMillis();

            endDate = new Date();
            finishDay = f.format(endDate);
            System.out.println("End date for Log is " + finishDay);
            bw.write("End date for Log is " + finishDay + "\n");
            System.out.println("This operation take :" + (oE - oS) + " milliseconds");
            bw.write("This operation take : " + (oE - oS) + " milliseconds" + "\n");
            // -----------------------------------------------------------

            System.out.println();
            startDate = new Date();
            today = f.format(startDate);
            bw.write("Start date for NlgN is " + today + "\n");
            System.out.println("Start date for NlgN is " + today);

            oS = System.currentTimeMillis();
            n = Math.pow(10, 7);
            for (double i = 0; i <= n;) {
                avg = 0;
                bw.write(i + ", ");
                for (int j = 0; j < 10; j++) {
                    sT = System.currentTimeMillis();
                    sumInN2gN(1, i);
                    eT = System.currentTimeMillis();
                    bw.write((eT - sT) + ", ");
                    avg += (eT - sT);
                    bw.flush();
                }
                avg /= 10;
                bw.write(avg + "");
                bw.newLine();
                i += Math.pow(10, String.valueOf((int) i).length() - 1);
            }
            bw.flush();
            oE = System.currentTimeMillis();

            endDate = new Date();
            finishDay = f.format(endDate);
            System.out.println("End date for NlgN is " + finishDay);
            bw.write("End date for NlgN is " + finishDay + "\n");
            System.out.println("This operation take :" + (oE - oS) + " milliseconds");
            bw.write("This operation take : " + (oE - oS) + " milliseconds" + "\n");

            // System.out.println("Summation in Cubic between 1 and 10 thousands is: " + x +
            // " It ran for " + (eT - sT)
            // + " milliseconds");
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static double add(double from, double to) {
        double answer = 0;
        for (double i = from; i <= to; i++) {
            answer += i;
        }
        return answer;
    }

    public static double sumOfAdd(double from, double to) {
        double answer = 0;
        for (double i = from; i <= to; i++) {
            for (double j = from; j <= to; j++) {
                answer += i;
            }
        }
        return answer;
    }

    public static double sumInCubic(double from, double to) {
        double answer = 0;
        for (double i = from; i <= to; i++) {
            for (double j = from; j <= to; j++) {
                for (double j2 = from; j2 <= to; j2++) {
                    answer += i;
                }
            }
        }
        return answer;
    }

    public static double sumInLogarithm(double from, double to) {
        double answer = 0;
        for (double i = to; i >= from; i /= 2) {
            answer += i;
        }
        return answer;
    }

    public static double sumInN2gN(double from, double to) {
        double answer = 0;
        for (double i = from; i <= to; i++) {
            for (double j = to; j >= from; j /= 2) {
                // for (double j = from; j <= to; j *= 2) {
                answer += i;
            }
        }

        return answer;
    }
}