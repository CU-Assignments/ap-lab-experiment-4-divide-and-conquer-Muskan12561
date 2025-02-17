public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            result <<= 1;         // Shift result left
            result |= (n & 1);    // Extract rightmost bit and add to result
            n >>= 1;              // Shift n right to process the next bit
        }
        
        return result;
    }
}
