import java.util.Arrays;
public class Tester{
  public static void main(String[]args){
    int[] c = {};
    int[][] d = {};
    int[][] f = {
                            {1, 5},
                            {3, 3},
                            {-1, 7},
                           };
    int[][] e = {{}};
    int[] a = {1, 2, 3, 4, 5};
    int[][] b = {
                            {1, 2},
                            {3, 4},
                            {5, 6},
                           };

    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    System.out.println(Arrays.toString(ArrayOps.sumRows(b)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(d)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(b)));
    System.out.println(ArrayOps.sum(b));
    System.out.println(Arrays.toString(ArrayOps.sumCols(b)));
    System.out.println(Arrays.toString(ArrayOps.sumCols(d)));

  }
}
