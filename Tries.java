    
class TrieNode{
    TrieNode alphabet[] = new TrieNode[27];
    boolean is_word;
    
    TrieNode(){
        for(int i=0;i<27;i++){
            this.alphabet[i] = null;
            this.is_word = false;
        }
    }
}

class Tries{
    String english_alphabets = "0abcdefghijklmnopqrstuvwxyz";
    TrieNode root;
    
    Tries(){
        this.root = new TrieNode();
    }
    
    int getAlphabetNumber(char ch){
        int number = this.english_alphabets.indexOf(ch);
        return number;
    }
    
    void addString(String new_string){
        int new_string_length = new_string.length();
        TrieNode temp = this.root;
        for(int i=0;i<new_string_length;i++){
            int alphabet_number = this.getAlphabetNumber(new_string.charAt(i));
            if(temp.alphabet[alphabet_number] == null){
                temp.alphabet[alphabet_number] = new TrieNode();
                temp = temp.alphabet[alphabet_number];
            }
            else{
                temp = temp.alphabet[alphabet_number];
                
            }
            if(i == new_string_length - 1){
                temp.is_word = true;
            }
        }
    }
    
    boolean findWord(String find_string){
        int find_string_length = find_string.length();
        TrieNode temp = this.root;
        for(int i=0;i<find_string_length;i++){
            int alphabet_number = this.getAlphabetNumber(find_string.charAt(i));
            if(temp.alphabet[alphabet_number] == null){
                return false;
            }
            else{
                temp = temp.alphabet[alphabet_number];
            }
            if(i == find_string_length - 1){
                if(temp.is_word == false){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }

    boolean findPrefix(String find_prefix){
        int find_prefix_length = find_prefix.length();
        TrieNode temp = this.root;
        for(int i=0;i<find_prefix_length;i++){
            int alphabet_number = this.getAlphabetNumber(find_prefix.charAt(i));
            if(temp.alphabet[alphabet_number] == null){
                return false;
            }
            else{
                temp = temp.alphabet[alphabet_number];
            }
        }
        return true;
    }
    
}