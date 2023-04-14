package Enums;

public enum Weekdays {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    int number;

    Weekdays(int number){
        this.number = number;
    }
}