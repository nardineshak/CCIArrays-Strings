import java.util.HashMap;

public class PalindromePerm {
    
    public static void main(String[] args) {
        
    }

    public static boolean solution(String s) {
        if (s == null || "".equals(s)) return true;

        HashMap<Character, Integer> map = new HashMap<>();
        int oddCount = 0;

        for(Character c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            int val = map.get(c);
            if (val % 2 == 0) {
                oddCount--;
            } else {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }


}

// edit the string -> all lowercase & no spaces
// iterate through the characters storing them 
// in a map. keep track of how many oddCount there are. 
// only one letter can have an odd freq
// all other letters should have an even freq
