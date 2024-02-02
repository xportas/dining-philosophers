# Dining Philosophers Problem

This repository contains a Java implementation of the famous Dining Philosophers problem. In this problem, five philosophers sit around a table, spending their lives dining and thinking. Each philosopher has a plate of noodles and a fork to the left of their plate. To eat, two forks are required, and each philosopher can only take the forks to their left and right. This scenario can lead to situations of mutual deadlock, where all philosophers become trapped waiting for forks.

## Repository Structure

The repository consists of three main classes:

### 1. `Filosofo.java`

This class represents each philosopher as a thread (`Thread`). Philosophers spend their time thinking, attempt to acquire forks for eating, and eventually release the forks.

### 2. `Main.java`

The main class of the program creates an instance of the `Mesa` (Table) and five instances of `Filosofo`, starting each thread to simulate the dining philosophers scenario.

### 3. `Mesa.java`

The `Mesa` class represents the table around which the philosophers sit. It uses semaphores to control access to the forks, preventing race conditions and deadlock.

## Usage

To run the dining philosophers simulation, simply execute the program from `Main.java`. The console output will display the state of each philosopher as they think, eat, and release forks.

## Important Considerations

1. **Exception Handling:** Basic exception handling has been included in some places to maintain code simplicity. In a production environment, it is recommended to enhance exception handling based on requirements and best practices.

2. **Synchronization:** The use of semaphores in the `Mesa` class is crucial to avoid race conditions and deadlock. Care should be taken when making modifications to ensure proper synchronization.

3. **Infinite Loop:** Philosopher execution occurs in an infinite loop (`while(true)`) to simulate continuous activity. In a real environment, a proper way to end the simulation should be considered.

4. **Modular Design:** The code is organized into three classes to maintain a modular design, making it easier to understand and maintain.

Enjoy exploring the Dining Philosophers implementation! If you have any questions or suggestions, feel free to share them.
