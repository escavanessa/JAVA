public class Dog {
    public String aOrAn(String word) {
        if (word == null || word.isEmpty()) {
            return "invalid input";
        }
        
        String firstLetter = word.substring(0, 1).toLowerCase();
        
        String[] letters = {"a","e","i","o","u"};
        
        
        for (String letter : letters) {
            if(firstLetter.equals(letter)) {
                return "an " + word;
            }
        }
        return "a " + word;
    }
    
}