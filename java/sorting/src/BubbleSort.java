
public class BubbleSort {
	
	int[] arr;
	int idx=0;
	
	public BubbleSort(int max){
		arr = new int[max];
		
	}
	
	private void add(int num){
		arr[idx++] = num;
	}
	private void display(){
		for(int i=0;i<idx;i++){
			System.out.print(arr[i]+"  ");
		}
	}
	
	private void sort(){
		int n = idx;
		for(int i=n-1;n>0;n--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					swap(j);
				}
			}
		}
	}
	
	private void swap(int j) {
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
		
	}

	public static void main(String[] str){
		BubbleSort bubble = new BubbleSort(10);
		bubble.add(3);
		bubble.add(1);
		bubble.add(9);
		bubble.add(8);
		bubble.add(6);
		bubble.add(7);
		bubble.add(4);
		bubble.add(2);
		bubble.add(5);
		
		bubble.display();
		System.out.println("\nAfter sorting...");
		bubble.sort();
		bubble.display();
				
		
	}
}
