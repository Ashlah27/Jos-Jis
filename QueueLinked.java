class Link2 {
    String nim;
    String nama;
    Link2 next;

    public Link2(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}


class QueueMahasiswa {
    private Link2 front, rear;

    public QueueMahasiswa() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void insert(String nim, String nama) {
        Link2 newNode = new Link2(nim, nama);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
            
        }
    }

    public Link2 remove() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa remove");
            return null;
        }

        Link2 temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return temp;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }

        System.out.println("Queue (front --> rear):");
        Link2 temp = front;
        while (temp != null) {
            System.out.println(temp.nim + " " + temp.nama);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueLinked {
    public static void main(String[] args) {
        QueueMahasiswa queue = new QueueMahasiswa();

        queue.insert("1665100", "Dee");
        queue.insert("1665200", "Deaja");
        
        queue.display();

        queue.insert("1665300", "Ami");
        queue.insert("1665400", "Haya");
        queue.insert("1665500", "Yati");
        
        queue.display();

        queue.remove(); 
        queue.remove(); 
        queue.display();
    }
}