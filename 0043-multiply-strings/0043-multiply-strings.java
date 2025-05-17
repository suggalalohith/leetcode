public class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length(), len2 = num2.length();
        
        
        int[] result = new int[len1 + len2];

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                result[i + j] += product;
                result[i + j + 1] += result[i + j] / 10; 
                result[i + j] %= 10;
            }
        }

        
        int idx = result.length - 1;
        while (idx >= 0 && result[idx] == 0) {
            idx--;
        }

        
        if (idx == -1) {
            return "0";
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = idx; i >= 0; i--) {
            sb.append(result[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("2", "3"));      
        System.out.println(solution.multiply("123", "456"));  
    }
}
