
package com.banguat.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="fechainit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "fechainit",
    "moneda"
})
@XmlRootElement(name = "TipoCambioFechaInicialMoneda")
public class TipoCambioFechaInicialMoneda {

    protected String fechainit;
    protected int moneda;

    /**
     * Obtiene el valor de la propiedad fechainit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechainit() {
        return fechainit;
    }

    /**
     * Define el valor de la propiedad fechainit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechainit(String value) {
        this.fechainit = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     */
    public int getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     */
    public void setMoneda(int value) {
        this.moneda = value;
    }

}
