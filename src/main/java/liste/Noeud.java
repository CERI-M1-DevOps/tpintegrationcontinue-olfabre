package liste;

public class Noeud {
    private Object element;
    private Noeud suivant;

    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    public String toString() {
        return "Noeud(" + element + ")";
    }
}
