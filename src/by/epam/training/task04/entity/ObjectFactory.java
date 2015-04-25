
package by.epam.training.task04.entity;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.epam.training.task04.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.epam.training.task04.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hangar }
     * 
     */
    public Hangar createHangar() {
        return new Hangar();
    }

    /**
     * Create an instance of {@link Plane }
     * 
     */
    public Plane createPlane() {
        return new Plane();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link Ammunition }
     * 
     */
    public Ammunition createAmmunition() {
        return new Ammunition();
    }

    /**
     * Create an instance of {@link Chars }
     * 
     */
    public Chars createChars() {
        return new Chars();
    }

}
