import org.w3c.dom.ls.LSOutput;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }else {
            int conversion = (int) kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + conversion + " MB and " + remainder + " KB");
        }

    }
}