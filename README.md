# TDD-katas-Java
TDD Katas written in Java

## Why katas?

*Kata* is a Japanese word meaning “form”, and in the martial arts it describes a choreographed pattern of movements used to train yourself to the level of muscle memory.

It has become an important step for newcomers and introduce themselves into the TDD culture, the nature is to practice this skills and keep focused on working with test first.

An important step is that all the katas should be worked incrementally, try to avoid reading all the requirements and work on all one by one.

### String Calculator
The essence of this kata consist in a method that given a delimited string, returns the sum of the values. Here are the rules you should follow. 
* An empty string returns zero
* A single number returns the value
* Two numbers, comma delimited, returns the sum
* Two numbers, newline delimited, returns the sum
* Three numbers, delimited either way, returns the sum
* Negative numbers throw an exception
* Numbers greater than 1000 are ignored
* A single char delimiter can be defined on the first line (e.g. //# for a ‘#’ as the delimiter)
* A multi char delimiter can be defined on the first line (e.g. //[###] for ‘###’ as the delimiter)
* Many single or multi-char delimiters can be defined (each wrapped in square brackets)
