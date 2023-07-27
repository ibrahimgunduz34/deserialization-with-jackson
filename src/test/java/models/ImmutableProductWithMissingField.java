package models;

public class ImmutableProductWithMissingField {
    private final String id;
    private final String name;
    private final String description;

    public ImmutableProductWithMissingField(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
