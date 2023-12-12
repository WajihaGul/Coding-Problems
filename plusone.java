import java.util.Arrays;

class plusone{

    public static void main(String[] args) {
        // Test cases
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};
        int[] digits4 = {9, 9, 9};

        int[] result1 = plusOne(digits1);
        int[] result2 = plusOne(digits2);
        int[] result3 = plusOne(digits3);
        int[] result4 = plusOne(digits4);

        System.out.println("Result after adding one to " + arrayToString(digits1) + ": " + arrayToString(result1));
        System.out.println("Result after adding one to " + arrayToString(digits2) + ": " + arrayToString(result2));
        System.out.println("Result after adding one to " + arrayToString(digits3) + ": " + arrayToString(result3));
        System.out.println("Result after adding one to " + arrayToString(digits4) + ": " + arrayToString(result4));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[n + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    //for prinitng array
    public static String arrayToString(int[] array) {
        return Arrays.toString(array);
    }

}