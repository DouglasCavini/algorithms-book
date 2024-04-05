public class BubbleSort{

  public static void main(String[] args){
    final int[] data = {2,5,4,3,6,1};
    sort(data);
    printArray(data);
  }

  private static void sort(int[] data){
    
    boolean sorting = true;
    int index = data.length -1;

    while(sorting){
      sorting = false; 
      for(int i = 0; i < index; i++){
        if(data[i] > data[i+1]){
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
          sorting = true;
        }
      }
      index--;
    }
  }

  private static void printArray(int[] data){
    for (int i = 0; i < data.length; i++) {
     System.out.println(data[i]);
    }
  }
}
