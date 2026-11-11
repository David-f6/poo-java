# Exercice 1 : `Produit` (30 min)

Notions : classe, encapsulation, exceptions, `equals`/`hashCode`/`toString`.

Écris une classe publique `Produit` (package par défaut) dans `entrainement/ex1/Produit.java` :

- deux attributs : `nom` (String, ne change jamais) et `prixCentimes` (int) ;
- `public Produit(String nom, int prixCentimes)` : lève une `IllegalArgumentException` avec le message `nom vide` si le nom est `null` ou ne contient que des espaces, et `prix negatif` si le prix est < 0 ;
- `getNom()` et `getPrixCentimes()` ;
- `public void appliquerRemise(int pourcentage)` : réduit le prix (division entière), message `pourcentage hors de [0, 100]` si invalide ;
- `toString()` au format `Clavier : 49,90 EUR` (attention à `19,05`, pas `19,5`) ;
- deux produits sont égaux s'ils ont le même nom.

Test : `TestProduit.java`. Sortie attendue : `attendu.txt`.

Javadoc utile : `String` (`isBlank`, `format`), `java.util.Formatter` (section Flags), `IllegalArgumentException`, `java.util.Objects` (`hash`).
