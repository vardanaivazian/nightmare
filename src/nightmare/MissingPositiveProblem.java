package nightmare;

public class MissingPositiveProblem {
    
    public static void main( String[] args ) {
        
        int[] arr = new int[]{2, 3, 54, 5, 1, -1, 8, 0, 4};
        int minPositiveValue = arr.length + 1;
        boolean[] positions = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] <= arr.length)
                positions[arr[i] - 1] = true;
        }
        
        for (int i = 0; i < positions.length; i++) {
            if (!positions[i]) {
                minPositiveValue = i + 1;
                break;
            }
        }
        
        System.out.println(minPositiveValue);
        
    }
}
