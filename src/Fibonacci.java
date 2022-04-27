class Fibonacci {
    int size;
    int size2;
    int n1 = 0;
    int n2 = 1;
    int n3;
    public Fibonacci(int num){
        this.size = num;
        this.size2 = num-2;
    }

    private void resetInts(){
        n1 = 0;
        n2 = 1;
    }

    public void printSequence(){
        System.out.print("Non-recursive Fibonacci sequence of length "+size+": ");
        System.out.print(n1+" "+n2);
        for(int i=0;i<size-2;i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
        resetInts();
    }

    public void recursiveLoop(){
        if(size2>0){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
            size2--;
            recursiveLoop();
        }
    }

    public void printSequenceRec(){
        System.out.print("Recursive Fibonacci sequence of length "+size+": ");
        System.out.print(n1+" "+n2);
        recursiveLoop();
        System.out.println();
        resetInts();
    }
}
