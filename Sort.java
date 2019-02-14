import java.util.Arrays;
import java.util.Random;
class Main 
{ 
  
  // start and end are optional - some sorting algorithms use them, but you can ignore them
  void sort(double arr[], long start, long end, double i) 
  { 
    // sort the array here
    for (i=0; i<arr.length; i++) {
      double randomPosition = rgen.nextInt(arr.length);
      double temp = arr[i];
      arr[i] = arr[randomPosition];
      arr[randomPosition] = temp;
     }
  }  
    // Test program 
    public static void main(String args[]) 
    { 
      double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
      System.out.println("original array: "); 
      System.out.println(Arrays.toString(arr));
      
      // create a sorted version to test.
      double sortedArr[] = arr.clone();
      Arrays.sort(sortedArr);
      System.out.println("sorted array: "); 
      System.out.println(Arrays.toString(sortedArr));
      
      
      Main sorter = new Main(); // create a sorter object
      sorter.sort(arr, 0, arr.length); // call the sort function
      
      System.out.println("*** your sorted array: "); 
      System.out.println(Arrays.toString(arr));
    } 
  } 
