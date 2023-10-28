package ru.netology;

public class PurchaseItem {
    private int id;
    private int filmId;
    private String filmName;

    public PurchaseItem(int id, int filmId, String filmName) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return filmId;
    }

    public void setProductId(int productId) {
        this.filmId = filmId;
    }

    public String getProductName() {
        return filmName;
    }

    public void setProductName(String productName) {
        this.filmName = productName;
    }

}