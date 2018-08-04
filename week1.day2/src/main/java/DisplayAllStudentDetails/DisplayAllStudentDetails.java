package DisplayAllStudentDetails;

public class DisplayAllStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studName = {"Shanthi", "Mona","Vaishu"};
		int[] marks = {80,80,80};
		
		System.out.println("Display all student names:");
		for(String a:studName)
		{
			System.out.println(a);
		}
		
		System.out.println("\nDisplay all sudents age:");
		
		for(int b: marks)
		{
			System.out.println(b);
		}
}

}
