import java.util.Arrays;

public class GreedyCoinProblem {
    public static void main(String[] args) {
        int[] coins ={1,5,10,25};
        int amount = 99;
//        최소 동전의 개수 산출
        Arrays.sort(coins);
        System.out.println(Arrays.toString(coins));
        for(int i = coins.length-1; i>=0 ; i--){
            int temp =0;
            if(amount>=0){
                temp = amount/coins[i];
                amount -= temp*coins[i];
            }
            System.out.println(coins[i] + "는 " + temp + " 개 입니다.");
        }
    }
}
