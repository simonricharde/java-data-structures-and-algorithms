public class ArrayReverse {

    public static void main (String [] args) {
        String [] sourceArray = {"a", "b", "c", "d", "e"};
        int length = getLength(sourceArray);
        System.out.println("*******************************");
        System.out.println("The Length of the array is : "+length);
        System.out.println("*******************************");
        if(length > 0) {
	        String [] resultArray = reverseArray(sourceArray, length);
	        for (String item : resultArray) {
	            System.out.println("The reversed Array: "+ item);
	        }
        }
    }

    public static String [] reverseArray(String [] source, int length) {
        String [] target = new String[length];
        int tempLength = length -1;
        for(int i = tempLength; i>=0; i--) {            
            target[tempLength-i] = source[i];
        }
        return target;
    }

    private static int getLength(String [] sourceArray)
    {
        int arrayCounter = 0;
        for (String item : sourceArray) { 
        	System.out.println("The Original Array: "+ item);
             arrayCounter++;
        }
        return arrayCounter;
    }
}