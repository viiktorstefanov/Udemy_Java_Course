public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        double megaBytes = Math.ceil(kiloBytes / 1024);
        double leftOverKilobytes = Math.ceil(kiloBytes - (megaBytes * 1024));

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kiloBytes + " KB = " + (int) megaBytes + " MB and " + (int) leftOverKilobytes + " KB");
    };


}