## Bubble Sort

How it works:

1. Go through the array, one value at a time.
2. For each value, compare the value with the next value.
3. If the value is higher than the next one, swap the values so that the highest value comes last.
4. Repeat above 3 steps as many times as there are values in the array (array length).

For example:

[7,12,9,11,3]

We will repeat 5 times (array length is 5):

Step 1 to 3:
[7,12,9,15,11] (compare 7 and 12 - don't switch)
[7,12,9,11,15] -> [7,9,12,15,11] (compare 12 and 9 - switch)
[7,9,12,15,11] (compare 12 and 15 - don't switch)
[7,9,12,15,11] -> [7,9,12,11,15] (compare 15 and 11 - switch)
[7,9,12,11,15]
