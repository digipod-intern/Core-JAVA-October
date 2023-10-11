/* Variable
 * 1. Variable is a name of memory location.
 * 2. Variable is used to store data.
 * 3. Data could be any type and size.
 * 
 * Valid Variable Name
 * a - valid variable name
 * _a - valid variable name
 * _1 - valid variable name
 * a_bhi - valid variable name
 * 
 * Invalid Variable Name
 * 1 - invalid variable name
 * 1a - invalid variable name
 * a-b - invalid variable name
 * a b - invalid variable name
 * a#b - invalid variable name
 * @ab - invalid variable name
 * 
 * Variable Declaration and Initialization
 * DataType varibleName; -> Declaration
 * variableName = value; -> Initialization
 * DataType varibleName = value; -> Declaration and Initialization 
 */

/* Data Types
 * Primitive Data Types:
    * Numeric
        * 1. byte - 1 byte - 8 bits - 2^8 = 256 - 128 to 127
        * 2. short - 2 bytes - 16 bits - 2^16 = 65536 - -32768 to 32767
        * 3. int - 4 bytes - 32 bits - 2^32 = 4294967296 - -2147483648 to 2147483647
        * 4. long - 8 bytes - 64 bits - 2^64 = 18446744073709551616 - -9223372036854775808 to 9223372036854775807
        * 5. float - 4 bytes - 32 bits - 2^32 = 4294967296 - -2147483648 to 2147483647
            * float f = 10.2f;
            * float has less precision than double
            * stores 6 to 7 decimal digits
        * 6. double - 8 bytes - 64 bits - 2^64 = 18446744073709551616 - -9223372036854775808 to 9223372036854775807
            * double d = 10.2;
            * double has more precision than float
            * stores 15 decimal digits
    * Non-Numeric
        * Boolean: true or false
            * boolean b = true;
        * Character: single character
            * char = 'a';
 * Non-Primitive Data Types
    * 1. String: sequence of characters
        * String s = "Hello World";
        * String s = """Hello, My name is Navneet
                        Happy to see you here""";
    
    * 2. Array: sequence of identical values i.e. of same data type
         * int arr[] = {1, 2, 3, 4, 5};
         * int arr[] = new int[5];
*/

/* 
 * Data Type Conversion
 * 1. Implicit Type Conversion
    * Automatic Type Conversion
    * Widening Conversion
    * byte -> short -> int -> long -> float -> double

 * 2. Explicit Type Conversion 
    * Type Casting
    * Narrowing Conversion
    * double -> float -> long -> int -> short -> byte
*/

/* Arithmetic Operator
    * (+) Addition - Used for the addition of two operands
    * (-) Subtraction - Used for the subtraction of two operands
    * (*) Multiplication - Used for the multiplication of two operands
    * (/) Division - Used for the division of two operands and gives quotient as output
    * (%) Modulus - Used for the remainder of the division of two operands
*/

/* Assignment Operator
 * (=) Assignment - Used to assign the value of right side expression to left side operand
*/

/* 
 * Short Hand Assignment Operator
 * (+=) Addition Assignment - Used to add the value of right side expression to left side operand and assign the result to left side operand
 * (-=) Subtraction Assignment - Used to subtract the value of right side expression to left side operand and assign the result to left side operand
 * (*=) Multiplication Assignment - Used to multiply the value of right side expression to left side operand and assign the result to left side operand
 * (/=) Division Assignment - Used to divide the value of right side expression to left side operand and assign the result to left side operand
 * (%=) Modulus Assignment - Used to find the remainder of the division of right side expression to left side operand and assign the result to left side operand
*/

class Operators {
    public static void main(String[] args) {
        String name; // Declaration
        name = "Ayaz"; // Initialization

        System.out.println(name);
    }
}