import models.ContactDetails;
import models.ImmutableProduct;
import models.ImmutableProductWithLombok;
import models.MutableProduct;

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

    public static ContactDetails buildContactDetails() {
        return new ContactDetails(
                "John",
                "Doe",
                "john.doe@example.com"
        );
    }
}
