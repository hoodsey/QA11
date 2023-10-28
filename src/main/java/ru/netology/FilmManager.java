package ru.netology;

public class FilmManager {
    private FilmRepository repo;

    public FilmManager(FilmRepository repo) {
        this.repo = repo;
    }

    public void add(PurchaseItem item) {
        repo.save(item);
    }

    public PurchaseItem[] getItems() {
        PurchaseItem[] all = repo.getItems();
        PurchaseItem[] reversed = new PurchaseItem[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
    public PurchaseItem[] findAll() {
        PurchaseItem[] all = repo.getItems();
        return all;
    }
    public PurchaseItem[] findLast(int resultLength) {
        PurchaseItem[] all = repo.getItems();

        if (all.length < resultLength) {
            resultLength = all.length;
        }
        PurchaseItem[] result = new PurchaseItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }
    public PurchaseItem[] findLast() {
        PurchaseItem[] all = repo.getItems();
        int resultLength;
        if (all.length < 5) {
            resultLength = all.length;
        } else {
            resultLength = 5;
        }
        PurchaseItem[] result = new PurchaseItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }
}