package by.epam.training.task04.run;

import by.epam.training.task04.entity.Hangar;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

/**
 * Created by higgs on 25.04.15.
 */
public class Runner {
    public static void main(String[] args) throws JAXBException, IOException, SAXException {
        File xmlFile = new File("src/resources/Hangar.xml");
        File fileXsd = new File("src/resources/Hangar.xsd");

        SchemaFactory scFact = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        Schema schema = scFact.newSchema(fileXsd);
        Validator validator = schema.newValidator();

        try {
            validator.validate(new StreamSource(xmlFile));
            System.out.println(xmlFile.getName() + " is valid");
        } catch (SAXException e) {
            System.out.println(xmlFile.getName() + " is NOT valid");
            System.out.println("Reason: " + e.getLocalizedMessage());
        }

        JAXBContext jaxbContext = JAXBContext.newInstance(Hangar.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Hangar hangar = (Hangar)jaxbUnmarshaller.unmarshal(xmlFile);
        System.out.println(hangar);

    }

}
