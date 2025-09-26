package TRIE_Data_Structure;

public class TDS {
    static class Node {
        Node[]children; //26
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow =false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){ //O(L)
            int idx = word.charAt(i) - 'a';
 
            if (curr.children[idx] == null) {
                //add new Node
                curr.children[idx] = new Node();
            }
            if (i == word.length()-1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){ //O(L); L = key length
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }
            if (i == key.length() -1 && node.eow == false) {
                return false;
            }

            curr = node;
        }

        return true;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("their")); // true
        System.out.println(search("thor")); //false
        System.out.println(search("an")); //false
    }
}
