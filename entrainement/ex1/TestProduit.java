public class TestProduit {
    public static void main(String[] args) {
        Produit p1 = new Produit("Clavier", 4990);
        Produit p2 = new Produit("Clavier", 3500);
        Produit p3 = new Produit("Souris", 1905);
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        System.out.println(p1.hashCode() == p2.hashCode());
        p1.appliquerRemise(10);
        System.out.println(p1);
        try {
            new Produit("  ", 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        try {
            p3.appliquerRemise(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println(p3.getPrixCentimes());
    }
}
