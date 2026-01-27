package com.MedInventory;
class Item<T> {
    int id;
    T name;
    int quantity;
    String expiryDate;

    public Item(int id, T name, int quantity, String expiryDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    // For removing duplicates
    @Override
    public boolean equals(Object o) {
        Item<?> item = (Item<?>) o;
        return this.id == item.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
