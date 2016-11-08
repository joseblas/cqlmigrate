package uk.sky.cqlmigrate.exception;

import uk.sky.cqlmigrate.LockConfig;

import java.time.Duration;

/**
 * Thrown if any of the queries to acquire lock fail or
 * {@link LockConfig.LockConfigBuilder#withTimeout(Duration)}
 * is reached before lock can be acquired.
 */
public class CannotAcquireLockException extends LockException {

    public CannotAcquireLockException(String message) {
        super(message);
    }

    public CannotAcquireLockException(String message, Throwable cause) {
        super(message, cause);
    }
}
