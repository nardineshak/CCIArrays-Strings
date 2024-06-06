public class stringCompression {

    public static void main(String[] args) {
        
    }

    public static String solution(String s) {
        // check new string size before you create the new string to avoid just returning original string
        int newStrSize = countCompression(s);
        if (newStrSize > s.length()) return s;

        // otherwise create new string 
        StringBuilder str = new StringBuilder(newStrSize);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;

            //if next character is different
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                str.append(s.charAt(i));
                str.append(String.valueOf(count));
                count = 0;
            }
        }

        return str.toString();
    }

    public static int countCompression(String s) {
        int count = 0;
        int compressedLength = 0; 

        for (int i = 0; i < s.length(); i++) {
            count++;

            //if next character is different
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(count).length();
                count = 0;
            }
        }

        return compressedLength;
    }

    // go through string 
    // count the # of the letters until you hit a diferent letter
    // when you hit a differernt letter add the letter and count to the new string 

    
}
