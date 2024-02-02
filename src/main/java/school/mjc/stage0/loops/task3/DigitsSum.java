package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String s = Math.abs(t) + "";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result+=(int) s.charAt(i)-48;
        }
        System.out.println(result);
    }
}
