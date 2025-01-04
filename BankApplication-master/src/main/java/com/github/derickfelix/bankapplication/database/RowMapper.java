
package com.github.derickfelix.bankapplication.database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * An interface used by {@link BankAppTemplate BankAppTemplate} for mapping rows of a
 * ResultSet on a per-row bases. Implementations of this interface perform the
 * actual work of mapping each row to a result object, but don't need to worry
 * about exception handling. {@code SQLExceptions} will be caught and handled by
 * the calling {@code BankAppTemplate}.
 *
 *
 * @param <T> the model of the row mapper
 */
public interface RowMapper<T> {
    
    /**
     * Implementations must implement this method to map each row of data in the
     * ResultSet. This method should not call next() on the ResultSet; it is
     * only supposed to map values of the current row.
     *
     * @param rs the ResultSet to map (pre-initialized for the current row)
     * @return the result object for the current row (may be null)
     * @throws java.sql.SQLException if a SQLException is encountered getting
     * column values (that is, there's no need to catch SQLException)
     */
    T mapRow(ResultSet rs) throws SQLException;
    
}
