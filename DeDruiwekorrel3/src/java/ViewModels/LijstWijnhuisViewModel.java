/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import DAL.Wijnhuistbl;
import java.util.List;

/**
 *
 * @author Christel
 */
public class LijstWijnhuisViewModel {
private List<Wijnhuistbl> wijnhuis;

    public LijstWijnhuisViewModel(List<Wijnhuistbl> wijnhuis) {
        this.wijnhuis = wijnhuis;
    }
    
    
    
    public int getAantal(){
        return wijnhuis.size();
    }
    
    
    /**
     * @return the autos
     */
    public List<Wijnhuistbl> getWijnhuis() {
        return wijnhuis;
    }

//    /**
//     * @param landen the bestellingen to set
//     */
    public void setWijnhuis(List<Wijnhuistbl> wijnhuis) {
        this.wijnhuis = wijnhuis;
    }
}

