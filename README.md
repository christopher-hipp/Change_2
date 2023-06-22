## What is the project?
The Main project is a project to build an application that gives the user an amount of money to put into savings from your budget.

The basis for this idea is **Rahakratt's Challenge**.
<details>
  <summary>Click here to see image</summary> 

  ![](https://static-img.aripaev.ee/?type=preview&uuid=c7f9cb3c-a446-5f7a-a420-f2d07810014d&width=2000&q=85 "Rahakratt challenge")

</details>

## MVP (Minimal Viable Product)
1. Use an array of predefined values that add up to 1000 (same as in Rahakratt's challenge)

       6, 9, 19, 28, 22, 19, 35,
       15, 6, 28, 20, 17, 18, 22,
       4, 20, 8, 26, 19, 15, 29,
       5, 17, 11, 19, 9, 21, 60,
       31, 18, 22, 27, 5, 23, 0,
       8, 21, 15, 40, 12, 34, 11,
       19, 25, 13, 22, 17, 9, 51,
       33, 17, 20

   (for some reason the total of these values is 1020, not 1000)

2. Select a random value from the array and display it to the user

3. Keep track of changes in the array

   a. Display remaining values 

   b. Add selected random value to array of used values
   
   c. Remove selected random value from active array

4. Display the total amount saved in a separate array

   a. add the used values together and display the total amount saved

---

**Completed on 4/Jun/2023.**

---

## Additional functionality (nice to have)
**Note that this list is not exhaustive and will be subject to change as I progress.**

### Custom input
1. Ask the user for a custom value as total

2. Allow the user to select custom time frame

   a. If no custom time frame is used, use 52 as default (52 weeks in a year)

3. Split custom value by dividing with custom (or default) time frame

   a. If average is with a decimal point, round down to the nearest integer

      - Calculate the missing amount (custom total - average * custom time frame)

   b.  ... ***couldn't be bothered to continue, wanted to start coding lol***

4. a simple visual representation of the array and values in the terminal

4. the ability to allow multiple savings profiles; and
5. the ability to show the user's savings history.

## When will the project be complete?
 
**Project will be complete when I am happy with it, not when it gets difficult.**
