public class ArrayExercise {
    public static void main(String[] args) {
        // declare int array
        int[] exerciseArray = {1,2,3,4,5,6,7,8,9,10};
        // print array elements
        for (int i = 0 ; i < exerciseArray.length ; i++){
            System.out.println("Element is:" + exerciseArray[i]);
        }
        // find the largest elements
        int largest = exerciseArray[0];
        for (int i = 1 ; i < exerciseArray.length ; i++){
            if (exerciseArray[i] > largest){
                largest = exerciseArray[i];
            }
        }
        System.out.println("largest Number is:"+largest);
        // sum of all elements
        int sum = 0;
        for (int i = 0 ; i < exerciseArray.length ; i++){
            sum  += exerciseArray[i];
        }
        System.out.println("Sum of Array is:" + sum);

    }
}
