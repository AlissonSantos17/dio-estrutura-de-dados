package projetopilha;

public class Pilha {
    private No reNoEntradaPilha;

    public Pilha() {
        this.reNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = reNoEntradaPilha;
        reNoEntradaPilha = novoNo;
        reNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPoded = reNoEntradaPilha;
            reNoEntradaPilha = reNoEntradaPilha.getRefNo();
        }
        return null;
    }

    public No top() {
        return this.reNoEntradaPilha;
    }

    public boolean isEmpty() {
        return this.reNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno = "--------------\n";

        No noAuxiliar = reNoEntradaPilha;

        while(true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "--------------\n";
        return stringRetorno;
    }
}
