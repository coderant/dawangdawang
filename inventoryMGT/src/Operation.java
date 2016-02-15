import java.util.HashMap;

/**
 * Created by angelagu on 2/15/16.
 *
 * This class is used to do operations on inventories
 */
public class Operation implements InventoryManagementSystem {
    HashMap<String, Integer> database = new HashMap<>();
    /**
     * Deduct 'amountToPick' of the given 'productId' from inventory.
     * @param productId The ID of the product to pick
     * @param amountToPick The quantity of the product to pick
     * @return TODO: to be implemented
     */
    @Override
    public PickingResult pickProduct(String productId, int amountToPick) {
        return null;
    }

    /**
     * Add 'amountToRestock' of the given productId to inventory.
     * @param productId The ID of the product to restock
     * @param amountToRestock The quantity of the product to restock
     * @return TODO: to be implemented
     */
    @Override
    public RestockingResult restockProduct(String productId, int amountToRestock) {
        return null;
    }
}
