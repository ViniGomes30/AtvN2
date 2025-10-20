class LinkedList<E> {
    Node<E> first;
    Node<E> last;
    int size;

    LinkedList(){
        // cria lista ligada vazia
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        //retorna a quantidade de nós na lista
        return size;
    }

    public Node<E> first(){
        // retorna o primeiro nó da lista
        return first;
    }

    public void addFirst(E value){
        Node<E> n = new Node<>(value);
        //adiciona um nó no início da lista
        if (isEmpty()){
            first = n;
            last = n;
        }
        else {
            n.next = first;
            first = n;
        }
        size++;
    }

    public Node<E> last(){
        // retorna o último nó da lista
        return last;
    }

    public void addLast(E value){
        Node<E> n = new Node<>(value);
        //adiciona novo nó no final da lista
        if (isEmpty()){
            first = n;
            last = n;
        }
        else {
            last.next = n;
            last = n;
        }
        size++;
    }

    public void mostraLista(){
        //exibe todo conteúdo da lista
        if (isEmpty()){
            System.out.println("LISTA VAZIA");
            return;
        }
        Node<E> aux = first;
        while (aux != null){
            aux.mostraNo();
            aux = aux.next;
        }
        System.out.println("FIM DA LISTA!");
    }

    public void removeFirst(){
        //remove o primeiro nó da lista
        if (isEmpty()) return;
        first = first.next;
        size--;
        if (size == 0) last = null;
    }

}