# Lab 3A — Unit and Integration Testing with JUnit 5

Software Testing and Validation, Addis Ababa University. Accompanies Unit 3.

## Requirements
- JDK 17 or later
- Maven 3.8 or later
- An internet connection the first time, so Maven can download JUnit

## Run the tests

    mvn test

## Structure

    src/main/java/edu/aau/stv/
      Account.java             unit-testing target (Part A)
      PriceList.java           a collaborator interface
      InMemoryPriceList.java   a fake implementation (Part C)
      Checkout.java            uses a PriceList (Parts B, C, D)
    src/test/java/edu/aau/stv/
      AccountTest.java         complete the TODOs (Part A)
      CheckoutTest.java        complete the TODOs (Parts B, C, D)
    solution/                  full instructor solution

To run the solution, copy the files from solution/ over the matching
files in src/test/java/edu/aau/stv/ and run mvn test again.

## What to submit
Your completed AccountTest.java and CheckoutTest.java. See the lab manual.
