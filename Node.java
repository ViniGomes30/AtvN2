class Node<E> {
    E data;
    Node<E> next;

    Node(E data){
        this.data = data;
        next = null;
    }

    public void mostraNo(){
        System.out.println(data);
    }
}