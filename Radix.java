public class Radix{
  public static int nth(int n, int col){
    int ret= n;
    ret= ret/ (int) Math.pow(10, col);
    ret= ret %10;
    return ret;
}
}
