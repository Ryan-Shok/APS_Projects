Find the two adjacent primes p1 and p2 (a <= p1 <= p2
<= b) such that the prime gap between p1 and p2 is minimized (i.e. p2-p1 is the minimum). If there are multiple
prime pairs that have the same prime gap, report the first pair. Shinya also wants to find the two adjacent primes
p3 and p4 (a <= p3 < p4 <= b) that maximize the gap between p3 and p4 (choose the first pair if there are more
than one such pairs).

Input
Two integer values a,b, with a < b. The difference between a and b will not exceed 1,000,000. 1 <= a <= b <=
2,147,483,647.
Output
If there are no adjacent primes in the interval [a,b], output-1 followed by a newline.
Otherwise the output should be 4 integers: p1 p2 p3 p4 as mentioned above separated by a space and followed by
a newline (no space after p4)
