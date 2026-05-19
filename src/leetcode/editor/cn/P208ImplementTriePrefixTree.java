package leetcode.editor.cn;
//A trie (pronounced as "try") or prefix tree is a tree data structure used to 
//efficiently store and retrieve keys in a dataset of strings. There are various 
//applications of this data structure, such as autocomplete and spellchecker. 
//
// Implement the Trie class: 
//
// 
// Trie() Initializes the trie object. 
// void insert(String word) Inserts the string word into the trie. 
// boolean search(String word) Returns true if the string word is in the trie (
//i.e., was inserted before), and false otherwise. 
// boolean startsWith(String prefix) Returns true if there is a previously 
//inserted string word that has the prefix prefix, and false otherwise. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
//[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
//Output
//[null, null, true, false, true, null, true]
//
//Explanation
//Trie trie = new Trie();
//trie.insert("apple");
//trie.search("apple");   // return True
//trie.search("app");     // return False
//trie.startsWith("app"); // return True
//trie.insert("app");
//trie.search("app");     // return True
// 
//
// 
// Constraints: 
//
// 
// 1 <= word.length, prefix.length <= 2000 
// word and prefix consist only of lowercase English letters. 
// At most 3 * 10⁴ calls in total will be made to insert, search, and 
//startsWith. 
// 
//
// 👍 1933 👎 0


public class P208ImplementTriePrefixTree {
    public static void main(String[] args) {
        Trie trie = new P208ImplementTriePrefixTree().new Trie();
        
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Trie {
        private final Trie[] next;
        private boolean isEnd;

        public Trie() {
            this.next = new Trie[26];
            this.isEnd = false;
        }

        public void insert(String word) {
            if (word == null || word.length() == 0) {
                return;
            }
            Trie cur = this;
            int n = word.length();
            for (int i = 0; i < n; i++) {
                int index = word.charAt(i) - 'a';
                if (cur.next[index] == null) {
                    cur.next[index] = new Trie();
                }
                cur = cur.next[index];
            }
            cur.isEnd = true;
        }

        public boolean search(String word) {
            if (word == null || word.length() == 0) {
                return true;
            }
            Trie cur = this;
            int n = word.length();
            for (int i = 0; i < n; i++) {
                int index = word.charAt(i) - 'a';
                if (cur.next[index] == null) {
                    return false;
                }
                cur = cur.next[index];
            }
            return cur.isEnd;
        }

        public boolean startsWith(String prefix) {
            if (prefix == null || prefix.length() == 0) {
                return true;
            }
            Trie cur = this;
            int n = prefix.length();
            for (int i = 0; i < n; i++) {
                int index = prefix.charAt(i) - 'a';
                if (cur.next[index] == null) {
                    return false;
                }
                cur = cur.next[index];
            }
            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}