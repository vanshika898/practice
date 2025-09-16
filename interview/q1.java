
public class q1 {

    public static int FindMaxNumber(int number) {
        String n = String.valueOf(number);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length() - 1; i++) {

            String sub = n.substring(i, i + 2);
            int num = Integer.parseInt(sub);
            if (num > max) {
                max = num;
            }

        }
        return max;

    }

    public static void main(String args[]) {
        int number = 1232124565;
        System.out.println(FindMaxNumber(number));
    }
}
