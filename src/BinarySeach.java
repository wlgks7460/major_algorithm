import java.util.Arrays;

public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int find = 7;
        int count =0;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == find){
                System.out.println("인덱스 : " + mid + "에 있습니다." + count +" 번 만에 찾음");
                return;
            }
            if(arr[mid]<find){
                start = mid+1;
            }else if(arr[mid]>find){
                end = mid -1;
            }
            count ++;
        }
    }
}
