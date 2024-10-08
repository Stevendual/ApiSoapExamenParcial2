
package com.banguat.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCambioDiaResult" type="{http://www.banguat.gob.gt/variables/ws/}InfoVariable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoCambioDiaResult"
})
@XmlRootElement(name = "TipoCambioDiaResponse")
public class TipoCambioDiaResponse {

    @XmlElement(name = "TipoCambioDiaResult")
    protected InfoVariable tipoCambioDiaResult;

    /**
     * Obtiene el valor de la propiedad tipoCambioDiaResult.
     * 
     * @return
     *     possible object is
     *     {@link InfoVariable }
     *     
     */
    public InfoVariable getTipoCambioDiaResult() {
        return tipoCambioDiaResult;
    }

    /**
     * Define el valor de la propiedad tipoCambioDiaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoVariable }
     *     
     */
    public void setTipoCambioDiaResult(InfoVariable value) {
        this.tipoCambioDiaResult = value;
    }

}
