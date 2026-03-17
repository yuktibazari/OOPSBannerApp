public class OOPSBannerAppUC6 {

    // Method to build letter O
    public static String[] buildO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to build letter P
    public static String[] buildP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to build letter S
    public static String[] buildS() {
        return new String[]{
            " ***** ",
            "*     ",
            "*     ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Banner array initialized by calling methods
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ", O[i], O[i], P[i], S[i]);
        }

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}