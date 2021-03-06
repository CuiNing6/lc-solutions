package dynamic_programming;

/**
 * Created by cuining8 on 03/05/2022. Given a list of unique words, find all pairs of
 * distinct indices (i, j) in the given list, so that the concatenation of the two words, i.e.
 * words[i] + words[j] is a palindrome.
 *
 * <p>Example 1: Given words = ["bat", "tab", "cat"] Return [[0, 1], [1, 0]] The palindromes are
 * ["battab", "tabbat"] Example 2: Given words = ["abcd", "dcba", "lls", "s", "sssll"] Return [[0,
 * 1], [1, 0], [3, 2], [2, 4]] The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
 *
 * <p>Solution O(n x m ^ 2) where m is the average length of each string and n is the number of
 * strings.
 */
public class PalindromePairs {
}
