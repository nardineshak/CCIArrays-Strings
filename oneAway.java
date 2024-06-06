public class oneAway {

    public static void main(String[] args) {
        
    }

    public static boolean solution(String s, String t) {
        // compare lengths if the abs value is greater than 1 then false
        if (Math.abs(s.length() - t.length()) > 1) return false;

        // find the shorter string 
        String shorter = s.length() < t.length() ? s : t;
        String longer = s.length() < t.length() ? t : s;

        // go through the letters comparing at each point 
        int index1 = 0;
        int index2 = 0;
        boolean foundDiff = false;
        while (index1 < shorter.length() && index2 < longer.length()) {
            if (shorter.charAt(index1) != longer.charAt(index2)) {
                if (foundDiff) return false;
                foundDiff = true;

                // on replace move shorter pointer
                if (shorter.length() == longer.length()) index1++;
            } else {
                index1++; // if matching move pointer
            }
            index2++; // always move pointer of longer string 
        }

        return true;
    }
    
}
