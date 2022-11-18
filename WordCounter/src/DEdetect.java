import java.io.IOException;

public class DEdetect {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("powershell.exe -c (New-Object Media.SoundPlayer \"C:\\Windows\\Media\\tada.wav\").PlaySync();");
    }
}
