class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        StringBuilder longestPrefix = new StringBuilder();
        String first = strs[0];
        boolean flag = false;
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (ch == strs[j].charAt(i)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                longestPrefix.append(ch);
            } else {
                break;
            }
        }
        return longestPrefix.toString();
    }

    // Other Provided solutions:
    /*
    1. Horizontal Scanning
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < Math.min(prefix.length(), strs[i].length())) {
                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
    */
    /*
    2. Vertical Scanning
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return s.substring(0, i);
                }
            }
        }
        return strs[0];
    }
    */

    /*
    3. Sorting
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        Arrays.sort(strs);
        int N = Math.min(strs[0].length(), strs[strs.length - 1].length());
        for (int i = 0; i < N; i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
    */

    /*
    4. Trie
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }

    class Trie {
        TrieNode root = new TrieNode();

        void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                node.children.putIfAbsent(c, new TrieNode());
                node = node.children.get(c);
            }
        }

        int lcp(String word, int prefixLen) {
            TrieNode node = root;
            int i = 0;
            while (i < Math.min(word.length(), prefixLen)) {
                if (!node.children.containsKey(word.charAt(i))) {
                    return i;
                }
                node = node.children.get(word.charAt(i));
                i++;
            }
            return Math.min(word.length(), prefixLen);
        }
    }

    public class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 1) {
                return strs[0];
            }

            int mini = 0;
            for (int i = 1; i < strs.length; i++) {
                if (strs[mini].length() > strs[i].length()) {
                    mini = i;
                }
            }

            Trie trie = new Trie();
            trie.insert(strs[mini]);
            int prefixLen = strs[mini].length();

            for (int i = 0; i < strs.length; i++) {
                prefixLen = trie.lcp(strs[i], prefixLen);
            }

            return strs[0].substring(0, prefixLen);
        }
    }
    */
}