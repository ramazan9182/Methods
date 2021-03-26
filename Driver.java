
public class Driver {

// Library Programmer
// Client Programmer

	/**
	 * METHODS
	 * 
	 * () --> contains method parameter list
	 * 
	 * return_type --> can be any primitive type, reference type and Arrays (
	 * include "void" )
	 * 
	 * void --> do not expect any calculated value !
	 * 
	 * <method_modifier(s)**> <return_type> <method_name>( <parameter_type> parameter_name** , <parameter_type> parameter_name** , <parameter_type> parameter_name** .....){
	 * 
	 * 	// method-body
	 * 
	 * 	if return_type is not VOID then method MUST RETURN A RETURN_TYPE VALUE which
	 * 	is declared on method return type; 
	 * }
	 * 
	 * ** -> optionals (will be explained)
	 */

	public static void main(String[] args) {

//		Math.abs(3);

//		int a = 3;
//		int b = 5;

		// Calling Method
//		int sum = MyMath.sum(a, b);

//		System.out.println(sum);
//		
//		System.out.println("MAX of 3 and 5 : " + MyMath.max(3,5) );

//		System.out.println(StudentUtil.getGrade(70.9));

		System.out.println(MyMath.gcd(45, 80));

		// Abstraction ==> MyMath.gcd(number1, number2)

	}

}
