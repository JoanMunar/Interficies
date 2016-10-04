package Escola;

import com.sun.script.util.InterfaceImplementor;

/**
 * Created by jmunarb on 04/10/16.
 */
public class Persona {


}

class Alumne extends Persona{




}

class Docent extends Persona implements Personal{


    @Override
    public void PagarAlPersonal(Personal personal) {


    }
}

class Estudiant extends Alumne{




}

class Becari extends Alumne implements Personal{


    @Override
    public void PagarAlPersonal(Personal personal) {

        
    }
}

class Primaria extends Docent{




}

class Secundria extends Docent{




}