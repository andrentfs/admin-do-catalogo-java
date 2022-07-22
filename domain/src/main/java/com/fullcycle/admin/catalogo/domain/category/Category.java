package com.fullcycle.admin.catalogo.domain.category;

import com.fullcycle.admin.catalogo.domain.AggregateRoot;

import java.time.Instant;
import java.util.UUID;

public class Category extends AggregateRoot<CategoryID> {

    private String Name;
    private String Description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deleteAt;

    private Category(
            final CategoryID anId,
            final String aName,
            final String aDescription,
            final boolean isActive,
            final Instant aCreatedDate,
            final Instant aUpdatedDate,
            final Instant aDeleteDate
    ) {
        super(anId);
        Name = aName;
        Description = aDescription;
        this.active = isActive;
        this.createdAt = aCreatedDate;
        this.updatedAt = aUpdatedDate;
        this.deleteAt = aDeleteDate;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean isActive){
        final var id =  CategoryID.unique();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, isActive, now, now, null);
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeleteAt() {
        return deleteAt;
    }
}
