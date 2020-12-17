# ESIEA Web Programming Mobile Oriented

This is the back end for our API school project.

This project is composed of a Spring boot application for our REST API.
The vue end is in this project : 


## Project requirement 

This project use Java 15.0.1 and MySql Database for the login API.

### Setup the database :

You can modify the database connection in this following file :

    "application.properties" located in src/main/resources

Configure the user properly.
Change the database name if needed.

We used the databe name : testdb

  - After creating/changing the database, start the springboot application once.
  - In your database, insert "ROLES" using the following command : 
  
        INSERT INTO roles(name) VALUES('ROLE_USER');
    
        INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
    
        INSERT INTO roles(name) VALUES('ROLE_ADMIN');

## Rest API 

You have a list of json fomat to use for the back end in the folling file :

    "jsons format" located in docs/jsons format

This file list all POST/GET method and what json format to use. 

## What and how

### Login API

#### Sign IN

When a user create an account, his username and email are saved in the database. 
His password is not sotred in the database. Using Spring Security, only the hash code is saved in the database.

#### Sign UP

When a user log in the app, we use spring secutity to check if the hash code match the hash code store in the database.
If it the password is correct, the API send a toket to the user.

The token expire after 24 hours.

### Create or Reply to a survey

Both the survey and all answer are saved only in memory, and not saved in the database.

You can see all POST/GET method in this following file : 
[Json Format](https://github.com/Dedridec/Projet_PWOM_Back/blob/Dev/docs/jsons%20format)

