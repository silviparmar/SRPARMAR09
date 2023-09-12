package thread1;

public class BubbleSort {
	public static void main(String args[]) {
		
		 int n = 10;
	        int[] A = {4, 2, 6, 7, 1, 2, 9, 5, 8, 10};

	        bubbleSort(A, n);

	        System.out.println("Sorted Elements:");
	        printArray(A);
	    }

	    public static void bubbleSort(int[] A, int n) {
	        int i, j, temp;
	        for (i = 1; i < n; i++) {
	            for (j = 0; j <= n - i - 1; j++) {
	                if (A[j] > A[j + 1]) {
	                    temp = A[j];
	                    A[j] = A[j + 1];
	                    A[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void printArray(int[] A) {
	        for (int num : A) {
	            System.out.print(num + "\t");
	        }
	        System.out.println();
	    }
	
	}


