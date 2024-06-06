public class stringRotation {

    public static void main(String[] args) {
        
    }

    public static String isRotation(String s, String t) {
        if (s.length() == t.length() && s.length() > 0) {
            String ss = s + s;
            return isSubstring(ss, t);
        }
    }
    
}

// s = xy = waterbottle 
// x = wat 
// y = erbottle
// t = yx = erbottlewat  

// ss = xyxy so t will always be a substring of s 
