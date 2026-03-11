public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // String array declared and initialized using array literal
        String[] banner = {
            String.join("  ", " *** ", " *** ", "**** ", " ****"),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "*   *", "*    "),
            String.join("  ", "*   *", "*   *", "**** ", " *** "),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", "*   *", "*   *", "*    ", "    *"),
            String.join("  ", " *** ", " *** ", "*    ", "**** ")
        };

        // for-each loop to print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}