/*Problem statement:
The binary number system only uses two digits, 0 and 1. Any string that represents a number in the binary number system can be called a binary string. You are required to implement the following function: 
int OperationsBinaryString(char *str);
The function accepts a string 'str' as its argument. The string 'str' consists of binary digits separated with an alphabet as follows: 
'A' denotes AND operation 
'B' denotes OR operation 
'C' denotes XOR operation 
You are required to calculate the result of the string 'str', scanning the string left to right, taking one operation at a time, and return the same. 
Note:
No order of priorities of operations is required. 
Length of 'str' is odd 
If 'str' is NULL or None(in case of python), return -1 
Example:
Input: 
str: ICOCICIAOBI 
Output: 
1 */
public class acc2 {
    public static int operationsBinaryString(String str) {
        int result = 0; // Initialize the result to 0
        int length = str.length();

        // Loop through the string
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);

            if (currentChar == '0' || currentChar == '1') {
                // If the character is a binary digit (0 or 1), perform the operation
                char operation = str.charAt(i - 1);
                
                if (operation == 'A') {
                    result = result & (currentChar - '0'); // Perform AND operation
                } else if (operation == 'B') {
                    result = result | (currentChar - '0'); // Perform OR operation
                } else if (operation == 'C') {
                    result = result ^ (currentChar - '0'); // Perform XOR operation
                } else {
                    // Handle other cases or raise an error
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "A010B110C101"; // Example input
        int result = operationsBinaryString(str);
        System.out.println("Result: " + result); // Print the result
    }
}

