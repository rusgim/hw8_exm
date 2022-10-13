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
        //задание 5
        System.out.println(" ");
        int initialAmount1 = 15000;
        int percentageOfTheAmount1 = 0;
        int monthOfSavings1 = 1;
        int year = 0;
        while (year <= 9) {
            percentageOfTheAmount1 = (int) (initialAmount1 * 0.07);
            initialAmount1 = initialAmount1 + percentageOfTheAmount1;
            if (monthOfSavings1 % 6 == 0) {
                System.out.println("Месяц " + monthOfSavings1 + " сумма накоплений " + initialAmount1);
            }
            monthOfSavings1 = monthOfSavings1 + 1;
            year = monthOfSavings1 / 12;
        }
        //задание 6
        System.out.println(" ");
        int yearCometInThePast = 0;
        int yearCometInThePrTime = 2022;
        for (; yearCometInThePast <= (yearCometInThePrTime + 100); yearCometInThePast = yearCometInThePast + 79) {
            if (yearCometInThePast >= (yearCometInThePrTime - 200) && yearCometInThePast <= (yearCometInThePrTime + 100)) {
                System.out.println(yearCometInThePast);
            }
        }
        //задание 7
        System.out.println(" ");
        int i3 = 2;
        for (int e = 1; e <= 10; e++) {
            System.out.println(e + " * " + i3 + " = " + e * i3);
        }
        //задание 8
        System.out.println(" ");
        int data = 4;
        int friday = 4;
        for (; data <= 31; data++) {
            if ((data - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + data + " -е число. Необходимо подготовить отчет.");
            }
        }
        //задание 9
        System.out.println(" ");
        for (int v = 1904; v <= 2096; v = v + 4) {
            System.out.println(v + " год является високосным");
        }
    }
}