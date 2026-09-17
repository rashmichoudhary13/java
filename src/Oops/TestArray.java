package Oops;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4,5});
        ArrayOperations.Statistics stat = new ArrayOperations.Statistics();
        System.out.println(stat.mean(new int[]{1,2,3,4,5}));

        ArrayOperations.median obj2 = opr.new median();
        System.out.println(obj2.med());
    }

}
