package token;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores and retrieves TokenGroups.
 * Acts as the central in-memory store for the token engine.
 */
public class TokenRegistry {
    private final List<TokenGroup> groups;

    public TokenRegistry() {
        this.groups = new ArrayList<>();
    }

    public void addGroup(TokenGroup group) {
        groups.add(group);
    }

    public TokenGroup getGroup(String name) {
        for (TokenGroup g : groups) {
            if (g.getName().equals(name)) {
                return g;
            }
        }
        return null;
    }

    public List<TokenGroup> getAllGroups() {
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Token Registry ===\n");
        for (TokenGroup g : groups) {
            sb.append(g);
        }
        return sb.toString();
    }
}
