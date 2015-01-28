/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import DAL.Wijntypetbl;
import java.util.List;

/**
 *
 * @author Christel
 */
public class LijstWijntypeViewModel {
private List<Wijntypetbl> wijntype;

    public LijstWijntypeViewModel(List<Wijntypetbl> wijntype) {
        this.wijntype = wijntype;
    }
    
    public int getAantal(){
        return wijntype.size();
    }
    
     public List<Wijntypetbl> getWijntype() {
        return wijntype;
    }

    public void setWijntype(List<Wijntypetbl> wijntype) {
        this.wijntype = wijntype;
    }
}

