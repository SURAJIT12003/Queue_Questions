public class apna {

    public static void func(int i, int arr[], int sum) {
        if (i == arr.length) {
            System.out.println(sum);
            return;
        }

        func(i + 1, arr, sum + arr[i]);

    }

    public static void main(String[] args) {
        int n = 6;
        int col = 0;
        int arr[][] = new int[n][n];
        int count = 1;
        int yt = 0;
        while (col != n) {
            if (yt == 0) {
                for (int i = col; i < n; i++) {
                    int t = count;
                    count++;
                    arr[i][col] = t;

                }
                yt = 1;
            } else {
                for (int i = n - 1; i >= col; i--) {
                    int t = count;
                    count++;
                    arr[i][col] = t;

                }
                yt = 0;
            }

            col++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(arr[i][j] + "  ");
                }

            }
            System.out.println();
        }
    }
}
