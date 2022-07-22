package com.fullcycle.admin.catalogo.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {

    private String id;
    private String Name;
    private String Description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deleteAt;

    private Category(
            final String id,
            final String name,
            final String description,
            final boolean active,
            final Instant createdAt,
            final Instant updatedAt,
            final Instant deleteAt
    ) {
        this.id = id;
        Name = name;
        Description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleteAt = deleteAt;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean isActive){
        final var id =  UUID.randomUUID().toString();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, isActive, now, now, null);
    }

    public String getId() {
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
