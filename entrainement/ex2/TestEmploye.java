public class TestEmploye {
    public static void main(String[] args) {
        Salarie alice = new Salarie("Alice", 250000);
        Freelance bob = new Freelance("Bob", 45050);
        Stagiaire chloe = new Stagiaire("Chloe");
        bob.ajouterJours(3);
        bob.ajouterJours(2);
        alice.augmenter(3);

        Employe[] equipe = {alice, bob, chloe};
        int total = 0;
        for (Employe e : equipe) {
            System.out.println(e);
            total = total + e.getSalaireCentimes();
        }
        System.out.println("Total : " + total);

        Salarie s = chloe;
        try {
            s.augmenter(10);
        } catch (UnsupportedOperationException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        try {
            bob.ajouterJours(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        try {
            new Salarie(" ", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println(chloe instanceof Salarie);
        System.out.println(chloe.getSalaireCentimes());
    }
}
