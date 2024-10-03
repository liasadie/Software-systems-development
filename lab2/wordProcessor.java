public class wordProcessor implements counter{
    private String text;

    public wordProcessor(){
        this.text = "";
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
       this.text = text;
    }

    public int countWords(String sentence){
        if(sentence == null || sentence.isEmpty()) {
            return 0;
        }
        return sentence.split("\\s+").length;
    }
    public int countLetters(String sentence){
        if(sentence == null || sentence.isEmpty()) {
            return 0;
        }
        int letters = 0;
        for (char c : sentence.toCharArray()) {
        if(Character.isLetter(sentence.charAt(0))) {
            letters++;
            }
        }
        return letters;
    }
    public int getLength(String sentence){
        if(sentence == null || sentence.isEmpty()) {
            return 0;
        }
        return sentence.length();
    }
}
