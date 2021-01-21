public class TextAnalyzer {

    public static void main(String[] args) throws Exception {
        SingleLinkedList daff = new SingleLinkedList();
        Word wrd = new Word();
        Word[] wordarray = wrd.ReadWords();
        for (Word word : wordarray) {

            daff.addWord(word.word);
        }
        daff.showList();
    }

}
