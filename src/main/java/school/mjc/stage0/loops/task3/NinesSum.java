package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long term = 9;
        if(lengthOfLastNumber>0) {
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                sum += term;
                term = term * 10 + 9;
            }
        }
        System.out.println(sum);
}
}
