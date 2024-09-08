package Arrays1;

import java.util.List;

public class BirthdayCandles {
    public static void main(String[] args) {

    }
    static int cakeCandles(List<Integer> candles){
        int maximum=Integer.MAX_VALUE;
        for(Integer candle:candles){
            if(candle>=maximum){
                maximum=candle;
            }
        }
        int result=0;
        for(Integer candle:candles){
            if(candle==maximum)
                result++;
        }
        return result;
    }
}
