import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) throws Exception {
        // Create a File instance
        java.io.File file = new java.io.File("vowels.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);
        
        // Create the Content String        
        String fileContent = "";

        // Read data from a file
        while (input.hasNext()) {
            fileContent += input.next() + " ";
        }
        // Close the file
        input.close();

        //Split the string into a character array
        char[] charArr = fileContent.toCharArray();

        //loop through every character to find the vowels
        int temp = 0;
        for(char c : charArr)
        {
              if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
                   temp++;
        }
       
        
        System.out.println("Number of Vowels: " + temp);
    }
}