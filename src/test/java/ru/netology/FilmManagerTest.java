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

    PurchaseItem item1 = new PurchaseItem(1, 1, "Титаник");
    PurchaseItem item2 = new PurchaseItem(2, 22, "Барби");
    PurchaseItem item3 = new PurchaseItem(3, 30, "Опенгеймер");
    PurchaseItem item4 = new PurchaseItem(4, 13, "Мультфильм");
    PurchaseItem item5 = new PurchaseItem(5, 65, "Реклама");
    PurchaseItem item6 = new PurchaseItem(6, 4, "Боевик");

    @Test
    public void TestfindAll() {
        PurchaseItem[] items = { item1, item2, item3 };
        doReturn(items).when(repo).getItems();
        PurchaseItem[]  actual = manager.findAll();

        PurchaseItem[] expected = { item1, item2, item3 };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastforSixFilm() {
        PurchaseItem[] items = { item1, item2, item3, item4, item5, item6};
        doReturn(items).when(repo).getItems();
        PurchaseItem[]  actual = manager.findLast();

        PurchaseItem[] expected = { item6, item5, item4,item3, item2};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void GetItemTest() {
        PurchaseItem[] items = { item1, item2, item3, item4, item5, item6};
        doReturn(items).when(repo).getItems();

        PurchaseItem[] expected = { item6, item5, item4, item3, item2, item1};

        Assertions.assertArrayEquals(expected, manager.getItems());
    }
    @Test
    public void findLastforFourFilm() {
        PurchaseItem[] items = { item1, item2, item3, item4};
        doReturn(items).when(repo).getItems();
        PurchaseItem[]  actual = manager.findLast();

        PurchaseItem[] expected = { item4,item3, item2, item1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void AddItem() {
        PurchaseItem[] items = { item1, item2, item3, item4};
        doReturn(items).when(repo).getItems();
        manager.add(item5);

        PurchaseItem[] expected = {item4,item3, item2, item1};
        PurchaseItem[]  actual = manager.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastforFourFilmWithParameter() {
        PurchaseItem[] items = { item1, item2, item3, item4};
        doReturn(items).when(repo).getItems();
        PurchaseItem[]  actual = manager.findLast(3);

        PurchaseItem[] expected = { item4,item3, item2};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastforSixFilmWithParameter() {
        PurchaseItem[] items = { item1, item2, item3, item4, item5, item6};
        doReturn(items).when(repo).getItems();
        PurchaseItem[]  actual = manager.findLast(2);

        PurchaseItem[] expected = { item6,item5};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastforFiveFilmWithParameter() {
        PurchaseItem[] items = { item1, item2, item3, item4, item5};
        doReturn(items).when(repo).getItems();
        PurchaseItem[]  actual = manager.findLast(6);

        PurchaseItem[] expected = { item5,item4, item3,item2, item1};

        Assertions.assertArrayEquals(expected, actual);
    }
}