package models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderClassName = "ImmutableProductWithLombokBuilder")
@JsonDeserialize(builder = ImmutableProductWithLombok.ImmutableProductWithLombokBuilder.class)
@AllArgsConstructor
public class ImmutableProductWithLombok {
    private final String id;
    private final String name;
    private final String description;
    private final Double price;

    @JsonPOJOBuilder(withPrefix = "")
    public static class ImmutableProductWithLombokBuilder {}
}
