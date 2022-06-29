Loop,Methods,Arrays for Football


In this program, we will build a class that will simulate a football game.  The program will prompt the user to enter the names for two teams.

The user will then be asked to enter the score each time a team scores.

Scores must be validated according to the following rules.

Scores of 2, 3 and 6 are allowed as the initial entry for a score.

A score of 1 is only allowed if the previous score was a 6 by the same team and in the same quarter.

Scores must be entered in a method and the user should be prompted for the quarter and the score. Once a user has moved to a new quarter, they are not allowed to enter scores for a previous quarter.

At the end of the 4th quarter, the scores will be totaled and displayed to the user. You must use a method to total the scores and determine the winner.  The winning team will then be printed along with the scores.  This must be done in a separate method.

This program requires the use instance variables.  You will have at least 2 String variables for team names, one or two int arrays to hold the quarter scores.

You are allowed to use the key word static once in this program.


Sample output: Please enter the home's name.
GGC
Please enter the visit's name.
Georgia Tech
Please enter the quarter the team scored (1-4, 5 to exit)
0
Invalid quarter entered.  You must enter a number between 1 and 5.
Please enter the quarter the team scored (1-4, 5 to exit)
1
Please enter the team that scored (1. for GGC or 2. for Georgia Tech)
1
Please enter the score for GGC (0, 1, 2, 3, or 6)
3
Please enter the quarter the team scored (1-4, 5 to exit)
1
Please enter the team that scored (1. for GGC or 2. For Georgia Tech)
2
Please enter the score for Georgia Tech (0, 1, 2, 3, or 6)
4
You have entered an invalid score.  Valid scores are 0, 1, 2, 3 or 6.
Please enter the score for Georgia Tech (0, 1, 2, 3, or 6)
3
Please enter the quarter the team scored (1-4, 5 to exit)
2
Please enter the team that scored (1. for GGC or 2. for Georgia Tech)
1
Please enter the score for GGC (0, 1, 2, 3, or 6)
6
Please enter the quarter the team scored (1-4, 5 to exit)
1
You cannot add a score for a previous quarter
Please enter the quarter the team scored (1-4, 5 to exit)
2
Please enter the team that scored (1. for GGC or 2. for Georgia Tech)
1
Please enter the score for GGC (0, 1, 2, 3, or 6)
1
Please enter the quarter the team scored (1-4, 5 to exit)
6
Invalid quarter entered.  You must enter a number between 1 and 5.
Please enter the quarter the team scored (1-4, 5 to exit)
2
Please enter the team that scored (1. for GGC or 2. for Georgia Tech)
2
Please enter the score for Georgia Tech (0, 1, 2, 3, or 6)
6
Please enter the quarter the team scored (1-4, 5 to exit)
3
Please enter the team that scored (1. for GGC or 2. for Georgia Tech)
2
Please enter the score for Georgia Tech (0, 1, 2, 3, or 6)
1
You cannot score an extra point in a quarter where you did not score the last touchdown.
Please enter the score for Georgia Tech (0, 1, 2, 3, or 6)
3
Please enter the quarter the team scored (1-4, 5 to exit)
4
Please enter the team that scored (1. for GGC or 2. for Georgia Tech)
1
Please enter the score for GGC (0, 1, 2, 3, or 6)
6
Please enter the quarter the team scored (1-4, 5 to exit)
4
Please enter the team that scored (1. for GGC or 2. for Georgia Tech)
1
Please enter the score for GGC (0, 1, 2, 3, or 6)
1
Please enter the quarter the team scored (1-4, 5 to exit)
5
GGC defeated Georgia Tech by a score of 17 to 12.
