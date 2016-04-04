public class Bubble{ 
	public static void main(String args[]){
		//create an int array to sort
		int Array[]={4,2,5,20,3,100,50,80};
		int i;
		
		//sort an array using bubble sort algorithm
		BubbleSort(Array,Array.length);
		
		//print array after sorting
		System.out.println("Array after Sorting:");	
			for(i=0;i<Array.length;i++){
			System.out.print(Array[i] + " ");
			}
	}

public static void BubbleSort(int[] Array,int length){
	int index,counter,temp;
	
	//compare the element with the next one
	for(counter=0;counter<=length-1;counter++){
		//Compare array[n-1] & array[n]
		for(index=0;index<length-1-counter;index++){
			if(Array[index]>Array[index+1]){
			//if [n-1] > array[n] swap the elements	
			temp=Array[index];
			Array[index]=Array[index+1];
			Array[index+1]=temp; 
			} 
		} 
	}
}
}
