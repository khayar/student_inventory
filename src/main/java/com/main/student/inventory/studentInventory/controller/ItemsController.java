package com.main.student.inventory.studentInventory.controller;

import com.main.student.inventory.studentInventory.model.Items;
import com.main.student.inventory.studentInventory.model.Receipt;
import com.main.student.inventory.studentInventory.model.Student;
import com.main.student.inventory.studentInventory.service.ItemsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemsController {

    Logger logger = LoggerFactory.getLogger(ItemsController.class);
    private final ItemsService itemsService;

    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }
    @GetMapping
    public List<Items> getAllItems() {
        logger.info("getAllItems request has been called !");
        return itemsService.getAllItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Items> getItemsById(@PathVariable("id") Long id) {
        logger.info("getItemsById request has been called with id = " + id);
        Optional<Items> receipt = itemsService.getItemsById(id);
        return receipt.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Items> createItems(@RequestBody Items items) {
        logger.info("createItems request has been called with = " + items);
        Items createdItems = itemsService.createItems(items);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdItems);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Items> updateReceipt(
            @PathVariable("id") Long id,
            @RequestBody Items items
    ) {
        Optional<Items> existingItems = itemsService.getItemsById(id);
        if (existingItems.isPresent()) {
            items.setCreatedBy(existingItems.get().getCreatedBy());
            items.setCreatedOn(existingItems.get().getCreatedOn());
            Items updatedItems = itemsService.updateItems(id, items);
            return ResponseEntity.ok().body(updatedItems);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable("id") Long id) {
        Optional<Items> existingItem = itemsService.getItemsById(id);
        if (existingItem.isPresent()) {
            itemsService.deleteItem(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
