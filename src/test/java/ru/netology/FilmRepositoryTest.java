package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FilmRepositoryTest {

    PurchaseItem item1 = new PurchaseItem(1, 1, "Титаник");
    PurchaseItem item2 = new PurchaseItem(2, 22, "Барби");
    PurchaseItem item3 = new PurchaseItem(3, 30, "Опенгеймер");
    PurchaseItem item4 = new PurchaseItem(4, 13, "Мультфильм");
    PurchaseItem item5 = new PurchaseItem(5, 65, "Реклама");
    PurchaseItem item6 = new PurchaseItem(6, 4, "Боевик");

    @Test
    public void testRemoveFilm() {
        FilmRepository repo = new FilmRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getId());

        PurchaseItem[] expected = {item1, item3};
        PurchaseItem[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }
}