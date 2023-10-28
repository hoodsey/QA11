package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FilmRepositoryTest {

    PurchaseItem item1 = new PurchaseItem(11, 1, "хлеб", 3);
    PurchaseItem item2 = new PurchaseItem(222, 22, "булка",6);
    PurchaseItem item3 = new PurchaseItem(3, 30, "картошка",5 );

    @Test
    public void test() {
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