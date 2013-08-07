
public class SelectionSort {
	private int arr[];
	private int idx;
	
	public SelectionSort(int max){
		arr = new int[max];
		idx = 0;
	}
	
	public static void main(String[] str){
		SelectionSort selection = new SelectionSort(10);
		selection.add(3);
		selection.add(1);
		selection.add(9);
		selection.add(8);
		selection.add(6);
		selection.add(7);
		selection.add(4);
		selection.add(2);
		selection.add(5);
		selection.add(0);
		selection.display();
		selection.sort();
		System.out.println("\nAfter sorting...");
		selection.display();
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
		int f = 0;		
		for(int i=n-1;n>0;n--){
			int smallest = f;
			for(int j=f;j<=i;j++){
				if(arr[smallest]>arr[j]){
					smallest = j;					
				}
			}
			swap(smallest,f);
			f++;
		}
	}
	
	private void swap(int smallest,int sortedInt) {
		int temp = arr[sortedInt];
		arr[sortedInt] = arr[smallest];
		arr[smallest] = temp;
		
	}

	
}
