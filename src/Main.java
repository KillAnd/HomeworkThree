public class Main {
    public static void main(String[] args) {
//если за 2 минуты производится 16 бутылок, следовательно за 1 минуту производится 8 бутылок.
        byte batles = 8;
        byte time1 = 20; //минуты
        short time2 = 1440; //сутки
        int time3 = 1440*30; //месяц

        System.out.println("За 20 минут машина произвела " + batles*time1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + batles*time2 + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + batles*(time2*3) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + batles*time3 + " штук бутылок");
    }
}