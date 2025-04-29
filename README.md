# Thread (Multithreading in Java)

A simple Java application demonstrating the use of multithreading by simulating Pokémon battles.

---

## Overview

This project showcases how to implement multithreading in Java. Each Pokémon battle is handled by a separate thread, allowing multiple battles to occur simultaneously. It's a fun and educational example of concurrent programming in action.

---

## Prerequisites

- Java Development Kit (JDK) 8 or higher

---

## Functions Used

### Pokemon.java
Pokemon(String name, int health, int attackPower)
Constructor to create a new Pokémon with name, health, and attack power.

getName()
Returns the name of the Pokémon.

getHealth()
Returns the current health of the Pokémon.

attack(Pokemon opponent)
Simulates an attack on the opponent and reduces their health.

isFainted()
Returns true if the Pokémon's health is 0 or less.

### PokemonThread.java
PokemonThread(Pokemon p1, Pokemon p2)
Constructor initializes the battle between two Pokémon.

run()
Overridden from Thread; simulates turn-based battle between two Pokémon.

### Main.java
main(String[] args)
Entry point of the application. Creates Pokémon objects, starts multiple threads to simulate battles.

### Key Concepts Demonstrated

 Thread Creation – Extending the Thread class
 Simultaneous Execution – Multiple battles occur in parallel
 Thread Lifecycle – Managing start and finish of threads


