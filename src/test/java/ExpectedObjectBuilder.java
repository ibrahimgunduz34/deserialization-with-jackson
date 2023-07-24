import models.*;

import java.util.HashMap;
import java.util.Map;

public class ExpectedObjectBuilder {
    public static MutableProduct buildMutableProduct() {
        MutableProduct expectedProduct = new MutableProduct();
        expectedProduct.setId("ee53eb56-3ee5-4bf6-95b4-c9ce90741417");
        expectedProduct.setName("Green Shirt");
        expectedProduct.setDescription("A beautiful green shirt");
        expectedProduct.setPrice(102.8543529);
        return expectedProduct;
    }

    public static ImmutableProduct buildImmutableProduct() {
        return new ImmutableProduct(
                "ee53eb56-3ee5-4bf6-95b4-c9ce90741417",
                "Green Shirt",
                "A beautiful green shirt",
                102.8543529
        );
    }

    public static ImmutableProductWithLombok buildImmutableProductWithLombok() {
        return new ImmutableProductWithLombok(
                "ee53eb56-3ee5-4bf6-95b4-c9ce90741417",
                "Green Shirt",
                "A beautiful green shirt",
                102.8543529
        );
    }

    public static ImmutableContactDetails buildImmutableContactDetails() {
        return new ImmutableContactDetails(
                "John",
                "Doe",
                "john.doe@example.com"
        );
    }

    public static ImmutableProviderConfiguration buildImmutableProviderConfiguration() {
        ImmutableProviderConfiguration providerConfiguration = new ImmutableProviderConfiguration(
                "7905432d-ee11-4140-a68a-15eda8b14ca1",
                "MyPaymentProcessor"
        );

        providerConfiguration.unpackConfiguration(new HashMap<String, String>() {{
            put("api_key", "32b4b7a7-8d88-4a37-a39e-5b58a72bedf6");
            put("secret_key", "86c7f699-ed3b-4cbc-bb96-0a615401e9ab");
        }});

        return providerConfiguration;
    }
}
