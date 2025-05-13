package com.bazario.bazariobackend.controller;

import com.bazario.bazariobackend.entity.Category;
import com.bazario.bazariobackend.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

/**
 * REST Controller for managing Category entities.
 * Provides endpoints for CRUD operations on categories.
 * Public endpoints are accessible without authentication, while admin endpoints require administrative privileges.
 */
@RestController
@RequestMapping("/api")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    /**
     * Retrieves all categories from the system.
     * This endpoint is publicly accessible.
     *
     * @return ResponseEntity containing a list of all categories and HTTP status 200 (OK)
     */
    @GetMapping("/public/categories")
    //@RequestMapping(value = "/public/categories", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getAllCategories(){
        List<Category> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    /**
     * Creates a new category in the system.
     * This endpoint is publicly accessible.
     *
     * @param category the Category object to be created
     * @return ResponseEntity with success message and HTTP status 201 (CREATED)
     */
    @PostMapping("/public/categories")
    //@RequestMapping(value = "/public/categories", method = RequestMethod.POST)
    public ResponseEntity<String> createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return new ResponseEntity<>("Category added successfully", HttpStatus.CREATED);
    }

    /**
     * Deletes a category by its ID.
     * This endpoint requires administrative privileges.
     *
     * @param categoryId the ID of the category to delete
     * @return ResponseEntity with status message and HTTP status 200 (OK) if successful
     * @throws ResponseStatusException if category not found or cannot be deleted
     */
    @DeleteMapping("/admin/categories/{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId){
        try {
            String status = categoryService.deleteCategory(categoryId);
            //return new ResponseEntity<>(status, HttpStatus.OK);
            //return ResponseEntity.ok(status);
            return ResponseEntity.status(HttpStatus.OK).body(status);
        } catch (ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(), e.getStatusCode());
        }
    }


    /**
     * Updates an existing category.
     * This endpoint is publicly accessible.
     *
     * @param category   the updated Category object
     * @param categoryId the ID of the category to update
     * @return ResponseEntity with success message and HTTP status 200 (OK)
     * @throws ResponseStatusException if category not found
     */
    @PutMapping("/public/categories/{categoryId}")
    public ResponseEntity<String> updateCategory(@RequestBody Category category,
                                                 @PathVariable Long categoryId){
        try{
            Category savedCategory = categoryService.updateCategory(category, categoryId);
            return new ResponseEntity<>("Category with category id: " + categoryId, HttpStatus.OK);
        } catch (ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(), e.getStatusCode());
        }
    }
}
