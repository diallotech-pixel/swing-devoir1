# swing-devoir1
Exercice 1 : Lignes incorrectes
Ligne 06 : package pack1;
Erreur : Redéclaration du package. Un fichier Java ne peut avoir qu'une seule déclaration de package (ligne 01).

Ligne 08 : class Titi extends Toto {
Erreur : Toto est une classe abstraite, donc on doit écrire extends (ce qui est correct), mais Titi doit soit implémenter toutes les méthodes abstraites de Toto, soit être déclarée abstract elle-même.

Ligne 13 : private int getI() {
Erreur : La méthode getI() implémente la méthode de l'interface InterToto. Une méthode d'interface est implicitement public, donc l'implémentation doit aussi être public (pas private).

Ligne 17 : package pack1.pack1_1;
Erreur : Redéclaration du package (encore). De plus, si c'était un sous-package, il faudrait un fichier séparé.
