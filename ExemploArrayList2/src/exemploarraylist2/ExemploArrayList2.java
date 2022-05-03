/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploarraylist2;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Hanne
 */
public class ExemploArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<String> bandas = new ArrayList<> ();
            
            bandas.add("Rush");
            System.out.print( "Adicionando a banda Rush: " );
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            bandas.add("Beatles");
            System.out.print( "Adicionando a banda Beatles: " );
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            bandas.add("Iron Maiden");
            System.out.print( "Adicionando a banda Iron Maiden: " );
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            System.out.print( "Quem está na índice 0: " );
            System.out.println( bandas.get(0) );
            
            System.out.print( "Adicionando Tiririca onde estava o Rush: " );
            bandas.add( bandas.indexOf("Rush"), "Tiririca");
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            System.out.print( "Número de elementos na lista: " );
            System.out.println( bandas.size() );
            
            System.out.print( "Removendo o Tiririca: " );
            bandas.remove("Tiririca");
            System.out.println( Arrays.toString( bandas.toArray() ) );
            
            System.out.print( "Removendo tudo: " );
            bandas.clear();
            System.out.println( Arrays.toString( bandas.toArray() ) );
        }

}

