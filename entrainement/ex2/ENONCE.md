# Exercice 2 : la paie d'une équipe (45 min)

Notions : héritage, classe abstraite, `super(...)`, redéfinition, polymorphisme.
Écris 4 fichiers dans `entrainement/ex2/`, un par classe, sans package.

1. **`Employe`**, classe abstraite
   - attribut `nom` (String, ne change jamais) ;
   - `public Employe(String nom)` : `IllegalArgumentException` avec le message `nom vide` si le nom est `null` ou blanc ;
   - `getNom()` ;
   - `public abstract int getSalaireCentimes()` ;
   - `toString()` écrit une seule fois ici, au format `Alice (Salarie) : 2575,00 EUR`. Le texte entre parenthèses est le nom de la classe réelle de l'objet, pas écrit en dur dans chaque fille.
2. **`Salarie`**, un employé avec un salaire fixe
   - `public Salarie(String nom, int salaireCentimes)` : message `salaire negatif` si < 0 ;
   - `public void augmenter(int pourcentage)` : augmente le salaire (division entière), message `pourcentage hors de [0, 100]` si invalide.
3. **`Stagiaire`**, un salarié particulier
   - `public Stagiaire(String nom)` : gratification toujours de 65000 centimes, dans une constante ;
   - `augmenter` lève une `UnsupportedOperationException` avec le message `un stagiaire ne peut pas etre augmente`.
4. **`Freelance`**, un employé payé à la journée
   - `public Freelance(String nom, int tarifJourCentimes)` : commence avec 0 jour travaillé ;
   - `public void ajouterJours(int nombre)` : message `nombre de jours invalide` si `nombre <= 0` ;
   - salaire = tarif × jours.

Test : `TestEmploye.java`. Sortie attendue : `attendu.txt`.

Avant de coder (sur papier) : l'arbre d'héritage, l'emplacement de chaque attribut, la première ligne de chaque constructeur de fille.

Javadoc utile : `Object` (la méthode qui renvoie la classe de l'objet), `Class` (le nom simple), `UnsupportedOperationException` (checked ou unchecked ?).

Bonus : que dit le compilateur pour `new Employe("x")`, et pourquoi ?
