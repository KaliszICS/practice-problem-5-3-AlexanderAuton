/**
	* File: Lesson 5.3 - Add/Remove
	* Author: Auton
	* Date Created: April 30, 2026
	* Date Last Modified: Jun 14, 2026
*/	
public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static String[] addString(String[] arr, String str, int index) {
        String[] newArr = new String[arr.length + 1];
        int oldIndex = 0;

        for (int i = 0; i < newArr.length; i++) {
            
			if (i == index) {
                newArr[i] = str;
            } 
				else {
                	newArr[i] = arr[oldIndex];
                	oldIndex++;
            }
        }

        return newArr;
    }

    public static char[] removeChars(char[] arr, char character) {
        
		int count = 0;

        for (int i = 0; i < arr.length; i++) {
            
			if (arr[i] == character) {
                count++;
            }
        }

        char[] newArr = new char[arr.length - count];
        
		int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            
			if (arr[i] != character) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }

        return newArr;
    }
}