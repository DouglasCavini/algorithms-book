public class Palindromic {

  public static void main(String[] args){
    final String str = "hellosannasmith";
    final String str2 = "hello";
    System.out.println(find(str));
  }

  private static String find(final String str){

    for(int i = 0; i < str.length(); i++){
      for(int j = i; j <= str.length(); j++){
        final String subString = str.substring(i, j);

        if(subString.length() > 2){
          if(isPalindromic(subString)){
            return subString;
          }
        }
      }
    }

    return "none";
  }

  private static boolean isPalindromic(final String str){
    int left = 0;
    int right = str.length() -1;

    while(left < right){

      if(str.charAt(left) != str.charAt(right)){
        return false;
      }

      left++;
      right--;
    }
    return true;
  }
}
