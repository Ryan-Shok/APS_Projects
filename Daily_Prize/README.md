At the end of each day, the manager picks two forms from among the completed ones: -first is the one that
has the highest amount paid -second is the one that has the lowest amount paid. The person who paid the highest
amount gets the prize equal to the difference between their bill and the lowest bill.

The selected forms are discarded, but the other ones remain in the pool for the next day.

Input
The input contains an integer n, 1 <= n <= 5,000 on the first line - this is the number of days in the promotion.
Each of the next n lines contains a sequence of non-negative integers separated by whitespace. The first number on
each line indicates the number of forms submitted on that day, 0 <= k <=100,000. The next k numbers specify
the bill amounts on the new forms entered for the daily drawing on that day. Each amount is guaranteed to be no
larger than 1,000,000. The total amount of all bills is no larger than 1,000,000.
Output
Print one number that is the sum of all the prizes that are payed out during the promotion followed by a
newline.
