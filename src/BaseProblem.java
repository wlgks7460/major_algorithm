import java.util.ArrayList;
import java.util.List;

public class BaseProblem {
    public static void main(String[] args) {
        int n = 125;
        int answer = 0;
        List<Integer> temp = new ArrayList<>();
        while(n!=0){
            temp.add(n%3);
            n/=3;
        }
        int a = 1;
        for(int i =temp.size()-1 ; i>=0; i--){
            answer += temp.get(i)*a;
            a *= 3;

        }
        System.out.println(answer);
    }
}
