/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.standardtypes;

import java.util.List;

/**
 *
 * @author student
 */
public class UniversalSort {
    
    static void sort(List _elements,boolean toHigher, IComparator _comparator){
        
        boolean ordered = false;
        
        while(!ordered){
            ordered = true;
            for (int i = 0; i < _elements.size() - 1; i++) {
                //if (_elements.get(i) > _elements.get(i + 1)) {                
                if (toHigher == _comparator.compare(_elements.get(i), _elements.get(i + 1))) {
                    Object tmpObject = _elements.get(i);
                    _elements.set(i, _elements.get(i + 1));
                    _elements.set(i + 1, tmpObject);
                    ordered = false;
                }
            }
        }     
        
    }
}
