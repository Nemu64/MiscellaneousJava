public class LetterWriter {
    public static void main(String[] args) {
        echo();
        writeSalutation("Smith");
        writeSalutation("Smith", "John");
    }
    public static void writeSalutation(String lastname){
        echo("Dear Mr. or Ms. " + lastname + "\n\nThank you for your recent order.");
    }
    public static void writeSalutation(String lastname, String firstname){
        echo("Dear " + firstname + " " + lastname + "\n\nThank you for your recent order.");
    }
    public static void echo(Object printthis){
        System.out.print(printthis + "\n");
    }
    public static void echo() {
        System.out.print("[Warning] echo was called without an argument. Don't do that.");
    }
}