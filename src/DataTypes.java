import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0L;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        System.out.println("wow");
        return s;
    }
}
