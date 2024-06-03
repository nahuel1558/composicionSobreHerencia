package ProgramMain;

import Model.Transport;

/**
 *
 * @author nahue
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Instance.instance();

        for (Transport transport : Instance.transports) {
            System.out.println(transport.deliver("Sample Destination", "Sample Cargo"));
        }
    }
    
}
