package SQRTDecomposition62;

public class SqrtDecomp {
    public static int sumQuery(int[] blocks, int[] arr, int left, int right, int sqrt) {
        if ((left > right) || left < 0 || right > arr.length - 1) {
            System.out.println("Invalid query");
            return -1;
        }
        int ans = 0;

        // left part
        while (left%sqrt != 0 && left <= right) {
            ans += arr[left++];
        }

        // middle part
        while (left + sqrt - 1 <= right) {
            ans += blocks[left / sqrt];
            left += sqrt;
        }

        // right part
        while (left <= right) {
            ans += arr[left++];
        }

        return ans;
    }

    public void update(int[] blocks, int[] arr, int idx, int val, int sqrt) {
        if (idx < 0 || idx > arr.length - 1) {
            System.out.println("Invalid idx");
            return;
        }
        blocks[idx / sqrt] += (val - arr[idx]);
        arr[idx] = val;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
        int n = arr.length;

        // Build block array
        int sqrt = (int)Math.sqrt(n);
        int[] blocks = new int[(n + sqrt - 1) / sqrt];

        int blockId = -1;
        for (int i = 0; i < n; i++) {
            if ((i % sqrt) == 0) {
                blockId++;
            }

            blocks[blockId] += arr[i];
        }
        System.out.println(sumQuery(blocks, arr, 2, 7, sqrt));
    }
}
