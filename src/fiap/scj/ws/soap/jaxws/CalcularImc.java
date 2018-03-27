
package fiap.scj.ws.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calcularImc", namespace = "http://soap.ws.scj.fiap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularImc", namespace = "http://soap.ws.scj.fiap/", propOrder = {
    "arg0",
    "arg1"
})
public class CalcularImc {

    @XmlElement(name = "altura", namespace = "")
    private float arg0;
    @XmlElement(name = "peso", namespace = "")
    private float arg1;

    /**
     * 
     * @return
     *     returns float
     */
    public float getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(float arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns float
     */
    public float getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(float arg1) {
        this.arg1 = arg1;
    }

}
