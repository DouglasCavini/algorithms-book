public class Binary{

	public static void main(String[] args){
		final int value = 9;	
		final int[] data = {2, 5, 9, 11, 17, 20, 23, 29, 32, 40};	

		System.out.println(rule(value, data));
	}

	private static int rule(int value, int[] data){
		int lowerBound = 0;
		int upperBound = data.length -1;

		while(lowerBound <= upperBound){
			int midPoint = (upperBound + lowerBound) / 2;
			int valueAtMidPoint = data[midPoint];
		
			if(value == valueAtMidPoint){
				return midPoint;
			}else if(value < valueAtMidPoint){
				upperBound = midPoint - 1;
			}else if(value > valueAtMidPoint){
				lowerBound = midPoint + 1;
			}
		}
		return -1;
	}

}
