package com.main.student.inventory.studentInventory.service;

import com.main.student.inventory.studentInventory.model.Items;
import com.main.student.inventory.studentInventory.model.Receipt;
import com.main.student.inventory.studentInventory.repository.ItemsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemsService {

    private final ItemsRepository itemsRepository;
    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }
    public List<Items> getAllItems() {
        return itemsRepository.findAll();
    }
    public Optional<Items> getItemsById(Long id) {
        return itemsRepository.findById(id);
    }
    public Items createItems(Items items) {
        return itemsRepository.save(items);
    }
    public Items updateItems(Long id, Items items) {
        items.setId(id);
        return itemsRepository.save(items);
    }
    public void deleteItem(Long id) {
        itemsRepository.deleteById(id);
    }
}
