public class Main {
    public static void main(String[] args) {
        int[] arr = {2,57,1,4,6,8,7};
        System.out.println(quickSelect(arr));
    }

    public static int quickSelect(int[] arr){
        int left =  0;
        int right  = arr.length - 1;

        if (right == -1){
            return -1;
        } else if (left == right){
            return arr[0];
        }

        int med = (int) Math.ceil(arr.length/2.0) - 1;
        int point;
        while (left <= right){
            point = partition(arr, left, right);
            if (point == med){
                return arr[point];
            } else if (point > med){
                right = point - 1;
            } else {
                left = point + 1;
            }
        }
        return -1;

    }

    // QuickSort P By AnkitRai01
    static int partition(int arr[],
                         int low, int high)
    {
        int temp;
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return (i + 1);
    }
}
