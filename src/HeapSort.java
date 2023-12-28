import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};

//        최초 힙구성 : n/2번 만큼 heapify

        for(int i = arr.length/2-1 ; i>=0 ; i-- ){
            heapify(arr, arr.length, i);
        }

//        최초 힙구성 이후에 root노드와 마지막 노드와 change
        for(int i = arr.length-1 ; i>=0 ; i--){
//            0번째와 마지막 자리 change
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
//
        System.out.println(Arrays.toString(arr));

    }



    static void heapify(int[] arr, int n, int root){
            int max_index = root;
            int left = root * 2 + 1;
            int right = root * 2 + 2;
            if (left < n && arr[max_index] < arr[left]){
                max_index = left;
            }
            if (right < n && arr[max_index] < arr[right]){
                max_index = right;
            }
            if (max_index != root){
                swap(arr, root, max_index);
                heapify(arr, n, max_index);
            }
        }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
