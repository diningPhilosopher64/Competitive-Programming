class Solution 
{
    public int countCharacters(String[] words, String chars) 
    {
        if(chars.length() == 0 || words.length == 0)
            return 0;
        
        HashMap<Character, Integer> original = new HashMap<>();
        
        char temp;
        for(int i = 0; i < chars.length(); i++)
        {
            temp = chars.charAt(i);
            if(original.containsKey(temp))
                original.put(temp, original.get(temp) + 1);
            
            else
                original.put(temp, 1);
            
        }
        
        
        int result = 0, count; HashMap<Character, Integer> copy = new HashMap();
        boolean goodWord;
        
        for(String word : words)
        {
            copy.putAll(original); goodWord = true;
            for(int i = 0; i < word.length(); i++)
            {
                temp = word.charAt(i);
                
                if(copy.containsKey(temp))
                {
                    count = copy.get(temp);  count -= 1;
                    
                    if(count == 0)
                        copy.remove(temp);                    
                    else
                        copy.put(temp, count);                   
                }
                
                else
                {
                    goodWord = false;
                    break;   
                }                
            }
            
            if(goodWord)
                result += word.length();
            
            copy.clear();
        }
        
        
        
        return result;
    }
}