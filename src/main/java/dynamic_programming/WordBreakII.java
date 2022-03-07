package dynamic_programming;

import java.util.*;

/**
 * Created by cuining8 on 03/05/2022. Given a non-empty string s and a dictionary
 * wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each
 * word is a valid dictionary word. You may assume the dictionary does not contain duplicate words.
 *
 * <p>Return all such possible sentences.
 *
 * <p>For example, given s = "catsanddog", dict = ["cat", "cats", "and", "sand", "dog"].
 *
 * <p>A solution is ["cats and dog", "cat sand dog"].
 */
public class WordBreakII {
    private Map<Integer, List<String>> map;

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> dict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        List<String> res = new WordBreakII().wordBreakII(s, dict);
        System.out.println(res);
    }


    public List<String> wordBreakII(String s, List<String> dict) {
        if (s == null) return new ArrayList<>();
        map = new HashMap<>();

        Set<String> dictionary = new HashSet<>(dict);

        return backtracking(s, dictionary, 0, s.length());
    }

    public List<String> backtracking(String s, Set<String> dictionary, int p, int l) {
        List<String> result = new ArrayList<>();
        if (p >= s.length()) {
            result.add("");
            return result;
        } else if(map.containsKey(p)) {
            return map.get(p);
        }

        for (int i = p; i < l; i++) {
            String substr = s.substring(p,i+1);
            if (dictionary.contains(substr)) {
                List<String> tmp = backtracking(s, dictionary, i+1, l);
                for (String t : tmp) {
                    result.add((substr + " " + t).trim());
                }
            }
        }
        map.put(p, result);
        return result;
    }













}
