package solutions.problems1;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HateSameNumber {

    public int[] HateArrayList(int[] arr) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                numbers.add(arr[i]);
            }
        }

        int[] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }

        return result;
    }

    public Stack<Integer> hateStack(int []arr) {

        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            if(stack.size() == 0 || stack.peek() != num){
                stack.push(num);
            }
        }
        return stack;
    }

}
