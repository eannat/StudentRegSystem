/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegSystemPackage;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Eannat
 */
public class Programme {
   
    
    public String Cname;
    public DateTime StartDate;
    public DateTime EndDate;
    ArrayList<Module> ListofModules = new ArrayList<Module>();
    
    
    public Programme(String CCname,DateTime SD, DateTime ED) {
    this.Cname = CCname;
    this.StartDate = SD;
    this.EndDate = ED;
    }

    @Override
    public String toString() {
        return "Programme{" + "Cname=" + Cname + ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", ListofModules=" + ListofModules +'}';
    }
    
    
    
    public void addModule(Module module) {
        ListofModules.add(module);
    }
    
}
