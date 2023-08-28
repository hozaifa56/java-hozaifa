/*Password Validation 



Problem statement



You are given a function: 

int CheckPassword(char str[ ], int n);



The function accepts string 'std of size int as argument Implement the function which returns 1 if given string 'str' is a valid password else 0. 

'str' is a valid password if it satisfies below conditions: 

At least 4 characters 
At least one numeric digit 
At least one Capital letter 
Must not have space or slash (/) 
Starting character must not be a number 
Assumption: Input string will not be empty. 
Example:
Input: 
aA1_67 
[a,A,1,_,6,7]
Output: 
1  */
public class acc3 {
    public static int CheckPassword(char[] str, int n) {
        if (n < 4) {
            return 0; // Not enough characters
        }

        if (Character.isDigit(str[0])) {
            return 0; // Starting character is a number
        }

        boolean hasDigit = false;
        boolean hasCapital = false;

        for (int i = 0; i < n; i++) {
            if (str[i] == ' ' || str[i] == '/') {
                return 0; // Contains space or slash
            }

            if (Character.isDigit(str[i])) {
                hasDigit = true;
            }

            if (Character.isUpperCase(str[i])) {
                hasCapital = true;
            }
        }

        if (!hasDigit || !hasCapital) {
            return 0; // Missing digit or capital letter
        }

        return 1; // Valid password
    }

    public static void main(String[] args) {
        char[] password = "P@ssw0rd".toCharArray();
        int result = CheckPassword(password, password.length);
        if (result == 1) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}

