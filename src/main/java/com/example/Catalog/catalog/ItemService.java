package com.example.Catalog.catalog;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;

    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        itemDao.findAll().forEach(items::add);
        return items;
    }

    public Item getItem(String number) {
        //return items.stream().filter(i -> i.getNo().equals(number)).findFirst().get();Integer.toString(id)
        Item item = itemDao.findById(number).orElse(null);
        return item;
    }

    public Item addItem(Item item) {
        itemDao.save(item);
        return item;
    }

    public Item updateItem(String number, Item item) {
        itemDao.save(item);
        return item;
    }

    public Item deleteItem(String number) {
        //items.removeIf(i -> i.getNo().equals(number));
        Item item = itemDao.findById(number).orElse(null);
        itemDao.deleteById(number);
        return item;
    }

}