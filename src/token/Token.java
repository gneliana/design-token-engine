package token;

public class Token {
    private final String name;
    private final TokenType type;
    private final String value;

    public Token(String name, TokenType type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public TokenType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + name + ": " + value;
    }
}
