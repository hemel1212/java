package ScondClass;

public class AverageArray {
    public static void main(String[] args) {
       
        int[] i = {10, 20, 50, 60, 70};

        int average = calculateAverage(i);

        
        System.out.println("The average value is: " + average);
    }

    
    public static int calculateAverage(int[] array) {
        int sum = 0;

        
        for (int num : array) {
            sum += num;
        }
        
        return (int) sum / array.length;
    }
}
