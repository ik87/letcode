package yandex;

import java.util.Deque;
import java.util.LinkedList;
//https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesesJ {
    public static boolean isValid(String s) {
        Deque q = new LinkedList<Character>();

        for(Character n : s.toCharArray()) {
            if(n.equals('(')) {
                q.offerFirst(')');
            }
            else if (n.equals('[')) {
                q.offerFirst(']');
            }
            else if (n.equals('{')) {
                q.offerFirst('}');
            }
            else if(!n.equals(q.pollFirst())) {
                return false;
            }
        }
        return q.isEmpty();
    }
}
