/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comercioeletronicowar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author João Henrique
 */
public class RealConverter implements Converter {

    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        String valor = arg2.toString();
        if(valor.indexOf(".") > -1){
            valor = valor.replace(".", ",");
            if (valor.substring(valor.indexOf(","), valor.length() - 1).length() == 1){
                valor += "0";
            }
        }else{
            valor += ",00";
        }
        return "R$ " + valor;
    }

}
