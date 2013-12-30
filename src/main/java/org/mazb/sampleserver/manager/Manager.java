package org.mazb.sampleserver.manager;

import java.util.List;
import org.mazb.sampleserver.transformer.Transformer;

/**
 * @author mazbergaz@gmail.com
 */
public abstract class Manager {
    
    protected Transformer transformer = new Transformer();
    
    public abstract List getAllObject();
    
    public abstract Object getObjectByUniqueCode(String code); 
    
    public abstract void insertObject(Object object);
    
    public abstract void updateObject(Object object);
    
    public abstract void deleteObject(Object object);
    
}
