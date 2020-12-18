package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.models.PropertyModel;

import java.util.Optional;

public interface PropertyService {

    Optional<Property> findPropertyByAddress(String address);

    Optional<Property> findPropertyByAfm(String Afm);

    PropertyModel createProperty(CreatePropertyForm createPropertyForm);
}
