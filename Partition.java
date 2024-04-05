public class Partition{

  public static void main(String[] args){
    int[] data = {0, 5, 2, 1, 6, 3};

    partition(data);
    print(data);
  }

  private static void partition(int[] data){
    int pivot = data.length - 1;

    int leftPointer = 0;
    int rightPointer = pivot - 1;

    while(leftPointer < rightPointer){
     
      while(data[leftPointer] < data[pivot]){
        leftPointer++;
      }

      while(data[rightPointer] > data[pivot]){
        rightPointer--;
      }
      
      if(leftPointer < rightPointer){
        int temp = data[rightPointer];
        data[rightPointer] = data[leftPointer];
        data[leftPointer] = temp;
        leftPointer++;
      }
    }

    int temp = data[leftPointer];
    data[leftPointer] = data[pivot];
    data[pivot] = temp;
  }

  private static void print(int[] data){
    for(int i = 0; i < data.length; i++){
      System.out.println(data[i]);
    }
  }
}
