package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch(year%400)
        {
            case 0:
                System.out.println("Leap year");
                break;
            default:
                switch(year%4 )
                {
                    case 0:
                        switch(year%100)
                        {
                            case 0:
                                System.out.println("Not a leap year");
                                break;
                            default:
                                System.out.println("leap year");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Not a leap year");
                        break;
                }
                break;
        }
    }
}
