public class BubbleSort1 {
	private int[] arr;
	private int max;

	public BubbleSort1(int max) {
		this.max = max;
		arr = new int[max];
		for (int i = 0; i < max; i++) {
			arr[i] = (int) (100 * Math.random());
		}
	}

	private void sort() {
		for (int j = max-1; j>1; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

	}

	private void display() {
		for (int i = 0; i < max; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	public static void main(String[] str) {
		BubbleSort1 bubble = new BubbleSort1(20);
		bubble.display();
		 bubble.sort();
		bubble.display();
	}

}
