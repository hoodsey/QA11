package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class FilmManagerTest {

    FilmRepository repo = Mockito.mock(FilmRepository.class);
    FilmManager manager = new FilmManager(repo);

    PurchaseItem item1 = new PurchaseItem(11, 1, "Титаник" ,3);
    PurchaseItem item2 = new PurchaseItem(222, 22, "Барби", 1);
    PurchaseItem item3 = new PurchaseItem(3, 30, "Опенгеймер", 7);

    @Test
    public void shouldFindCount() {
        PurchaseItem[] items = { item1, item2, item3 };
        doReturn(items).when(manager).getItems();
        PurchaseItem[]  actual = manager.findLast(2);

        PurchaseItem[] expected = {item1, item3};
        Assertions.assertArrayEquals(expected, actual);
    }
}