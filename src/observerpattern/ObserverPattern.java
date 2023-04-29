/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerpattern;

/**
 *
 * @author kartc
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ItemsBought a = new ItemsBought();
        a.attach(new DollarView());
        a.attach( new PercentView() );
        a.buyItem("book", 2.00);
        System.out.println("--");
        a.buyItem("cup", 3.00);
        System.out.println("---");
        a.buyItem("bottle", 5.00);
        
    }
}
