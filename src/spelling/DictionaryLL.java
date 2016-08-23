package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	
    public DictionaryLL() {
		dict=new LinkedList<String>();
	}

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	word=word.toLowerCase();
    	if(dict.contains(word)){
    	return false;	
    	}
    	else {
    	dict.add(word);
    	return true;
    	}
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
    	if(dict.isEmpty()) { 
    		return 0;
    	}
    	else {
    	return dict.size();
    	}
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
        s=s.toLowerCase();
        if(dict.contains(s)){
        return true;	
        }
        else {
    	return false;
        }
    }

    
}