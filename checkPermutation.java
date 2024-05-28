
import java.util.Arrays;

public class checkPermutation {

    public static void main(String[] args) {
        
    }

    public static boolean solution(String s, String t) {
        // needs to be same length to be a permutation
        if (s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sortedS = Arrays.toString(sArray);
        String sortedT = Arrays.toString(tArray);

        return sortedS.equals(sortedT);
    }
    
}

// must be the same length
// have the same characters and freq 

// sort both strings and check if they are equal 

// go through one creating a map keeping track of freq
// go through other string and check if the character is in map 
// with the right freq

