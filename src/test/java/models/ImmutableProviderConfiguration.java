package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
@Getter
public class ImmutableProviderConfiguration {
    private final String configurationId;
    private final String providerName;
    private String apiKey;
    private String secretKey;

    @JsonProperty("configuration")
    public void unpackConfiguration(Map<String, String> configuration) {
        apiKey = configuration.get("api_key");
        secretKey = configuration.get("secret_key");
    }
}
