Input The input consists of two lines, the first of which is the source word and the second is the target word. The
length of each word does not exceed 12.
Output Your program should print a sorted list of valid i/o sequences. The list is delimited by
[
]
and the sequences are sorted in lexicographical order. Within each sequence, i‘s’ and o’s are separated by a single
space and each sequence is terminated by a new line. There should be a newline character printed after the closing
square bracket delimiter. Warning: there should not be any spaces after the last o of the output.
Process Given an input word, a valid i/o sequence implies that every character of the word is pushed and popped
exactly once, and no attempt is ever made to pop an empty stack. For example, if the word FOO is input, then the
sequence: + i i o i o o is valid and produces OOF + i i o is not valid (too short), + i i o o o i is not valid
(illegal pop from an empty stack)
A valid sequence results in a permutation of the letters in the input word. For example, given the input word FOO,
both sequences i i o i o o and i i i o o o give the word OOF.
