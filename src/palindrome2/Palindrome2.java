/*
 * Andrew Thompson
 * February 23, 2020
 * Determines how many palindromes are in a sentence
 */
package palindrome2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author tiein
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence;
        String[] splitSentence;
        int count = 0;
        ArrayList<String> palindromes = new ArrayList<String>(0);

        try {
            sentence = JOptionPane.showInputDialog("Words that are arranged the same way forwards as they are backwards are called palindromes."
                    + "\nThis program determines if a word is a palindrome.\n\nEnter a sentence(do not include a punctuation mark):");
            splitSentence = sentence.split(" ");

            for (String str : splitSentence) {
                String rev = "";
                //reverse the string
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev += str.charAt(i);
                }
                //check if string is a palindrome, then output to user
                if (rev.equalsIgnoreCase(str)) {
                    count++;
                    palindromes.add(str);
                }
            }

        } catch (NullPointerException e) {//make program exit properly if cancel option is chosen
            System.exit(0);
        }
        //output to the user how many palindromes, and what they are
        JOptionPane.showMessageDialog(null, ("There are " + count + " palindromes in the sentence."));
        if (count == 1){
           JOptionPane.showMessageDialog(null, ("The palindrome is:\n" + palindromes.toString()));
        }else if(count > 1){
            JOptionPane.showMessageDialog(null, ("The palindromes are:\n" + palindromes.toString()));
        }
    }
}
