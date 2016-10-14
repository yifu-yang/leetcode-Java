public class Solution {
    public String addStrings(String num1, String num2) {
        int lengthA = num1.length(), lengthB = num2.length();
        int flag = 0;
        ArrayList<String> result = new ArrayList<String>();
        for (int i = lengthA - 1, j = lengthB - 1, k = 0; i >= 0 || j >= 0 || flag > 0; i--, j--, k++) {
            int tmp = 0;
            if (i >= 0)
                tmp = (num1.charAt(i) - '0');
            if (j >= 0)
                tmp += (num2.charAt(j) - '0');
            tmp += flag;
            if (tmp > 9) {
                flag = tmp / 10;
                tmp = tmp % 10;
            } else {
                flag = 0;
            }
            result.add(0, Integer.toString(tmp));
        }
        return String.join("", result);
    }
}