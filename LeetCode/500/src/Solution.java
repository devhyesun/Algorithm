import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<String>();
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        Set<Character> set3 = new HashSet<Character>();
        int len = words.length;
        
        init(set1, set2, set3);
        
        for(int i=0; i<len; i++) {
        	int currentRow = -1;
        	int wordLen = words[i].length();
        	for(int j=0; j<wordLen; j++) {
        		char ch = words[i].toLowerCase().charAt(j);
        		
        		if(set1.contains(ch)) {
        			if(currentRow != -1 && currentRow != 1) {
        				currentRow = -1;
        				break;
        			}
        			currentRow = 1;
        		} else if(set2.contains(ch)) {
        			if(currentRow != -1 && currentRow != 2) {
        				currentRow = -1;
        				break;
        			}
        			currentRow = 2;
        		} else if(set3.contains(ch)) {
        			if(currentRow != -1 && currentRow != 3) {
        				currentRow = -1;
        				break;
        			}
        			currentRow = 3;
        		}
        	}
        	
        	if(currentRow != -1) {
        		list.add(words[i]);
        	}
        }
        
        int size = list.size();
        String[] result = new String[size];
        for(int i=0; i<size; i++) {
        	result[i] = list.get(i);
        }
        
        return result;
    }
    
    private void init(Set<Character> set1, Set<Character> set2, Set<Character> set3) {
    	set1.add('q');
    	set1.add('w');
    	set1.add('e');
    	set1.add('r');
    	set1.add('t');
    	set1.add('y');
    	set1.add('u');
    	set1.add('i');
    	set1.add('o');
    	set1.add('p');
    	
    	set2.add('a');
    	set2.add('s');
    	set2.add('d');
    	set2.add('f');
    	set2.add('g');
    	set2.add('h');
    	set2.add('j');
    	set2.add('k');
    	set2.add('l');
    	
    	set3.add('z');
    	set3.add('x');
    	set3.add('c');
    	set3.add('v');
    	set3.add('b');
    	set3.add('n');
    	set3.add('m');
    }
}