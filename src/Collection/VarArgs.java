package Collection;

public class VarArgs {

    public static String mergeString(String... str){
        // To save memory use stringBuilder
        StringBuilder sb = new StringBuilder();
        for(String strs: str){
            sb.append(strs).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(mergeString("hello","world","good","morning"));
    }
}
