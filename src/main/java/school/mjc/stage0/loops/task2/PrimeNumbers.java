package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;

        while (count <= printToInclusive) {
            int i = 2;
            int endNumber = count / 2;
            boolean isPrime = true;

            while (i <= endNumber) {
                if (count % i == 0) {
                    isPrime = false;
                }
                i++;
            }
            if (isPrime) {
                System.out.println(count);
            }
            count++;
        }
    }
}
