
public class InsertionSort {
	private int arr[];
	private int idx;
	
	public InsertionSort(int max){
		arr = new int[max];
		idx = 0;
	}
	
	public static void main(String[] str){
		InsertionSort insertion = new InsertionSort(10);
		insertion.add(3);
		insertion.add(1);
		insertion.add(9);
		insertion.add(8);
		insertion.add(6);
		insertion.add(7);
		insertion.add(4);
		insertion.add(2);
		insertion.add(5);
		insertion.add(0);
		insertion.display();
		System.out.println();
		insertion.sort();
		
		System.out.println("\nAfter sorting...");
		insertion.display();
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
		int in,out;
		for(out=1;out<idx;out++){
			int temp = arr[out];
			in = out;
			
			while(in>0 && arr[in-1]>=temp){
				arr[in] = arr[in-1];
				--in;
			}
			arr[in] = temp;
			for(int i=0;i<idx;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	
	private void swap(int smallest,int sortedInt) {
		int temp = arr[sortedInt];
		arr[sortedInt] = arr[smallest];
		arr[smallest] = temp;
	}

	
}
