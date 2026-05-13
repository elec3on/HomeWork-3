public class Main {
    public static void main(String[] args) {
    // Задача 3.1
        int intNum1 = 300594000;
        byte byteNum1 = 120;
        short shortNum1 = 10000;
        long longNum1 = 25000000000L;
        float floatNum1 = 11.55446688f;
        double doubleNum1 = 250.55612345678999;
        // Вывод значений переменных в консоль
        System.out.println("Значение переменной intNum1 с типом int равно " + intNum1);
        System.out.println("Значение переменной byteNum1 с типом byte равно " + byteNum1);
        System.out.println("Значение переменной shortNum1 с типом short равно " + shortNum1);
        System.out.println("Значение переменной longNum1 с типом long равно " + longNum1);
        System.out.println("Значение переменной floatNum1 с типом float равно " + floatNum1);
        System.out.println("Значение переменной doubleNum1 с типом double равно " + doubleNum1);
    // Задача 3.2
        float floatNum2 = 27.12f;
        long longNum2 = 987678965549L;
        float floatNum3 = 2.786f;
        short shortNum2 = 569;
        short shortNum3 = -159;
        int intNum2 = 27897;
        byte byteNum2 = 67;
    // Задача 3.3
        System.out.println("Задача № 3");
        // Количество учеников в каждом классе
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        // Общее количество закупленных листов бумаги
        short totalSheets = 480;
        // Считаем общее количество учеников во всех трёх классах
        byte totalStudents = (byte) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        // Рассчитываем, сколько листов достанется каждому ученику
        short sheetsPerStudent = (short) (totalSheets / totalStudents);
        // Выводим результат в консоль
        System.out.printf("На каждого ученика рассчитано %d листов бумаги%n%n", sheetsPerStudent);
    // Задача 3.4
        System.out.println("Задача № 4");
        // Исходные данные
        byte bottlesPer2Minutes = 16;  // 16 бутылок за 2 минуты
        // Рассчитываем производительность в бутылках в минуту
        int bottlesPerMinute = bottlesPer2Minutes / 2;
        // Расчёты для разных временных промежутков
        // За 20 минут
        byte time20Minutes = 20;
        int bottles20Minutes = bottlesPerMinute * time20Minutes;
        // За сутки (24 часа = 24 * 60 минут)
        int minutesInDay = 24 * 60;
        int bottlesPerDay = bottlesPerMinute * minutesInDay;
        // За 3 дня
        byte days3 = 3;
        int bottles3Days = bottlesPerDay * days3;
        // За 1 месяц (считаем 30 дней)
        byte daysInMonth = 30;
        int bottlesPerMonth = bottlesPerDay * daysInMonth;
        // Вывод результатов в консоль в требуемом формате
        System.out.println("Расчёт производительности машины для изготовления бутылок:");
        System.out.println("---------------------------------------------------");
        System.out.printf("За %d минут машина произвела %d штук бутылок%n", time20Minutes, bottles20Minutes);
        System.out.printf("За сутки машина произвела %d штук бутылок%n", bottlesPerDay);
        System.out.printf("За %d дня машина произвела %d штук бутылок%n", days3, bottles3Days);
        System.out.printf("За 1 месяц машина произвела %d штук бутылок%n%n", bottlesPerMonth);
    // Задача 3.5
        System.out.println("Задача № 5");
        byte TotalPaintBanks = 120;  // Общее количество банок краски
        byte whitePerClass = 2;    // Количество банок белой краски на один класс
        byte brownPerClass = 4;    // Количество банок коричневой краски на один класс
        // Считаем общее количество банок краски на один класс
        byte totalPerClass = (byte) (whitePerClass + brownPerClass);
        // Считаем количество классов в школе
        byte numberOfClasses = (byte) (TotalPaintBanks / totalPerClass);
        // Считаем количество банок белой краски
        byte totalWhiteBanks = (byte) (numberOfClasses * whitePerClass);
        // Считаем количество банок коричневой краски
        byte totalBrownBanks = (byte) (numberOfClasses * brownPerClass);
        // Вывод результатов в консоль
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски%n%n", numberOfClasses, totalWhiteBanks, totalBrownBanks);
    // Задача 3.6
        System.out.println("Задача № 6");
        byte bananasCount = 5;
        byte bananaWeight = 80;
        // Считаем вес бананов: 5 штук по 80 грамм
        int totalBananasWeight = bananasCount * bananaWeight;
        short milkVolume = 200;
        byte milkWeightPer100ml = 105;
        // Считаем вес молока: 200 мл, где 100 мл = 105 грамм
        int totalMilkWeight = (milkVolume / 100) * milkWeightPer100ml;
        byte iceCreamCount = 2;
        byte iceCreamWeight = 100;
        // Считаем вес мороженого: 2 брикета по 100 грамм
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        byte eggsCount = 4;
        byte eggWeight = 70;
        // Считаем вес яиц: 4 яйца по 70 грамм
        int totalEggsWeight = eggsCount * eggWeight;
        // Считаем общий вес завтрака в граммах
        int totalWeightInGrams = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        // Перевод в килограммы (1 кг = 1000 г)
        double totalWeightInKilograms = totalWeightInGrams / 1000.0;
        // Вывод результатов в консоль
        System.out.println("Расчёт веса спортивного завтрака:");
        System.out.println("-----------------------------------");
        System.out.printf("Общий вес завтрака: %d г%n", totalWeightInGrams);
        System.out.printf("Общий вес завтрака: %.2f кг%n%n", totalWeightInKilograms);
    // Задача 3.7
        System.out.println("Задача № 7");
        // Исходные данные
        float targetWeightLossKg = 7; // Целевое снижение веса в кг
        int minDailyLossGrams = 250;  // Минимальная потеря веса в день (граммы)
        int maxDailyLossGrams = 500;  // Максимальная потеря веса в день (граммы)
        // Перевод целевого снижения веса в граммы
        float targetWeightLossGrams = targetWeightLossKg * 1000;
        // Расчёт количества дней при минимальной потере веса (250 г/день)
        int daysAtMinLoss = (int) Math.ceil(targetWeightLossGrams / minDailyLossGrams);
        // Расчёт количества дней при максимальной потере веса (500 г/день)
        int daysAtMaxLoss = (int) Math.ceil(targetWeightLossGrams / maxDailyLossGrams);
        // Расчёт среднего количества дней
        // Среднее арифметическое между минимальной и максимальной ежедневной потерей
        double avgDailyLoss = (minDailyLossGrams + maxDailyLossGrams) / 2.0;
        int avgDays = (int) Math.ceil(targetWeightLossGrams / avgDailyLoss);
        // Вывод результатов в консоль
        System.out.printf("Расчёт времени для снижения веса на %.1f кг:%n", targetWeightLossKg);
        System.out.println("---------------------------------------------------");
        System.out.printf("При потере 250 г в день: %d дней%n", daysAtMinLoss);
        System.out.printf("При потере 500 г в день: %d дней%n", daysAtMaxLoss);
        System.out.printf("В среднем (при потере %.1f г в день): %d дней%n%n", avgDailyLoss, avgDays);
    // Задача 3.8
        System.out.println("Задача № 8");
        // Процент повышения зарплаты
        short increasePercent = 10;
        float increaseFactor = (float) (1 + increasePercent / 100.0); // 1.10
        System.out.println("Расчёт повышения зарплат для сотрудников (повышение на 10%):");
        System.out.println("==============================================================");
        // Расчёт для Маши
        String name1 = "Маша";
        int salary1 = 67760;
        float newSalary1 = salary1 * increaseFactor;
        int annualIncomeBefore1 = salary1 * 12;
        long annualIncomeAfter1 = (long) newSalary1 * 12;
        long difference1 = annualIncomeAfter1 - annualIncomeBefore1;
        // Расчёт для Дениса
        String name2 = "Денис";
        int salary2 = 83690;
        float newSalary2 = salary2 * increaseFactor;
        int annualIncomeBefore2 = salary2 * 12;
        long annualIncomeAfter2 = (long) newSalary2 * 12;
        long difference2 = annualIncomeAfter2 - annualIncomeBefore2;
        // Расчёт для Кристины
        String name3 = "Кристина";
        int salary3 = 76230;
        float newSalary3 = salary3 * increaseFactor;
        int annualIncomeBefore3 = salary3 * 12;
        long annualIncomeAfter3 = (long) newSalary3 * 12;
        long difference3 = annualIncomeAfter3 - annualIncomeBefore3;
        // Вывод результатов в консоль
        System.out.printf("%s теперь получает %.0f рублей. Годовой доход вырос на %d рублей.%n", name1, newSalary1, difference1);
        System.out.printf("%s теперь получает %.0f рублей. Годовой доход вырос на %d рублей.%n", name2, newSalary2, difference2);
        System.out.printf("%s теперь получает %.0f рублей. Годовой доход вырос на %d рублей.%n", name3, newSalary3, difference3);
    }
}