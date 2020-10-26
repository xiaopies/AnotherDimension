public class ArrayOps{
  public static int sum(int[] arr){
    int sum =0;
    for (int i =0; i<arr.length; i++){
      sum+=arr[i];
    }
    return sum;
  }
  public static int largest(int[] arr){
    int big = Integer.MIN_VALUE;
    for (int i =0; i< arr.length; i++){
      if (arr[i] > big){
        big = arr[i];
      }
    }
    return big;
  }
  public static int[] sumRows(int[][] matrix){
    int[] b = new int[0];
    if (matrix.length == 1 && matrix[0].length==0){
      return b;
    }
    int[] a = new int[matrix.length];
    for (int i = 0; i<matrix.length; i++){
      a[i] += sum(matrix[i]);
    }
    return a;
  }
  public static int[] largestInRows(int[][] matrix){
    int[] a = new int[matrix.length];
    for (int i = 0; i<matrix.length; i++){
      a[i] += largest(matrix[i]);
    }
    return a;
  }
  public static int sum(int[][] arr){
    int a = 0;
    for (int i = 0; i<arr.length; i++){
      a+= sum(arr[i]);
    }
    return a;
  }
  public static int[] sumCols(int[][] matrix){
    int[] b = new int[0];
    if (matrix.length <= 0){
      return b;
    }
    int[] a = new int[matrix[0].length];
    for (int i = 0; i<matrix.length; i++){
      for (int j = 0; j< matrix[i].length; j++){
        a[j] += matrix[i][j];
      }
    }
    return a;
  }
  public static boolean isRowMagic(int[][] matrix){
    int[] a = sumRows(matrix);
    for (int i = 0; i<a.length; i++){
      if (a[i] != a[0]){
        return false;
      }
    }
    return true;

}


}
