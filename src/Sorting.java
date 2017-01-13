
public class Sorting {
	
	public static void main(String[] args) {
		int arr [] = {4,2,1,7,3,6,5};
		selectSort(arr);
		String sorted = "";
		for (int i = 0; i < arr.length; i++) {
			sorted = sorted + arr[i] + ", ";
		}
		System.out.println(sorted);
	}

	static void bubbleSort(int [] arr){
		int j;
		int temp;
		
		for(int k = 1; k < arr.length; k++)	{
			for(int i = 0; i<arr.length -k ; i++){
				j = i+1;
					
				if (arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
							
				}
			}
			
		}
	}
	
	static void selectSort(int [] arr){
		
		int small;
		int temp;
		
		for (int i = 0; i < arr.length-1; i++) {
			small = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[small] > arr[j]){
					small = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[small];
			arr[small] = temp;
			
			String sorted = "";
			for (int k = 0; k < arr.length; k++) {
				sorted = sorted + arr[k] + ", ";
			}
			System.out.println(sorted);
			
		}
	}
}
