// Diego Estevão Lopes de Queiroz - 10419038
// Vinícius Gutierrez Gomes - 10425609  
// Henrique Totti - 10436584

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