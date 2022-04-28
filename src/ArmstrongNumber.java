import java.lang.Math;

public class ArmstrongNumber {
    public boolean isArmstrong(int num){
        int result = 0;

        String number = Integer.toString(num);
        char[] digits = number.toCharArray();
        for(int i=0;i<digits.length;i++){
            int j = Integer.parseInt(String.valueOf(digits[i]));
            result += Math.pow(j, digits.length);
        }
        if(result==num){
            return true;
        } else {
            return false;
        }
    }
}
