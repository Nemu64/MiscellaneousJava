import java.util.Scanner;
import static java.lang.System.*;

public class chapter3_prob10_JobPricing {
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        out.print("Enter the job name: ");
        var jobname = kbd.next();
        out.print("Enter the cost for the materials: ");
        float materials = kbd.nextFloat();
        out.print("Enter the number of hours the job will take: ");
        float hoursworked = kbd.nextFloat();
        out.print("Enter the number of hours to travel to the job site: ");
        float traveltime = kbd.nextFloat();
        out.print("Estimate for " + jobname + ": $" + calcEstimate(materials, hoursworked, traveltime));
    }
    public static String calcEstimate(float materials, float hoursworked, float traveltime) {
        return String.format("%.2f", (materials + (hoursworked * 35) + (traveltime * 12)));
    }
}