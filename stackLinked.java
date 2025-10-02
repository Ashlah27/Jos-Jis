class Link {
    int id;
    String namaBarang;
    Link next;

    public Link(int id, String namaBarang) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.next = null;
    }
}


class StackBarang {
    private Link first;

    public StackBarang() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }


    public void push(int id, String namaBarang) {
        Link newLink = new Link(id, namaBarang);
        newLink.next = first; 
        first = newLink;     
    }

  
    public Link pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak bisa pop");
            return null;
        }
        Link popped = first;
        first = first.next;
        return popped;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return;
        }
        System.out.println("Stack(top -> bottom):");
        Link temp = first;
        while (temp != null) {
            System.out.println("(" + temp.id + ", " + temp.namaBarang + ")");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class stackLinked {
    public static void main(String[] args) {
        StackBarang stack = new StackBarang();

        stack.push(1, "VCD");
        stack.push(2, "TV");
        
        stack.display();
        
        stack.push(3, "Kulkas");
        stack.push(4, "PC");
        stack.push(5, "Rice cooker");
        stack.push(6, "Dispenser");

        stack.display();

        stack.pop(); 
        stack.pop();  
        stack.display();
    }
}