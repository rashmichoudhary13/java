// It has 9 most used method
// 1. append(str)
// 2. insert(index, str)
// 3. delete([start, end))
// 4. deleteCharAt(index)
// 5. replace([start, end), str)
// 6. reverse() 
// 7. toString()  [return string]
// 8. charAt(index) [return char]
// 9. setCharAt(index, char)

// 10. indexOf(String) [return first index]
// 11. lastIndexOf(string)  [return last index]
// 12. substring([beg, end))  [return string]

public class StringBuild {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        System.out.println("append: " + sb);

        sb.insert(5, "in the");
        System.out.println("insert: " + sb);

        sb.delete(5,11);
        System.out.println("delete: " + sb);

        sb.deleteCharAt(9);
        System.out.println("delete char: " + sb);

        sb.replace(1,5,"igh");
        System.out.println("replace: " + sb);

        sb.reverse();
        System.out.println("reverse: " + sb);

        sb.toString();
        System.out.println("replace: " + sb);

        char one = sb.charAt(2);
        System.out.println("char: " + one);

        sb.setCharAt(2, 'r');
        System.out.println("new replace: " + sb); //drrW hgiH

        int idx = sb.indexOf("r");
        System.out.println("index of: " + idx);

        int lastIdx = sb.lastIndexOf("r");
        System.out.println("last index of: " + lastIdx);

        String sub = sb.substring(1,3);
        System.out.println("substring is: " + sub);
    }
}