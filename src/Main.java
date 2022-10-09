public class Main {
    public static void main(String[] args) {
        //задание 1
        int i = 15000;
        int t = 0;
        int month = 1;
        while (t <= 2_459_000) {
            i = i + i / 100;
            t = t + i;
            System.out.println("Месяц " + month + " сумма накоплений " + t);
            month = month + 1;
        }
        //задание 2
        System.out.println(" ");
        int o = 1;
        while (o <= 10) {
            System.out.print(" " + o);
            o = o + 1;
        }
        System.out.println();
        for (int n = 10; n >= 1; n--) {
            System.out.print(" " + n);
        }
        //задание 3
        System.out.println(" ");
        int populationOfTheCountryY = 12_000_000;
        int mortality = 8;
        int birthRate = 17;
        int populationGrowthPerYear1000 = birthRate - mortality;
        for (int x = 1; x <= 10; x++) {
            int totalPopulationGrowthPerYear = populationOfTheCountryY / 1000 * populationGrowthPerYear1000;
            populationOfTheCountryY = populationOfTheCountryY + totalPopulationGrowthPerYear;
            System.out.println("Год " + x + ", численность населения составляет " + populationOfTheCountryY);
        }
        //задание 4
        System.out.println(" ");
        int initialAmount = 15000;
        int percentageOfTheAmount = 7/100;
        int monthOfSavings = 1;
        while (initialAmount <= 12000000) {
            percentageOfTheAmount = (int) (initialAmount * 0.07);
            initialAmount = initialAmount + percentageOfTheAmount;
            if (monthOfSavings % 6 == 0) {
                System.out.println("Месяц " + monthOfSavings + " сумма накоплений " + initialAmount);
            }
            monthOfSavings = monthOfSavings + 1;
        }
    }
}