import java.util.Scanner;
import static java.lang.System.*;

class Sandwich {
        String ingredient = "Nothing here yet, fam ¯\\_(ツ)_/¯";
        String bread = "Nothing here yet, fam ¯\\_(ツ)_/¯";
        double price;
        public String getIngredient() {return ingredient;}
        public String getBread() {return bread;}
        public double getPrice() {return price;}
        public void setIngredient(String setingredient) {this.ingredient = setingredient;}
        public void setBread(String setbread) {this.bread = setbread;}
        public void setPrice(double setprice) {this.price = setprice;}
}


public class chapter3_prob11ab_SandwichTest {
    static Sandwich yum = new Sandwich();
    static Scanner kbd = new Scanner(in);
    public static void main(String[] args) {
        out.print("\n\nPress (s) to set values, (d) to display them, or (e) to exit: ");
        switch (kbd.next().toLowerCase()) {
            case "s" -> {
                out.print("Enter an ingredient: ");
                yum.setIngredient(kbd.next());
                out.print("Enter a bread type: ");
                yum.setBread(kbd.next());
                out.print("Enter a price: ");
                yum.setPrice(kbd.nextDouble());
                printValues();
                main(null);
            }
            case "d" -> {
                printValues();
                main(null);
            }
            case "e" -> exit(0);
            default -> {
                out.println("Not sure what you mean by that.");
                main(null);
            }
        }

    }
    public static void printValues() {
        out.print("Current values are: \nMain ingredient: " + yum.getIngredient() + "\nBread type: " + yum.getBread() + "\nPrice: $" + yum.getPrice());
    }
}