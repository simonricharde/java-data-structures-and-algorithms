package code401challenges;

public class ArrayShift {

    public static void main (String aa[]) {
        ArrayShift a = new ArrayShift();
       // a.insertShiftArray(new int[] {2,4,6,8}, 5);
       // a.insertShiftArray(new int [] {4,8,15,23,42}, 16);
    }

    public int [] insertShiftArray(int [] inputArray, int newItem) {
        int inputArrayLength = inputArray.length;
        int middleIndex = (int) Math.ceil((double) inputArrayLength / 2);
        int [] resultArray = new int [inputArrayLength+1];
        System.out.println("Middle Index: "+ middleIndex);
        for (int i = 0; i < inputArrayLength; i++) {
            int j = i;
            if(i == middleIndex) {
                resultArray[j] = newItem;
                i--;
                middleIndex = 0;
            }
            else {
                if(i > middleIndex) {
                    j = i+1;
                }
                resultArray[j] = inputArray[i];
            }
        }
        for(int items:resultArray) {
            System.out.println("ShiftedArray: "+ items);
        }
        return resultArray;
    }
}
