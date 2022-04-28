class PalindromeNumber {
    public boolean isPalindrome(int num){
        String numTest = Integer.toString(num);
        StringBuilder numTest2 = new StringBuilder();
        for(int i=numTest.length();i>0;i--){
            numTest2.append(numTest.charAt(i-1));
        }
        if(numTest.equals(numTest2.toString())){
            return true;
        } else {
            return false;
        }
    }
}
