package exercicios.exColecoesGenericas.parenteses;

import java.util.Stack;

public class Parenteses {
    public static void main(String[] args) {
        String[] testStrings = {
            "(()()()())",
            "(((())))",
            "(()((())()))",
            "((((((())",
            "()))",
            "(()()(()"
        };

        for (String s : testStrings) {
            System.out.println("String: " + s + " estah " + (estahBalanceada(s) ? "balanceada" : "desbalanceada"));
        }
    }

    public static boolean estahBalanceada(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}

