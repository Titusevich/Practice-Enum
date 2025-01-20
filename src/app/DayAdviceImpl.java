package app;

public class DayAdviceImpl implements DayAdvice {

    @Override
    public String advice(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                return "1) Distribute your energy. " +
                        "Prioritize scheduling tough tasks for the morning or " +
                        "a certain part of the day when you are most productive.\n" +
                        "2) Avoid multitasking. " +
                        "To improve productivity, focus on one task at a time.";
            case FRIDAY:
                return "Happy Friday! The weekend is coming.";
            case SATURDAY, SUNDAY:
                return "It's worth visiting Opera Theatre or " +
                        "strolling along Primorskyi Boulevard.";
            default:
                return "Wrong input.";
        }
    }
}
