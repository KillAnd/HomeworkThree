public class Main {
    public static void main(String[] args) {

        int mashaMoney = 67760;
        int denisMoney = 83690;
        int kristinaMoney = 76230;

        int indexMashaMoney = (mashaMoney*10/100)+mashaMoney;
        int indexDenisMoney = (denisMoney*10/100)+denisMoney;
        int indexKristinaMoney = (kristinaMoney*10/100)+kristinaMoney;

        int yearMoneyMasha = mashaMoney*12;
        int yearMoneyDenis = denisMoney*12;
        int yearMoneyKristina = kristinaMoney*12;

        int differentYearMoneyMasha = (indexMashaMoney*12)-yearMoneyMasha;
        int differentYearMoneyDenis = (indexDenisMoney*12)-yearMoneyDenis;
        int differentYearMoneyKristina = (indexKristinaMoney*12)-yearMoneyKristina;

        System.out.println("Маша теперь получает " + indexMashaMoney + " рублей. " +
                "Годовой доход вырос на " + differentYearMoneyMasha + " рублей.");
        System.out.println("Денис теперь получает " + indexDenisMoney + " рублей. " +
                "Годовой доход вырос на " + differentYearMoneyDenis + " рублей.");
        System.out.println("Кристина теперь получает " + indexKristinaMoney + " рублей. " +
                "Годовой доход вырос на " + differentYearMoneyKristina + " рублей.");
    }
}