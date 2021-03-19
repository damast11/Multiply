

import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (checkArgsIsBlank(args) && isNumeric(args)){
            int[] nums = parseStringToInt(args);
            Number number = args[0].equals("--alg1") ? alg1(nums[0], nums[1]) :
                    alg2(nums[0], nums[1]);
            System.out.println(number);
        }else
            System.out.println("invalid Arguments");
    }
    private static int[] parseStringToInt(String [] args){
        return Arrays.stream(args).skip(1).mapToInt(Integer::parseInt).toArray();
    }

    private static boolean checkArgsIsBlank(String[] args) {
        for (String arg: args){
            if (StringUtils.isBlank(arg)) return false;
        }
        return true;
    }
    private static boolean isNumeric(String[] args) {
        for (int i=1; i< args.length; i++){
            if (!StringUtils.isNumeric(args[i]))
                return false;
        }
        return true;
    }
    private static BigInteger alg1(int num1, int num2){
        return BigInteger.valueOf(num1*num2);
    }
    // sorry dont understand "should implement the algorithm from scratch"
    private static int alg2(int num1, int num2) {
        if (num1*num2<Integer.MAX_VALUE)
            return num1*num2;
        else return 0;
    }
}
