class Fibonacci {
    int n1 = 0;
    int n2 = 1;
    int n3;

    private void resetInts(){
        n1 = 0;
        n2 = 1;
    }

    public void printSequence(int size){
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

    public void recursiveLoop(int length){
        n3 = n1+n2;
        System.out.print(" "+n3);
        n1 = n2;
        n2 = n3;
        if(length>0){
            recursiveLoop(length-1);
        }
    }

    public void printSequenceRec(int size){
        System.out.print("Recursive Fibonacci sequence of length "+size+": ");
        System.out.print(n1+" "+n2);
        recursiveLoop(size-3);
        System.out.println();
        resetInts();
    }
}
