package Collection.Enum;

public class TestEnum {
    public static void main(String[] args) {
        for(Day day: Day.values()){
            System.out.println(day);
        }

        for(Day day: Day.values()){
            System.out.printf("%s : %s\n",day,day.getType());
        }
    }
}
