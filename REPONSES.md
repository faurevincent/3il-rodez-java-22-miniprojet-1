## Réponses aux questions

### Question : Pourquoi l'attribut graine est-il déclaré comme `final` ?

L'attribut `graine` est déclaré comme `final` car une fois initialisé dans le constructeur, sa valeur ne peut plus être modifiée. Cette restriction garantit l'immutabilité de la graine après son initialisation, ce qui peut être important pour maintenir la cohérence et la prédictibilité du générateur de carte.

### Question : Réaliser l'architecture que prendrait la forme d'une telle modélisation sous forme d'un diagramme UML. Quelle serait la différence d'attributs et de méthodes entre ces classes ? Expliquer, en s'appuyant sur un exercice vu en cours, pourquoi c'est une mauvaise idée. Quelle est la solution qu'il faudrait préférer (et que l'on va préférer) ?

Voir UMLDiagram.md. Les différences entre les classes se situeraient principalement dans les attributs spécifiques à chaque type de terrain et les méthodes qui pourraient être utilisées pour simuler des comportements spécifiques à ce type de terrain. Cependant, créer une classe distincte pour chaque type de terrain peut conduire à une duplication de code et rendre l'ajout de nouveaux types de terrains fastidieux. Une meilleure approche serait d'utiliser une énumération `TypeTerrain` qui représente les différents types de terrains disponibles. Cela permettrait de réduire la duplication de code et de rendre le système plus extensible.

### Question : Quel type utilisez-vous ?

Pour représenter les valeurs d'altitude, d'hydrométrie et de température avec une précision suffisante, il est courant d'utiliser des types de données à virgule flottante. En Java, le type de données à virgule flottante le plus précis est `double`. Par conséquent, pour les valeurs d'altitude, d'hydrométrie et de température, nous utiliserions le type `double`.

### Question : Pourquoi sortir, selon vous, ce bout d'algorithme de la classe ?

Sortir cet algorithme de détermination du type de terrain de la classe permet de maintenir le principe de responsabilité unique. En isolant l'algorithme de détermination du type de terrain dans un visiteur séparé, on sépare les préoccupations et on facilite la maintenance et l'évolutivité du code. Si l'algorithme de détermination doit changer ou si de nouveaux types de terrains doivent être pris en charge, cela peut être fait en ajoutant ou en modifiant les méthodes dans le visiteur, sans avoir besoin de toucher à la classe Terrain.
