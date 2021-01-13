public class Radix{
  public static int nth(int n, int col){
    int ret= n;
    ret= ret/ (int) Math.pow(10, col);
    ret= Math.abs(ret %10);
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

public static void radixSortSimple(SortableLinkedList data){
  int max=0;
  for(int i=0; i< data.size(); i++){
    if(data.get(i) > max){
      max= data.get(i);
    }
  }
  int count= length(max);
    for(int i=0; i< count; i++){
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

    for(int j=0; j< data.size(); j++){
      int test= data.get(j);
      test= nth(test, i);
      if(test == 0) bucket0.add(data.get(j));
          else if(test == 1) bucket1.add(data.get(j));
          else if(test == 2) bucket2.add(data.get(j));
          else if(test == 3) bucket3.add(data.get(j));
          else if(test == 4) bucket4.add(data.get(j));
          else if(test == 5) bucket5.add(data.get(j));
          else if(test == 6) bucket6.add(data.get(j));
          else if(test == 7) bucket7.add(data.get(j));
          else if(test == 8) bucket8.add(data.get(j));
          else if(test == 9) bucket9.add(data.get(j));
      }
      SortableLinkedList[]buckets= {bucket1, bucket2, bucket3, bucket4, bucket5, bucket6, bucket7, bucket8, bucket9};
      Radix.merge(bucket0, buckets);

  for(int k=data.size()-1; k>=0; k--){
    data.remove(k);
  }
  data.extend(bucket0);
}
}



}
