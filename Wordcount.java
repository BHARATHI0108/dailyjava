import java.util.Scanner;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {
            int words = 1;

            for (char c : s.toCharArray()) {
                if (c == ' ') words++;
            }

            max = Math.max(max, words);
        }

        return max;
    }
}

public class Wordcount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] sentences = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter sentence " + (i+1) + ": ");
            sentences[i] = sc.nextLine();
        }

        Solution sol = new Solution();
        int result = sol.mostWordsFound(sentences);

        System.out.println("Maximum words in a sentence: " + result);
    }
}