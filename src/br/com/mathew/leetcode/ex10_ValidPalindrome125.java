package br.com.mathew.leetcode;

public class ex10_ValidPalindrome125 {
    public static void main(String[] args) {

        boolean isPalindrome1 = isPalindrome ("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome1);
//        boolean isPalindrome2 = isPalindrome ("");
//        System.out.println(isPalindrome2);

    }

    public static boolean isPalindrome(String s) {

        String str = s.toLowerCase();
        System.out.println(str);

        int tamanho = s.length();

        for (int i=0 ; i < tamanho ; i++){
            if (Character.isLetterOrDigit(str.charAt(i))){
            }
        }

        return true;
    }

}
