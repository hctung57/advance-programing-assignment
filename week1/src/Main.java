public class Main {
    static enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY}
    public static void main(String[] args) {
        Day Day1 = Day.FRIDAY;
        Day Day2 = Day.THURDAY;
        System.out.println("day1's name is " + Day1.name());
        System.out.println("day2's name is " + Day2.name());
        System.out.println("day1's ordinal is " + Day1.ordinal());
        System.out.println("day2's ordinal is " + Day2.ordinal());
        System.out.println("day1.equals(day2) return "+ Day1.equals(Day2));
        System.out.println("day1.toString() return "+ Day1.toString());
        System.out.println("day1.compareTo(day2) return "+ Day1.compareTo(Day2));
    }
}