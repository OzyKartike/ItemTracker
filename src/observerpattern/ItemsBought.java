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
public class ItemsBought extends Subject 
{
    private ArrayList<Item> list= new ArrayList<Item>();
    public void buyItem(String s, double d) 
    {
        Item x = new Item(s, d);
        list.add(x);
        notifyX();
    }
    public Item getNewlyAddedItem(int x)
    {
        return list.get(x);
    }
}
