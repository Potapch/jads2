package HW;

public class HW3 {
    public static void main(String[] args) {
        example(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16);
        example(1, 2, 4, 5, 6);
        example(1, 3);
    }
        public static int search(int []arr) {

            int start = 0;
            int end = arr.length -1;
            int base;

            while (end>= start) {
                base = (start + end)/2;
                if (base == arr[base]-1) {
                    start = base + 1;
                }
                else { end = base - 1;
                }
            }
        return start+1;
        }
public static void example(int...arr) {
    System.out.println(search(arr));
}

}
