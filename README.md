TP2 Subject:
============
- Ecrire un programme qui produit un tableau à N valeurs aléatoires
- Utiliser plusieurs acteurs pour calculer la moyenne de ces valeurs
- Envoyer les résultats partiels à un autre acteur, qui calculera la moyenne finale!
Implementation
--------------
We have 3 Actors here.
The first(Calculator1 which code is in the file tp2act1.scala) add the values of the
first half of the table, the second(Calculator2 in tp2act2) add the values of the
second half and then the third calculate the average value.