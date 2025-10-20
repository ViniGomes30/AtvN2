// Diego Estevão Lopes de Queiroz - 10419038
// Vinícius Gutierrez Gomes - 10425609  
// Henrique Totti - 10436584

public class Main   {
    public static void main(String[] args) throws Exception {
        LinkedList<String> placas = new LinkedList<>();
        placas.addLast("ABC1234");
        placas.addLast("XYZ9876");
        placas.addLast("QWE4321");
        placas.addLast("RTY5555");
        placas.addLast("PLK0001");
        placas.addLast("MNB2468");

        System.out.println("Lista original de placas:");
        placas.mostraLista();

        // TriplicarElementos
        LinkedList<String> triplicada = triplicarElementos(placas);
        System.out.println("\nLista triplicada:");
        triplicada.mostraLista();

        // Intercalar
        LinkedList<String> outras = new LinkedList<>();
        outras.addLast("AAA1111");
        outras.addLast("BBB2222");
        outras.addLast("CCC3333");
        outras.addLast("DDD4444");

        System.out.println("\nOutra lista:");
        outras.mostraLista();

        LinkedList<String> intercalada = intercalar(placas, outras);
        System.out.println("\nLista intercalada (placas x outras):");
        intercalada.mostraLista();
    }

    public static <E> LinkedList<E> triplicarElementos(LinkedList<E> src){
        LinkedList<E> res = new LinkedList<>();
        Node<E> aux = src.first;
        while (aux != null){
            res.addLast(aux.data);
            res.addLast(aux.data);
            res.addLast(aux.data);
            aux = aux.next;
        }
        return res;
    }

    public static <E> LinkedList<E> intercalar(LinkedList<E> a, LinkedList<E> b){
        LinkedList<E> res = new LinkedList<>();
        Node<E> pa = a.first;
        Node<E> pb = b.first;
        while (pa != null && pb != null){
            res.addLast(pa.data);
            res.addLast(pb.data);
            pa = pa.next;
            pb = pb.next;
        }
        while (pa != null){
            res.addLast(pa.data);
            pa = pa.next;
        }
        while (pb != null){
            res.addLast(pb.data);
            pb = pb.next;
        }
        return res;
    }
}
