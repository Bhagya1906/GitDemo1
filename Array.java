//1d Array in Ds

public class Main
{
	public static void main(String[] args) {
	
	    int[] arr = new int[10];
	    int count=1;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=count;
	        count++;
	        System.out.println(arr[i]);
	    }
	}
}