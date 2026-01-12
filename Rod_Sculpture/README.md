The robot views the metal rod as positioned along the positive X-axis, +x, in a three-dimensional coordinate system
anchored at the origin. The rod is of length L (L is an integer in the range 2 <= L <= 100,000). This means that
the rod is attached at point (0,0,0) and its free (bendable) end is at (L,0,0). The robot can bend the rod at discrete
points starting from (L-1,0,0) down to (1,0,0). At each point i the robot can either:- not bend the rod at point
(i,0,0)- bend the rod at point (i,0,0) at angle of 90 degrees so that the rod segment from (i,0,0) to (i+1,0,0) is
parallel to the axis +y,-y, +z or-z.

Input
The first line specifies the length of the rod, L, as an integer 2 <= L <= 100,000. The second line contains L-1
instructions for the robot separated by spaces. The j’th instruction (1 <= j <= L-1) corresponds to a bend at point
(L-j, 0, 0) and must be one of the following:- No- do not bend the rod at point (L-j, 0, 0)- +y- bend the rod at
point (L-j,0,0) on the positive Y-axis--y- bend the rod at point (L-j,0,0) on the negative Y-axis- +z- bend the
rod at point (L-j,0,0) on the positive Z-axis--z- bend the rod at point (L-j,0,0) on the negative Z-axis
Output
The direction in which the last segment of the rod is pointing to as +x,-x, +y,-y, +z, or-z.