import static java.lang.Math.*;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("The square root of 37 is " + sqrt(37));
        System.out.println("The sin of 300 is " + sin(300) + " and the cosine is " + cos(300) + " (assuming radians)");
        System.out.println("The sin of 300 is " + sin((PI / 180) * 300) + " and the cosine is " + cos((PI / 180) * 300) + " (assuming degrees)");
        System.out.println("22.8 rounded down is " + floor(22.8) + ". 22.8 rounded up is " + ceil(22.8) + ". 22.8 rounded normally is " + round(22.8) + ".");
        System.out.println("The max of D and 71 is " + max('D', 71) + ". The min is " + min('D', 71) + ".");
        System.out.println("A random number: " + (int)round(random() * 20));
    }
}