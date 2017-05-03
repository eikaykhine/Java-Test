package underscoresInNumericLiterals;

public class UnderScoresInNumericLiterals {
	public static void main(String[] args) {
		long creditCardNumber = 1234_5678_9012_3456L;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexBytess = 0xFF_EC_DE_5F;
		long bytes = 0b11010010_01101001_10010100_10010010;
		float pi = 3.14_15F;
		int x1 = 5_2344_1298;
		int x4 = 5______2;
		int x9 = 0_52;
		int x10 = 05_2;
		int thousand = 1_000;
		System.out.println("bytes " + bytes);
		System.out.println("thousand " + thousand);
		System.out.println("x10 " + x10);
		System.out.println("x9 " + x9);
		System.out.println("x1 " + x1);
		System.out.println("x4 " + x4);
		System.out.println("Credit Card No." + creditCardNumber);
		System.out.println("HexBytes " + hexBytes);
		System.out.println("HexBytess " + hexBytess);
		System.out.println("Bytes " + bytes);
		System.out.println("Pi Value " + pi);

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} catch (Exception e) {
			System.out.println("common task completed");
		}

		//
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		int arr[] = new int[5];
		
		try {
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;
			// arr[5] = 5;// this makes ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException
			result = num1 / num2;// this makes ArithmeticException
			System.out.println("Result of Division at try block : " + arr[0]);

		} catch (ArithmeticException e) {
			System.out.println("Err: Divided by Zero");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Err: Array Out of Bound");
		} finally {
			arr[0] = 2;
			arr[1] = 3;
			arr[2] = 4;
			arr[3] = 5;
			arr[4] = 6;
			System.out.println("Result of Division at finally block : " + arr[0]);
		}
	}
}
