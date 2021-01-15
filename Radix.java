public class Radix{
  public static int nth(int n, int col){
    int ret= n;
    ret= ret/ (int) Math.pow(10, col);
    ret= Math.abs(ret %10);
    return ret;
}
public static int length(int n){
  int ret= ((int) Math.log(n))+1;
  return ret;
}

public static void merge( SortableLinkedList original, SortableLinkedList[]buckets){ //good
  for(int i=0; i< buckets.length; i++){
    original.extend(buckets[i]);
  }
}

public static void radixSortSimple(SortableLinkedList data){
        SortableLinkedList bucket0= new SortableLinkedList();
        SortableLinkedList bucket1= new SortableLinkedList();
        SortableLinkedList bucket2= new SortableLinkedList();
        SortableLinkedList bucket3= new SortableLinkedList();
        SortableLinkedList bucket4= new SortableLinkedList();
        SortableLinkedList bucket5= new SortableLinkedList();
        SortableLinkedList bucket6= new SortableLinkedList();
        SortableLinkedList bucket7= new SortableLinkedList();
        SortableLinkedList bucket8= new SortableLinkedList();
        SortableLinkedList bucket9= new SortableLinkedList();

SortableLinkedList[]buckets= {bucket0, bucket1, bucket2, bucket3, bucket4, bucket5, bucket6, bucket7, bucket8, bucket9};
    int max=0;
   while(data.size() != 0){
    int current= data.remove(0);
    if(current > max){
      max= current;
    }
    int inserthere= (int) current%10;
    buckets[inserthere].add(current);
  }
  merge(data, buckets);
  int highestdigit= length(max);

    for(int i=0; i< highestdigit-1; i++){
      while(data.size() != 0) {
       int current= data.remove(0);
       int insert= nth(current, i+1);
       buckets[insert].add(current);
     }
     merge(data, buckets);
}
}



public static void radixSort(SortableLinkedList data){
  SortableLinkedList negatives= new SortableLinkedList();
  SortableLinkedList positives= new SortableLinkedList();
  for(int i=0; i< data.size(); i++){
    if( data.get(i)< 0 ) negatives.add(data.get(i)* -1);
      else{
        positives.add(data.get(i));
      }
  }
  radixSortSimple(positives);
  radixSortSimple(negatives);
  for(int k=data.size()-1; k>=0; k--){
    data.remove(k);
  }

  for(int k=negatives.size()-1; k>=0; k--){
    data.add(negatives.get(k) * -1);
  }
  data.extend(positives);
}


}
