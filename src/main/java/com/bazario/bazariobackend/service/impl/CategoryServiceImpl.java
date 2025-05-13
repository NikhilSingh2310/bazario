package com.bazario.bazariobackend.service.impl;

import com.bazario.bazariobackend.entity.Category;
import com.bazario.bazariobackend.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of the CategoryService interface.
 * Provides methods for managing Category entities in the system.
 * This implementation uses an in-memory list to store categories.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    /**
     * In-memory storage for categories.
     */
    private final List<Category> categories = new ArrayList<>();

    /**
     * Counter for generating unique category IDs.
     */
    private Long nextId = 1L;

    /**
     * {@inheritDoc}
     * Returns a reference to the in-memory list of categories.
     */
    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    /**
     * {@inheritDoc}
     * Assigns a unique ID to the category before adding it to the list.
     */
    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);
    }

    /**
     * {@inheritDoc}
     *
     * @throws ResponseStatusException with HTTP 404 if category is not found
     */
    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categories.stream()
                .filter(c -> c.getCategoryId().equals(categoryId))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        categories.remove(category);
        return "Category with categoryId: " + categoryId + " deleted successfully !!";
    }

    /**
     * {@inheritDoc}
     *
     * @throws ResponseStatusException with HTTP 404 if category is not found
     */
    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Optional<Category> optionalCategory = categories.stream()
                .filter(c -> c.getCategoryId().equals(categoryId))
                .findFirst();

        if (optionalCategory.isPresent()) {
            Category existingCategory = optionalCategory.get();
            existingCategory.setCategoryName(category.getCategoryName());
            return existingCategory;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found");
        }
    }
}
