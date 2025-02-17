class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";

        // Store characters in a set
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If character does not have both cases, split at this point
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) {
                continue;
            }

            // Split and check left and right parts
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));

            // Return the longer one
            return left.length() >= right.length() ? left : right;
        }

        return s; // If the whole string is nice, return it
    }
}
