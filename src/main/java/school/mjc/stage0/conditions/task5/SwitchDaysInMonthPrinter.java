package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        String season;
        switch (month) {
            case (1):
            case (2):
            case (12):
                season = "winter";
                break;
            case (3):
            case (4):
            case (5):
                season = "spring";
                break;
            case (6):
            case (7):
            case (8):
                season = "summer";
                break;
            case (9):
            case (10):
            case (11):
                season = "autumn";
                break;
            default:
                season = "invalid number of month!";
                break;
        }
        System.out.println(season);
    }
}
