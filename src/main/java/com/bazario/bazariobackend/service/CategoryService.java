package com.bazario.bazariobackend.service;

import com.bazario.bazariobackend.entity.Category;

import java.util.List;

/**
 * Service interface for managing Category entities.
 * Provides methods for CRUD operations on categories.
 */
public interface CategoryService {
    /**
     * Retrieves all categories from the system.
     *
     * @return List of all categories
     */
    List<Category> getAllCategories();

    /**
     * Creates a new category in the system.
     *
     * @param category the Category object to be created
     */
    void createCategory(Category category);

    /**
     * Deletes a category by its ID.
     *
     * @param categoryId the ID of the category to delete
     * @return status message indicating the result of the operation
     */
    String deleteCategory(Long categoryId);

    /**
     * Updates an existing category.
     *
     * @param category   the updated Category object
     * @param categoryId the ID of the category to update
     * @return the updated Category object
     */
    Category updateCategory(Category category, Long categoryId);
}