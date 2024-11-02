package com.example.The_Coding_Sharks_demo.models.data;

import com.example.The_Coding_Sharks_demo.models.PackListItem;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PacklistRepository extends CrudRepository<PackListItem, Integer> {
    // Custom method to find a PacklistItem by id and tripId
    Optional<PackListItem> findByIdAndTripId(int id, int tripId);
}
