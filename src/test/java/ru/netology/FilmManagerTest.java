package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class FilmManagerTest {

    FilmManager manager = Mockito.mock(FilmManager.class);

    PurchaseItem item1 = new PurchaseItem(11, 1, "хлеб" ,3);
    PurchaseItem item2 = new PurchaseItem(222, 22, "булка", 1);
    PurchaseItem item3 = new PurchaseItem(3, 30, "картошка", 7);

    @Test
    public void shouldSum() {
        PurchaseItem[] items = { item1, item2, item3 };
        doReturn(items).when(manager).getItems();

        int expected = 290;
        int actual = manager.getTotal();

        Assertions.assertEquals(expected, actual);
    }
}