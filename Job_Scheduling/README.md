You are given N one-time tasks and M repeating tasks and you need to determine if there is any overlap between
them in the time interval [0..1,000,000].
Note: tasks are considered to overlap only if their time intervals overlap,but not if the endpoints are the same.
Input
The first line of the input contains two integers N and M (0<=N,M<=100), indicating the number of one-time 
tasks and repeating tasks, respectively. Each of the following N lines contains two integers indicating the start time
and the end time for the one-time tasks. Afterward, each of the following M lines contains three integers indicating the
start time, end time and repetition interval of the repeating tasks.
It is guaranteed that all integers are between 0 and 1,000,000, the end time is larger than the start time and the 
repetition interval is positive.
Output
Print one line either containing NO CONFLICT if there is no overlap, or CONFLICT if there are any overlaps.
