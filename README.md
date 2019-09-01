# CodingExercisesDay074
# Digital root

- A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

- Steps:

1.Find out all the digits of a number

2.Add all the number one by one

3.If the final sum is double digit, add again to make it single digit

4.The result obtained in single digit is the Digital root of number

Example: 
Input: 65785412
Find Digital root: (6 + 5 + 7 + 8 + 5 + 4 + 1 + 2) = 38 => 11 => (1 + 1) = 2

 - METHOD 2
 -The idea is based on the fact that for a non-zero number num, digital root is 9 if number is divisible by 9, else digital root is num % 9. (Please see http://www.sjsu.edu/faculty/watkins/Digitsum0.htm for details)

Find the digital root of 65785412
Steps:

Sum of digits = 6 + 5 + 7 + 8 + 5 + 4 + 1 + 2 = 38
Since 38 is not multiple of 9, digital root is 38 % 9 = 2.

- Java code based on the method 2.
