# Progression de l'entraînement

Claude Code met ce fichier à jour après chaque correction : exercice, date, points acquis, points à retravailler.

## Plan

1. Classe, encapsulation, exceptions, `equals`/`hashCode`/`toString`
2. Héritage, classe abstraite, polymorphisme
3. Interfaces, `Comparable`, `Comparator`
4. `Iterable`, `Iterator`
5. Exceptions personnalisées (checked)
6. Génériques bornés
7. Collections (`Map`, comptage, tri)
8. Sujet complet type contrôle, en temps limité

## Journal

### Ex1 `Produit` (10-11/11/2026) : réussi, sortie identique

- Acquis : `equals`/`hashCode` sur le même attribut, `throw` plutôt que `println`, `isBlank` avec test du `null` avant, bornes `<=`, `String.format("%02d")` trouvé seul dans la Javadoc.
- Erreurs rencontrées : attribut `static` (tous les objets partageaient le nom), division entière `10 / 100 == 0`, variable locale qui masque l'attribut, `equals(Object, Object)` (surcharge au lieu de redéfinition), messages pas recopiés au caractère près, `main` hors de la classe (accepté par JDK 25, refusé par `javac` 21).
- À surveiller : appliquer des suggestions d'IntelliJ sans les comprendre ; envoyer du code sans avoir lancé le test.
- Solution donnée à sa demande : `private final String nom;`.

### Ex2 paie d'une équipe : en cours
