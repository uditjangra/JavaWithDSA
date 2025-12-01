package functions;

public class PrimeNumberBetween {
        static boolean isPrime(int n) {

            if (n <= 1)
                return false;

            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }

            return true;
        }
        static int[] primeRange(int m, int n) {

            int[] temp = new int[n - m + 1];
            int index = 0;

            for (int i = m; i <= n; i++) {

                if (isPrime(i))
                    temp[index++] = i;
            }

            int[] result = new int[index];
            System.arraycopy(temp, 0, result, 0, index);

            return result;
        }
        public static void main(String[] args) {

            int m = 1, n = 10;

            int[] ans = primeRange(m, n);

            for (int i : ans)
                System.out.print(i + " ");
        }
    }
