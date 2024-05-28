import java.util.Arrays;
import java.util.HashSet;

public class isUnique {

    public static void main(String[] args) {
        String s = "aabc";

        System.out.println(unique(s));
        System.out.println(isUnique2(s));
        
    }

    public static boolean unique(String s) {
        HashSet<Character> set = new HashSet<>();
        for(Character c: s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }


    public static boolean isUnique2(String s) {
        char[] characters = s.toCharArray();
        Arrays.sort(characters);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) return false;
        }
        return true;
    }
    
}
