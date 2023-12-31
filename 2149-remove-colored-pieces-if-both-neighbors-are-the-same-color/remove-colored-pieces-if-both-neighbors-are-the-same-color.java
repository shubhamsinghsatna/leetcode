public class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            char currentColor = colors.charAt(i);
            char prevColor = colors.charAt(i - 1);
            char nextColor = colors.charAt(i + 1);

            if (currentColor == 'A' && prevColor == 'A' && nextColor == 'A')
                aliceScore++; // Alice can remove 'A'

            else if (currentColor == 'B' && prevColor == 'B' && nextColor == 'B')
                bobScore++; // Bob can remove 'B'
        }

        return aliceScore > bobScore;
    }
}