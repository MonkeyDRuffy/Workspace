package Arrays;

public class Tonsignal {

	public static void main(String[] args) {
		
		int[] signal = new int[] {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
		int[] smoothedSignal = new int[signal.length];
		
		smoothedSignal[0] = signal[0] + signal[1] / 2;
		smoothedSignal[smoothedSignal.length- 1] = (signal[signal.length - 1] + signal[signal.length -2]) / 2;
		
		for(int i = 1; i < smoothedSignal.length - 1; i++) {
			smoothedSignal[i] = (signal[i - 1] + signal[i] + signal[i + 1]) / 3;
		}
		
		System.out.println("\nUrsprüngliches Signal: ");
		for (int i = 0; i <signal.length; i++) {
			System.out.print(signal[i] + " ");
		}
		
		System.out.println("\nGeglättetes Signal: ");
		for (int i = 0; i <signal.length; i++) {
			System.out.print(smoothedSignal[i] + " ");
		}
	}

}
