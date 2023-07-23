package models;

import lombok.Value;

@Value
public class ImmutableProductWithLombok {
    String id;
    String name;
    String description;
    Double price;
}
