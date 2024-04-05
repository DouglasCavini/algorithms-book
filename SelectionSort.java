public class SelectionSort{

  public static void main(String[] args){
    final int[] data = {3,8,7,5,9,2};
    sort(data);
    print(data);
  }

  private static void sort(int[] data){
    boolean sorted = false;
    int count = 0;

   while(!sorted){
     sorted = true;
     int lowestIndex = count;
     int lowestValue = data[count];

     for(int i = count+1; i < data.length; i++){
       
       if(data[i] <= lowestValue){
          lowestIndex = i;
          sorted = false;
       }

       if(data[count] == lowestValue){
         sorted = false;
       }
     }
     
     int temp = data[count];
     data[count] = data[lowestIndex];
     data[lowestIndex] = temp;
     count++;
   }
  }

  private static void print(final int[] data){
    for(int i = 0; i < data.length; i++){
      System.out.println(data[i]);
    }
  }
}
