public class LinearSearch

{
	
public static void main(String[] args)
	
{
		
int[] arr = {4, 6, 8, 7, 9, 2, 3, 1, 5, 0};
		
int target = 0;
		
		
for (int i = 0; i < arr.length; i++) 
{
			
if (arr[i] == target) 
{
				
System.out.println(target + " found at position " + (i+1));
			
}
		
}
	
}

}
