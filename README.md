# JavaProjectDS
Java code on data structure


## How to run the program

### Anagram Progam

Input:  String arr[] = { "cat", "dog", "tac", "god", "act"}; (hard-codec in the code)
Output: [cat, tac, act][dog, god] (Return group anagram)

**CLI**
- javac Anagram.java
- java Anagram

**IDE**
- Import the java project
- Right click the file, Click on Run

### PhoneDirectory Progam

**CLI**
- javac PhoneDirectory.java
- java PhoneDirectory

**IDE**
- Import the java project
- Right click the file, Click on Run

**Steps to run:**

- Phone Directory contains hard-coded contacts: {"Anjani","Anand","Anandi","Manisha", "Anup", "Aditya", "Manish", "Monika","Anjali"};


Enter a string to be search
- Anj or anj (You can enter any case lower or upper)

**It will return all the search string based on each charater you entered.**
```
Enter a string to be search
Anj

Suggestions based on 'a' are
Aditya
Anand
Anandi
Anjali
Anjani
Anup

Suggestions based on 'an' are
Anand
Anandi
Anjali
Anjani
Anup

Suggestions based on 'anj' are
Anjali
Anjani
-------------------------
Enter a string to be search
anj

Suggestions based on 'a' are
Aditya
Anand
Anandi
Anjali
Anjani
Anup

Suggestions based on 'an' are
Anand
Anandi
Anjali
Anjani
Anup

Suggestions based on 'anj' are
Anjali
Anjani
```
**Invalid Input**

```
Enter a string to be search
dhai jl
Invalid input. Please enter only alphabets!!
-------------------------
Enter a string to be search
12
Invalid input. Please enter only alphabets!!
-------------------------
Enter a string to be search
12ruie
Invalid input. Please enter only alphabets!!
-------------------------
Enter a string to be search
@@
Invalid input. Please enter only alphabets!!
```

**If string doesn't exist**

```
Enter a string to be search
ga
No result found for 'g'
No Results Found for 'ga'
```

**Want to quit the program, then Enter exit or quit.**
```
Enter a string to be search
- exit or EXIT or quit or QUIT
```



