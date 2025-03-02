package EnumExamples;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
        //These are enum constraints
        //public , static and final
        //since its final you can create child nums
        //Type is Week
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day:Week.values()){
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
