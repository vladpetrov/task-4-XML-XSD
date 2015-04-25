package by.epam.training.task04.run;

import by.epam.training.task04.entity.Hangar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by higgs on 25.04.15.
 */
public class Runner {
    public static void main(String[] args) throws JAXBException {
        File file = new File("src/resources/Hangar.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Hangar.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Hangar hangar = (Hangar)jaxbUnmarshaller.unmarshal(file);
        System.out.println(hangar);

    }

}
