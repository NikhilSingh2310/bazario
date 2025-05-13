package com.bazario.bazariobackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity class representing a product category in the system.
 * Categories are used to organize and classify products.
 *
 * @author Bazario Team
 * @version 1.0
 */
@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    /**
     * Unique identifier for the category.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * Name of the category.
     * This field cannot be null and must not be empty.
     */
    @Column(name = "category_name", nullable = false)
    private String categoryName;

}
