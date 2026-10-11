class Methods {
    public static void main(String[] args){
        int[] a = {8,5,7,6,2,7,3,1};
        System.out.println(sumOfArray(a));

        int[] b = {7,2,3,0,8,3,44,7};
        System.out.println(sumOfArray(b));

        isPrime(12);
        isPrime(89);
        isPrime(13);
        isPrime(20);

        System.out.println(FactorialOfNumber(5));
        System.out.println(FactorialOfNumber(6));
        System.out.println(FactorialOfNumber(7));

    }
    public static int sumOfArray(int[] arr){
        int res =0;
        for (int i:arr){
            res+=i;
        }
        return res;
    }

    public static void isPrime(int x) {
        if(x<=1){
            System.out.println(x + " is not a prime number.");
            return;
        }
        for (int i = 2; i<x;i++){
            if (x%i==0){
                System.out.println(x + " is not a prime number.");
                return;
            }
        }
        System.out.println(x + " is a prime number.");

    }

    public static int FactorialOfNumber(int n){
        if(n==1){
            return 1;
        }
        return n*FactorialOfNumber(n-1);
    }
}
