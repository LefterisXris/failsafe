package net.jodah.failsafe;

/**
 * The state of the circuit.
 */
public enum State {
   /**
    * The circuit is closed and fully functional, allowing executions to occur.
    */
   CLOSED,
   /**
    * The circuit is opened and not allowing executions to occur.
    */
   OPEN,
   /**
    * The circuit is temporarily allowing executions to occur.
    */
   HALF_OPEN
}