public class Radix{
  public static int nth(int n, int col){
    int ret= n;
    ret= ret/ (int) Math.pow(10, col);
    ret= ret %10;
    return ret;
}
public static int length(int n){
  int counter= 1;
  while(n / (int) 10 != 0){
  n= n/ (int)10;
  counter += 1;
  }
  return counter;
}

public static void merge( SortableLinkedList original, SortableLinkedList[]buckets){
  for(int i=0; i< buckets.length; i++){
    original.extend(buckets[i]);
  }
}



}
