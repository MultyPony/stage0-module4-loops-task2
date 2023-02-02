package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;

        while (count <= printToInclusive) {
            int fact = count;
            int result = 1;

            while (fact > 1) {
                result *= fact;
                fact--;
            }
            System.out.println(result);
            count++;
        }
    }
}
