

package dsr.peluqueriacanina;

import dsr.peluqueriacanina.IGU.Principal;


public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        //hacemos que cuando se inicie el programa,
        //llame a la vista "principal"        
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        
    }
}
