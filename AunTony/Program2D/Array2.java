import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] numA = {9,7,5,3,1};
        System.out.println("numA Array: "+Arrays.toString(numA));
        System.out.println("---------------------------------------");
        System.out.println("Sort: Arrays.sort([int] a)");
        Arrays.sort(numA);
        System.out.println("- Arrays.sort(numA) => "+Arrays.toString(numA));
        System.out.println("---------------------------------------");
        System.out.println("Search: Arrays.binarySearch(int[] a, int key)");
        int key = 1;
        int position =  Arrays.binarySearch(numA, key);
        System.out.printf("- Arrays.binarySearch(numA, %d): \n",key);
        if(position>=0){
            System.out.printf("- Found %d at position %d of array: %s\n",key,position,Arrays.toString(numA));
        }else{
            System.out.printf("Not Found %d in array: %s\n",key,Arrays.toString(numA));
        }
        System.out.println("---------------------------------------");
        System.out.println("Fill: Arrays.fill(int[] a,int val)");
        int val = 5;
        Arrays.fill(numA,val);
        System.out.printf("- Arrays.fill(numA, %d) => %s\n",val,Arrays.toString(numA));
        System.out.println("---------------------------------------");
        val = 5;
        int[] numB = Arrays.copyOf(numA, val);
        System.out.println("Copy: Arrays.copyOf(int[] original, int newLength)");
        System.out.printf("- int[] numB = Arrays.copy(numA, %d) => %s",val,Arrays.toString(numB));
        System.out.println("---------------------------------------");
        System.out.println("Equal: Arrays.equal(int[] a, int[] a2");
        boolean isEqual = Arrays.equals(numA, numB);
        System.out.println("- Arrays.equal(numA, numB) => "+ isEqual);
        System.out.println("---------------------------------------");
    }
}
