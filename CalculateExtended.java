public class CalculateExtended{
	public static void main(String[] args){
		System.out.println("Calculate...");
		long first;
		long second;
		double a;
		double b;
		try{
			first = Long.valueOf(args[0]);
			second = Long.valueOf(args[1]);
			long sum = first + second;
			long difference = first - second;
			long multiplication = first*second;
			double dFirst = first;
			double dSecond = second;
			double division = dFirst/dSecond;
			double powering = Math.pow(dFirst, dSecond);
			System.out.println("Sum " + sum);
			System.out.println("difference " + difference);
			System.out.println("multiplication " + multiplication);
			System.out.println("division " + division);
			System.out.println("powering " + (new Double(powering)).longValue());
			
		} catch (NumberFormatException e) {
			a = Double.valueOf(args[0]);
			b = Double.valueOf(args[1]);
			double sum = a + b;
			double difference = a - b;
			double multiplication = a*b;
			double division = a/b;
			double powering = Math.pow(a, b);
			System.out.println("Sum " + sum);
			System.out.println("difference " + difference);
			System.out.println("multiplication " + multiplication);
			System.out.println("division " + division);
			System.out.println("powering " + powering);
		}
		
		
	}
}