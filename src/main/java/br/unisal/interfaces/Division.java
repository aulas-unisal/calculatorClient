
package br.unisal.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de division complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="division">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dividend" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="divisor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "division", propOrder = {
    "dividend",
    "divisor"
})
public class Division {

    protected double dividend;
    protected double divisor;

    /**
     * Obtém o valor da propriedade dividend.
     * 
     */
    public double getDividend() {
        return dividend;
    }

    /**
     * Define o valor da propriedade dividend.
     * 
     */
    public void setDividend(double value) {
        this.dividend = value;
    }

    /**
     * Obtém o valor da propriedade divisor.
     * 
     */
    public double getDivisor() {
        return divisor;
    }

    /**
     * Define o valor da propriedade divisor.
     * 
     */
    public void setDivisor(double value) {
        this.divisor = value;
    }

}
