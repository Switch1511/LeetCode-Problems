public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String valueInput = String.valueOf(x);
        int valueLenght = valueInput.length();

        for(int i = 0; i < valueLenght; i++) {
            if(valueInput.charAt(i) != valueInput.charAt(valueLenght - 1 - i)){
                return false;
            }

            if(i == (valueLenght - 1 - i) || (valueLenght - 1 - i) < i){
                return true;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(232));
    }
}
