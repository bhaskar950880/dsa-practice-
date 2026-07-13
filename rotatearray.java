public class rotatearray {
    static void func(int[] arr, int i, int first) {
        if (i == arr.length - 1) {
            arr[i] = first;
            return;
        }
        arr[i] = arr[i + 1];
        func(arr, i + 1, first);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        func(arr, 0, arr[0]);
        for (int x:arr) {
            System.out.print(x + " ");
        }
    }
}