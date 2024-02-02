package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first!=0 && second!=0) {
            for (int i = first; i >= 1; i--) {
                if (second % i == 0 && first % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        else if(first==0) System.out.println(second);
        else if(second==0) System.out.println(first);
        else System.out.println(0);
    }
}
