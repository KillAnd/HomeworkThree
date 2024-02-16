public class Main {
    public static void main(String[] args) {

        byte whiteColor = 2;
        byte brownColor = 4;
        byte fullColor = 120;
        int totalClassRoom = fullColor/(whiteColor+brownColor);
        int totalWhiteColor = totalClassRoom*whiteColor;
        int totalBrownColor = totalClassRoom*brownColor;

        System.out.println("В школе, где " + totalClassRoom + " классов, нужно " + totalWhiteColor + " банок белой краски и " + totalBrownColor + " банок коричневой краски");
    }
}