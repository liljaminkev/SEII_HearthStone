# SEII_HearthStone
Hearthstone card game
CS 4311 – Winter 2017 – hw3

due: Feb 20, 2017

This is a group assignment. Here are the tasks:
Pick another of the games someone in the group did for hw1, or create a mashup, if you like
choose a game where there are special features to support
Implement a console-based version of this game, but using code from hw2:
As with hw2, you should cover 2 or 3 special features per person, but the “campaign option” below can replace one special feature
If you have not already done so, create a package for this cross-game code and put the common code here
Create unit tests for your code here, revising unit tests from hw2 if necessary to keep them working
The turn-by-turn driver should work for both games – if you need to modify it for the new game, make sure your hw2 game still works for it
Use or create other general interfaces or classes to create more common code
Because you now have 2 different games in your code base, follow the Abstract Factory pattern to construct the components of the games so the components are compatible. If you are doing a mash-up, you still need to constrain what your mash-up requires.
Add the following features for both games:
Support saving and restoring a game
Support a campaign option for at least one of your games. If neither of the games has a campaign option, you would have to design one yourself. For this assignment, a linear campaign would be sufficient, though for hw4, you will be asked to support a general tree (or graph)-shaped campaign

Submission: whatever is on your github repository by the deadline will be the submission.

Grading: You get credit for what you post to the repository, 60% Correctness, 20% for your unit tests, 20% style

Correctness:
Whether you are following the patterns appropriately
the code runs and does stuff according to your chosen game
You are not duplicating code in different parts
you are creating abstractions to handle common aspects of the games

Style: I still want to see comments for each class and method (including the @Test methods of the unit tests). You still need to use good identifier names, though I’ll make an exception for any loop counters in for loops as well as test case code if the comments are sufficient to explain what is what.
