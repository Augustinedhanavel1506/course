import java.util.Scanner;

class demo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int res[] = rearrange(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] rearrange(int arr[]) {
        int res[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]<0){
            res[k++] = arr[i];
           }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>=0){
                res[k++] = arr[j];
            }
        }
        return res;
    }
}
