# PizzaRecipes

## Description
**PizzaRecipes** est une application mobile Android qui permet aux utilisateurs de découvrir et de préparer différentes recettes de pizzas. Avec une interface utilisateur conviviale et des instructions claires, cette application est idéale pour les amateurs de cuisine de tous niveaux.

## Fonctionnalités
- **Liste des Recettes** : Parcourez une variété de recettes de pizzas.
- **Détails des Recettes** : Accédez aux ingrédients et aux instructions pour chaque recette.
- **Interface Splash Screen** : Profitez d'une activité de démarrage.

## Technologies Utilisées
- **Android SDK** : Pour le développement d'applications mobiles sur Android.
- **Java** : Langage principal pour la logique de l'application.
- **XML** : Pour la définition des layouts et interfaces utilisateur.
- **Gradle** : Pour la gestion des dépendances et la compilation de l'application.

## Composants de l'Application
- **Activités** :
  - **SplashActivity** : Activité de démarrage avec animation.
  - **ListPizzaActivity** : Affiche la liste des recettes de pizzas.
  - **DetailPizzaActivity** : Montre les détails d'une recette sélectionnée.

- **Modèle** :
  - **Produit** : Classe représentant une recette de pizza avec des attributs comme le nom, le temps de cuisson, les ingrédients, etc.

- **DAO (Data Access Object)** :
  - **IDao** : Interface générique pour les opérations de base de données.
  - **ProduitService** : Implémentation de l'interface IDao pour gérer les recettes en mémoire.

- **Adaptateur** :
  - **PizzaAdapter** : Permet de lier les données des recettes à la liste affichée dans `ListPizzaActivity`.

## Architecture en Couches
L'architecture de l'application est structurée en couches :

1. **Couche de Présentation** :
   - Gère l'interface utilisateur et l'interaction avec l'utilisateur via des activités et des layouts XML.

2. **Couche de Logique Métier** :
   - Contient la logique pour gérer les recettes, incluant la récupération et la manipulation des données.

3. **Couche de Données** :
   - Gère l'accès aux données, incluant les opérations CRUD à travers des DAO.

## Démonstration
https://github.com/user-attachments/assets/1878c454-4ffa-4abb-951f-d259a80d90e6
