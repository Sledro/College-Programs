/*
 * ATM Example system - file Log.java
 *
 * copyright (c) 2001 - Russell C. Bjork
 *
 */
 
package atm.physical;
import banking.Message;
import banking.Money;
import banking.Status;
import simulation.Simulation;

/** Manager for the ATM's internal log.  In a real ATM, this would 
 *  manage a physical device; in this simulation,  it uses classes 
 *  in package simulation to simulate the device.
 */
 
public class Log
{
    /** Constructor
     */
    public Log()
    {
    }
    
    /** Log the sending of a message to the bank
     *
     *  @param message the message to be logged
     */
    public void logSend(Message message)
    {
        Simulation.getInstance().printLogLine("Message:   " + message.toString()); 
    }
    
    /** Log a response received from a message
     *
     *  @param status the status object returned by the bank in response
     */
    public void logResponse(Status response)
    {
        Simulation.getInstance().printLogLine("Response:  " + response.toString());
    }
    
    /** Log the dispensing of cash by the cash dispenser
     *
     *  @param amount the amount of cash being dispensed
     */
    public void logCashDispensed(Money amount)
    {
        Simulation.getInstance().printLogLine("Dispensed: " + amount.toString());
    }
    
    /** Log accepting an envelope.  This method is only called if an envelope
     *  is actually received from the customer
     */
    public void logEnvelopeAccepted()
    {
        Simulation.getInstance().printLogLine("Envelope:  received");
    }
}

