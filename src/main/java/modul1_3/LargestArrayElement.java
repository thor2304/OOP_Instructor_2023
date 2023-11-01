package modul1_3;

public class LargestArrayElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,6,3,109,1,6,4,7,7};

        int indexOfLargest = 0;

        for (int indexOfCandidate = 1; indexOfCandidate < array.length; indexOfCandidate++){
            if(array[indexOfCandidate] > array[indexOfLargest]){
                indexOfLargest = indexOfCandidate;
            }
        }

        System.out.println("The largest value is: " + array[indexOfLargest] + " at index: " + indexOfLargest);
    }
}
