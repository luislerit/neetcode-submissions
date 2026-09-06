/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int R = n;
        int L = 1;
        while(L<=R) {
            int middle = L+(R-L) /2;
            if(guess(middle) > 0) {
                L = middle+1;
            } else if(guess(middle) <0) {
                R = middle -1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}