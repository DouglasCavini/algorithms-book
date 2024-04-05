public class Arrays{
	
	private static int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	public static void main(String[] args){
		System.out.println(contains(20));
	}

	private static boolean contains(final int value){
		for( int i = 0; i < data.length; i++){
			if( data[i] == value) {
				return true;
			}
		}
		return false;
	}
}
