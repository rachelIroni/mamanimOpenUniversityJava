
/**
 * The program gets an array of even coins and makes that amir picks coins (the
 * first player)that he never loose the game 
 * @author (Racheli Ironi)
 * @version (2020b)
 * space O()
 * time O()
 */
public class CoinsGame
{
    static void win (int [] arr )
    {
        int n = arr.length;
        // Find sum of even location cells 
        int evenSum = 0;
        for (int i = 0; i < n; i += 2)
            evenSum += arr[i];

        // Find sum of odd location cells
        int oddSum = 0;
        for (int i = 1; i < n; i += 2)
            oddSum += arr[i];

        int first = 0;  
        if  (evenSum > oddSum) 
            first = 0;
        else
            first = 1;
        int countI=0;
        int countJ=0;
        int j=n-1;
        for (int i = 0 ; i < j ;i+=countI,j-=countJ) 
        {
            if (first == 0 && i%2 ==0) { 
                System.out.println( "Amir took " + arr[i]);
                countI++;
            }
            else if (first == 0 && j%2 ==0){
                System.out.println( "Amir took " + arr[j]);
                countJ++;}

            else if (first == 1 && i%2 !=0){
                System.out.println( "Amir took " + arr[i]);
                countI++;}

            else if (first == 1 && j%2 !=0){
                System.out.println( "Amir took " + arr[j]);
                countJ++;}

            if (arr[i+1] > arr[j])
            {
                System.out.println( "Tamar took " + arr[i+1]);
                countI++;
            }
            else
            {
                System.out.println( "Tamar took " + arr[j]+ " ");
                countJ++;
            }
        }

        if (first == 0) {
               System.out.println("Amir total " + evenSum);
               System.out.println("Tamar total " + oddSum);
            }
            else
            {
              System.out.println("Amir total " + oddSum);
              System.out.println("Tamar total " + evenSum);  
            }
    }
    
    public static void main(String[] args) 
{ 
    int arr1[] = { 30, 15, 3, 7 }; 
    int n = arr1.length; 
    win(arr1); 
    System.out.println(); 
  
    int arr2[] = { 2, 2, 2, 2 }; 
    n = arr2.length; 
    win(arr2); 
    System.out.println(); 
  
    int arr3[] = { 1000, 30, 2, 2, 2, 10 }; 
    n = arr3.length; 
    win(arr3); 
    
    int arr4[] = { 100000, 15, 2,1000, 1000, 10, 1000,1000 }; 
    n = arr4.length; 
    win(arr4); 
} 
    
}
