public class printPrimeNumber{
    public static void main(String[] args) {
        int i;
        int n;
        boolean isPrime;

        for(n = 1; n <= 100; n++){
            isPrime = true;

            for(i = 2; i <= n/2; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(n);
            }
        }

    }
}
