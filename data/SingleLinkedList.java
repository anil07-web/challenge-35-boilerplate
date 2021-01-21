public class SingleLinkedList {
    Node head = null;

    public void addWord(String word) {
        Node new_node = new Node(word);
        int find = findWord(word);
        if (head == null) {
            head = new_node;
            head.word.noofoccur += 1;
        } else {
            updateoccur(word);
            Node temp = head;
            if (find == 0) {
                while (temp.next != null) {

                    temp = temp.next;
                }
                temp.next = new_node;
                new_node.word.noofoccur += 1;
            }

        }

    }

    public int findWord(String w) {

        Node temp = head;
        int count = 0;
        Node new_node = new Node(w);
        if (head == null) {
            return -1;
        } else {
            while (temp != null) {

                if (temp.word.word.equalsIgnoreCase(w)) {

                    new_node.word.noofoccur += 1;
                    count += 1;
                }

                temp = temp.next;
            }
            return count;
        }
    }

    public void showList() {

        Node temp_node = head;
        while (temp_node.next != null) {
            System.out.println(temp_node.word.word + "  " + temp_node.word.noofoccur);
            temp_node = temp_node.next;
        }
    }

    public boolean updateoccur(String item) {
        if (head == null) {
            return false;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.word.word.equals(item)) {
                curr.word.noofoccur += 1;
                return true;
            } else {
                curr = curr.next;
            }
        }
        return false;
    }
}
