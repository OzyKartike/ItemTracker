/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author kartc
 */
public class DollarView extends Observer
{
    
    @Override
    public void update(Subject s) 
    {
        int x = 0;
        System.out.println("Current Dollar View: ");
        Item i = ((ItemsBought)s).getNewlyAddedItem(x);
        try
        {
            while(i != null)
            {
            x++;
            System.out.println(i.getName() + " : " + i.getPrice());
            i = ((ItemsBought)s).getNewlyAddedItem(x);
            }
        }
        catch(Exception e)
        {
            
        }

        
        
    }
    
}
