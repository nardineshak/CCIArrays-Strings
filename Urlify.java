public class Urlify {

    public static void main(String[] args) {
        
    }

    public static void solution(char[] str, int trueLen) {
        // count the number of spaces
        int numSpaces = countCharacter(str, ' ');
        // calculate new string length/ new index
        int newIndex = trueLen - 1 + numSpaces * 2; 
        if (newIndex + 1 < str.length) str[newIndex + 1] = '\0';
        // iterate from the end adding the "%20"
        for (int oldIndex = trueLen - 1; oldIndex >= 0; oldIndex--) {
            if (str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex--;
            }
        }

    }

    public static int countCharacter(char[] str, char target) {
        int count = 0;
        for (Character c: str) {
            if (c == target) count++;
        }
        return count;
    }
    
}
