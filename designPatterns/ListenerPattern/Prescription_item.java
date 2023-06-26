package pharmacy.designPatterns.ListenerPattern;

import java.util.ArrayList;
import java.util.List;

public class Prescription_item {
    private List<Prescription_itemsListener> listeners = new ArrayList<>();

    public void addListener(Prescription_itemsListener listener) {
        listeners.add(listener);
    }

    public void removeListener(Prescription_itemsListener listener) {
        listeners.remove(listener);
    }

    public void updatePrescriptionItems() {
        // Notify all listeners
        for (Prescription_itemsListener listener : listeners) {
            listener.onPrescriptionItemsUpdated(this);
        }
    }
}
