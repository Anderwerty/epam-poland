package com.epam.poland.lesson12_16;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY.getDayName());

//        Days.MONDAY.setDayName("Понеділок");
        System.out.println(Days.MONDAY.getDayName());
    }
}

// Singleton
enum Days {
    MONDAY("Monday"), FRIDAY("FRIDAY", true);

    private final String dayName;
    private final boolean isGoodDay;

     Days(String dayName) {
        this.dayName = dayName;
        this.isGoodDay = false;
    }

    Days(String dayName, boolean isGoodDay) {
        this.dayName = dayName;
        this.isGoodDay = isGoodDay;
    }

    public String getDayName() {
        return dayName;
    }

    public boolean isGoodDay() {
        return isGoodDay;
    }
}

//class CustomEnum extends Enum<CustomEnum>{
//
//    /**
//     * Sole constructor.  Programmers cannot invoke this constructor.
//     * It is for use by code emitted by the compiler in response to
//     * enum type declarations.
//     *
//     * @param name    - The name of this enum constant, which is the identifier
//     *                used to declare it.
//     * @param ordinal - The ordinal of this enumeration constant (its position
//     *                in the enum declaration, where the initial constant is assigned
//     */
//
//
//    protected CustomEnum(String name, int ordinal) {
//        super(name, ordinal);
//    }
//}
