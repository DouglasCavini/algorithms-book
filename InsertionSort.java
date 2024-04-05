public class InsertionSort{

  public static void main(String[] args){
   
    final int[] data = {4, 2, 7, 1, 3};

    sort(data);
    print(data);
  }

  private static void sort(int[] data){

    for(int i = 1; i < data.length ; i++){

      int position = i;
      int temp_value = data[i];

      while(position > 0 && data[position - 1] > temp_value){
        data[position] = data[position - 1];
        position--;
      }
      data[position] = temp_value;
    }
  }

  private static void print(int[] data){
    for(int i = 0; i < data.length; i++){
      System.out.println(data[i]);
    }
  } 
}
