package Java_Basics_Info;

import java.util.Scanner;

public class ReferenceVariableStructure 
{
	ReferenceVariableStructure x; //Instance + Reference Var
	static ReferenceVariableStructure y; //static + Reference Var
	
		static Scanner sc = new Scanner(System.in); //static + Reference Var
		
		public void accept(ReferenceVariableStructure ref) // parameter variable
		{
			ReferenceVariableStructure refVar= new ReferenceVariableStructure();
			//Local Variable
			System.out.println("Executed");
		}

	public static void main(String[] args) 
	{
		ReferenceVariableStructure r1 = new ReferenceVariableStructure();
		r1.accept(r1);
		
		ReferenceVariableStructure r2 = new ReferenceVariableStructure();
		r2.accept(r2); // it accepts only reference variable as the parameter value  
		

	}

}
