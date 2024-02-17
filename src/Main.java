public class Main {
    public static void main(String[] args) {

        short minWtGm = 250;
        short maxWtGm = 500;
        byte outKg = 7;

        int minTimeInDay = (outKg*1000)/minWtGm;
        int maxTimeInDay = (outKg*1000)/maxWtGm;

        System.out.println(minTimeInDay + " дней на похудение если по 250гр");
        System.out.println(maxTimeInDay + " дней на похудение если по 500гр");

        float mediumWtGm = (minWtGm+maxWtGm)/2f;
        float mediumTimeInDay = (outKg*1000)/mediumWtGm;


        System.out.println(mediumTimeInDay + " дней в среднем уйдет на похудение");

    }
}