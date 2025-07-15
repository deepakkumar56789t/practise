public class UniqueNumberThree {
    public static int getSingle(int[] arr) {
        int ones = 0, twos = 0, mask;

        for (int num : arr) {
            twos |= ones & num;
            ones ^= num;
            mask = ~(ones & twos);
            ones &= mask;
            twos &= mask;
        }

        return ones;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 1, 1};
        System.out.println(getSingle(arr));
    }
}
