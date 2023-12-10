public class Findindextoffirstoccurring {
        public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int result = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + result);
    }

    public static int strStr(String haystack, String needle) {
        
        int hayLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength == 0) {
            return 0; // An empty needle is always present at index 0.
        }

        for (int i = 0; i <= hayLength - needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == needleLength) {
                return i; // Found a match, return the index of the first occurrence.
            }
        }

        return -1; // Substring not found.
    }
}

