package Backtracking;

/**
 * Created by cuining8 on 02/10/2022.
 *
 * <p>Implement regular expression matching with support for '.' and '*'.
 *
 * <p>'.' Matches any single character. '*' Matches zero or more of the preceding element.
 *
 * <p>The matching should cover the entire input string (not partial).
 *
 * <p>The function prototype should be: bool isMatch(const char *s, const char *p)
 *
 * <p>Some examples: isMatch("aa","a") → false isMatch("aa","aa") → true isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true isMatch("aa", ".*") → true isMatch("ab", ".*") → true isMatch("aab",
 * "c*a*b") → true
 *
 * <p>Solution: When a wildcard is encountered try to match all the possible prefixes including
 * none, otherwise do a simple one to one match. If the end of string is reached simultaneously in
 * both string and pattern then return true
 */
public class RegularExpressionMatching {
}
