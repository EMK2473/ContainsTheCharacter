# Contains The Character
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)

## Description
The ContainsTheCharacter program is a Java application that processes a list of strings and determines which strings contain a specific character. The user provides input in a single line, where the first number specifies the number of strings to be processed, followed by the strings themselves, and ending with the character to search for. The program then outputs the strings that contain the specified character, separated by commas.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/ContainsTheCharacter.git 
```

- Navigate to the project directory: 
```Java
- cd ContainsTheCharacter 
```
- Compile the ContainsTheCharacter.java file: 
```Java
- javac ContainsTheCharacter.java 
```
- Run the program: 
```Java
- java ContainsTheCharacter
```

## Application Usage
The program expects a single line of input with the following format:  The first value is an integer representing the number of strings. The next values are the strings to be checked. The last value is the character to search for within those strings. The program will output all strings that contain the specified character, separated by commas.  Example:  

Input: 
```Java
3 apple banana cherry a 
```
Output:
```Java
apple,banana, 
```
- This output indicates that the strings apple and banana contain the character a.

## Contributions
Eric Keeton

## Test Commands
To test the program, provide different sets of inputs with varying numbers of strings and characters to verify that the program correctly identifies and outputs strings containing the specified character.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)