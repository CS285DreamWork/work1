/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flight;

import java.util.List;

/**
 *
 * @author Joy
 */
public interface IFlight {
    
    public void searchFlight();
    public List<Flight> sortByAscendiing();
    public List<Flight> sortByDescendiing();
    
}
