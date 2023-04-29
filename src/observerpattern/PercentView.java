/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerpattern;

/**
 *
 * @author kartc
 */
public class PercentView extends Observer
{
        
    @Override
    public void update(Subject s) 
    {
        int x = 0;
        double total = 0;
        System.out.println("Current Percent View: ");
        Item i = ((ItemsBought)s).getNewlyAddedItem(x);
        try
        {
            while(i != null)
            {
                x++;
                total = total + i.getPrice();
                //System.out.println(i.getName() + " : " + i.getPrice());
                i = ((ItemsBought)s).getNewlyAddedItem(x);
            }
        }
        catch(Exception e)
        {
            
        }
        x= 0;
        i = ((ItemsBought)s).getNewlyAddedItem(x);
        try
        {
            while(i != null)
            {
                System.out.println(i.getName() + " : " + (i.getPrice()/total)*100 + "%");
                x++;
                i = ((ItemsBought)s).getNewlyAddedItem(x);
            }
        }
        catch(Exception e)
        {
            
        }
        
        
    }
    
}
    

