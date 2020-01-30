# Wild Circus

Ce site web a été réalisée pour le checkpoint 4 par Stéphane THOMIN de la Wild Code School de Reims (Mai 2019).

## Installation

**Les logiciels à installer pour utiliser le projet :**

- Java
- Maven
- Mysql

**Création de la base de données**

- Créer une base de données et un utilisateur avec les privilèges

Via MySql en ligne de commande :

```
CREATE USER 'newuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON * . * TO 'newuser'@'localhost';
```
Ou via un gestionnaire de bases de données (MySQLWorkBench, Adminer, ...).

- Créer un fichier application.properties avec les informations de la base, en suivant application.properties.example.

## Lancement du projet

Via le terminal de commandes :

```
mvn spring-boot:run
```

Ou via votre IDE si celui-ci le permet (Visual Studio Code par exemple).

Le projet sera disponible sur votre navigateur à l'adresse **http://localhost:8080/**

## Auteur

* **Stéphane THOMIN** - *Développeur* - (https://github.com/stephanethomin)