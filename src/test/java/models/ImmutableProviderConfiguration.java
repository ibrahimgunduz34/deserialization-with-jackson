package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ImmutableProviderConfiguration {
    private final String configurationId;
    private final String providerName;
    private String apiKey;
    private String secretKey;

    public ImmutableProviderConfiguration(String configurationId, String providerName) {
        this.configurationId = configurationId;
        this.providerName = providerName;
    }

    @JsonProperty("configuration")
    public void unpackConfiguration(Map<String, String> configuration) {
        apiKey = configuration.get("api_key");
        secretKey = configuration.get("secret_key");
    }

    public String getConfigurationId() {
        return configurationId;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }
}
