package no.oslomet.cs.algdat.Oblig3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.StringJoiner;

public class SBinTre<T> {
    private static final class Node<T>   // en indre nodeklasse
    {
        private T verdi;                   // nodens verdi
        private Node<T> venstre, høyre;    // venstre og høyre barn
        private Node<T> forelder;          // forelder

        // konstruktør
        private Node(T verdi, Node<T> v, Node<T> h, Node<T> forelder) {
            this.verdi = verdi;
            venstre = v;
            høyre = h;
            this.forelder = forelder;
        }

        private Node(T verdi, Node<T> forelder)  // konstruktør
        {
            this(verdi, null, null, forelder);
        }

        @Override
        public String toString() {
            return "" + verdi;
        }

    } // class Node

    private Node<T> rot;                            // peker til rotnoden
    private int antall;                             // antall noder
    private int endringer;                          // antall endringer

    private final Comparator<? super T> comp;       // komparator

    public SBinTre(Comparator<? super T> c)    // konstruktør
    {
        rot = null;
        antall = 0;
        comp = c;
    }

    public boolean inneholder(T verdi) {
        if (verdi == null) return false;

        Node<T> p = rot;

        while (p != null) {
            int cmp = comp.compare(verdi, p.verdi);
            if (cmp < 0) p = p.venstre;
            else if (cmp > 0) p = p.høyre;
            else return true;
        }

        return false;
    }

    public int antall() {
        return antall;
    }

    public String toStringPostOrder() {
        if (tom()) return "[]";

        StringJoiner s = new StringJoiner(", ", "[", "]");

        Node<T> p = førstePostorden(rot); // går til den første i postorden
        while (p != null) {
            s.add(p.verdi.toString());
            p = nestePostorden(p);
        }

        return s.toString();
    }

    public boolean tom() {
        return antall == 0;
    }


                                //------------Oppgave 1----------------\\\



    public boolean leggInn(T verdi) {
        Objects.requireNonNull(verdi, "ikke lov med nullverdier!!!");


        if (rot == null) {  //når treet er Tom!

            rot = new Node<>(verdi,null);
        }
        else {                      //er ikke Tom!
            Node<T> p = rot;

            Node<T> q = null;
            int cmp;

            while (p != null)   {
                q = p;
                cmp = comp.compare(verdi, p.verdi);
                if (cmp < 0)    {
                    p = p.venstre;
                }
                else {
                    p = p.høyre;
                }
            }

            cmp = comp.compare(verdi, q.verdi); //skal finne plassen

            if (cmp == -1)  {
                q.venstre = new Node<>(verdi, q);
            }
            else {
                q.høyre = new Node<>(verdi, q);
            }
        }

        endringer++;
        antall++;
        return true;

    }

                                //------------Oppgave 2----------------\\

    public int antall(T verdi) {

        int antall = 0; //hvis verdien skal ikke finnet skal 0 returneres;

        if (!tom() && inneholder(verdi))    { //om listen er tom og verdien finnes!

            Node<T> p = rot;

            while (p != null)   {   //går gjennom listen så lenge verdien p er ikke null
                int cmp = comp.compare(verdi, p.verdi);
                     if (cmp < 0) {
                         p = p.venstre;
                     }
                        else if (cmp > 0){
                            p = p.høyre;
                     }
                            else { // fant verdien og ligge mot høyre
                                antall++;
                                p = p.høyre;
                     }
            }
        }
        return antall;
    }


                                //-------------Oppgave 3---------------\\

    //kompendietskode : 5.1.7 h
    private static <T> Node<T> førstePostorden(Node<T> p) {

        while (true)    {
            if (p.venstre != null)  {
                p = p.venstre;
            }
            else if (p.høyre != null){
                p = p.høyre;
            }
            else
            {
            return p;
            }
        }
    }

    private static <T> Node<T> nestePostorden(Node<T> p) {

        if (p.forelder == null) {
            return null;
        }

        if (p == p.forelder.høyre)  {
            return p.forelder;
        }

        else if (p == p.forelder.venstre)   {

                if (p.forelder.høyre == null)   {
                    return p.forelder;
                }

                else
                {
                    return førstePostorden(p.forelder.høyre);
                }
        }
        else
        {
            return null;
        }
    }

                                //--------------Oppgave4-------------------\\


    public void postorden(Oppgave<? super T> oppgave) {

        if (tom())  {
            return;
        }

        //første postorden skal være node peker p
        Node<T> p = førstePostorden(rot);

        while (nestePostorden(p) != null)   {
            oppgave.utførOppgave(p.verdi);
            p = nestePostorden(p);
        }
        oppgave.utførOppgave(p.verdi);
    }

    public void postordenRecursive(Oppgave<? super T> oppgave) {
        postordenRecursive(rot, oppgave);
    }

    private void postordenRecursive(Node<T> p, Oppgave<? super T> oppgave) {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }


    public boolean fjern(T verdi) {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public int fjernAlle(T verdi) {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }



    public void nullstill() {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }









    public ArrayList<T> serialize() {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    static <K> SBinTre<K> deserialize(ArrayList<K> data, Comparator<? super K> c) {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }


} // ObligSBinTre
