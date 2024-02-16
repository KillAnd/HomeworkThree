public class Main {
    public static void main(String[] args) {
        short fullList = 480;
        byte p = 23;
        byte s = 27;
        byte a = 30;
        int together = p + s + a;
        int listOneStudent = fullList/together;

        System.out.println("На одного ученика выделено " + listOneStudent + " листов");
    }
}