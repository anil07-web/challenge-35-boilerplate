public class SinglyLinkedList {
    Node head;

    public void insert(Word word){
        if(word.word.length() == 0) return;
        Node node = new Node(word);
        if(head == null){
            head = node;
            return;
        }

        if(findWord(word) != null){
            findWord(word).word.count += 1;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = node;
        }
    }

    public Node findWord(Word word){
        Node temp = head;
        while(temp != null){
            if(temp.word.word.equals(word.word)){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public void showWordList(){
        Node temp = head;
        System.out.printf("%-20s \t\t %s\n", "Word", "Count");
        while(temp != null){
            System.out.printf("%-20s \t\t %d\n", temp.word.word, temp.word.count);
            temp =  temp.next;
        }
    }
    
}
