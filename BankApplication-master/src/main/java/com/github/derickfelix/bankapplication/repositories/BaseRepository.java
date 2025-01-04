
package com.github.desakirt.bankapplication.models;

import java.util.List;
import java.util.Optional;

/**
 *
 * @param <T> the model the repository will represent
 * @param <ID> the type of the model identification
 */
public interface BaseRepository<T, ID> {
    /**
     * Retrieves all the entities of the database
     *
     * @return - A List of entites
     */
    List<T> findAll();

    /**
     * Gets an entity in the database by specifying an id
     *
     * @param id the id of the entity
     * @return an optional of the found entity
     */
    Optional<T> find(ID id);

    /**
     * Save a specific entity in the database
     *
     * @param model the entity to update
     */
    void save(T model);

    /**
     * Destroy a customer of the database
     *
     * @param id the id to be destroyed
     * @return an optional of the deleted entity
     */
    Optional<T> deleteById(ID id);
}
