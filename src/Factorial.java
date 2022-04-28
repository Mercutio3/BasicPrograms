class Factorial {
    public int loopFactorial(int num){
        int result = 1;
        for(int i=num;i>0;i--){
            result *= i;
        }
        return result;
    }

    private int factLoop(int num){
        if(num==0){
            return 1;
        } 
        return num*factLoop(num-1);
    }

    public int recFactorial(int num){
        int result = 1;
        result = factLoop(num);
        return result;
    }
}
