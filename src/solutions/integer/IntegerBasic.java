package solutions.integer;

public class IntegerBasic {

    public static int solution(int[] num_list) {
        StringBuilder evenNumStr = new StringBuilder();
        StringBuilder oddNumStr = new StringBuilder();

        for(int num : num_list) {
            (num % 2 == 0 ? evenNumStr : oddNumStr).append(num);
        }

        return Integer.parseInt(evenNumStr.toString()) + Integer.parseInt(oddNumStr.toString());
    }

}
