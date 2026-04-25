package token;

import java.util.ArrayList;
import java.util.List;

/**
 * A named group of related design tokens.
 * Example: a "colors" group containing color tokens.
 * Supports Composite pattern — groups can contain tokens.
 */
public class TokenGroup {
    private final String name;
    private final List<Token> tokens;

    public TokenGroup(String name) {
        this.name = name;
        this.tokens = new ArrayList<>();
    }

    public void addToken(Token token) {
        tokens.add(token);
    }

    public String getName() {
        return name;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group: ").append(name).append("\n");
        for (Token t : tokens) {
            sb.append("  ").append(t).append("\n");
        }
        return sb.toString();
    }
}
