/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author kartc
 */
public abstract class Subject {
private ArrayList<Observer> obs = new ArrayList<Observer>();
public void attach(Observer o) { obs.add(o); }
public void detach(Observer o) { obs.remove(o); }
public void notifyX() {
for( Observer o : obs ) 
{
o.update(this);
}
}
}
