import java.util.ArrayList;
import java.util.Arrays;

public class ThreeConsecutiveNumber {
    public static void main(String[] args) {
        System.out.println(indexOfNumber(4, 36, 2));
        System.out.println();


    }
    public static int indexOfNumber(int x, int y, int index){

        int num = (y/x) -1;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += num+ i;
        }
        return num + index ;
    }
}
