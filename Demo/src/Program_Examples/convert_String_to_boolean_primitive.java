package Program_Examples;

class convert_String_to_boolean_primitive {

	public static void main(String[] args) {
		// String Objects
		String str1 = "false";

		// Case does not matter for conversion
		String str2 = "TrUe";

		// String to boolean conversion
		boolean bvar1 = Boolean.parseBoolean(str1);
		boolean bvar2 = Boolean.parseBoolean(str2);

		// Displaying boolean values
		System.out.println("boolean value of String str1 is: " + bvar1);
		System.out.println("boolean value of String str2 is: " + bvar2);
	}
}