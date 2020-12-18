package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.forms.SearchFormProperty;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.models.RepairModel;

import java.util.List;
import java.util.Optional;

public interface PropertyService {

    Optional<Property> findPropertyByAddress(String address);

    Optional<Property> findPropertyByAfm(String Afm);

    PropertyModel findPropertyById(Long id);

    PropertyModel createProperty(CreatePropertyForm createPropertyForm);

    void deleteById(Long id);

    PropertyModel updateProperty(PropertyModel propertyModel);

    List<PropertyModel> searchAdvanced(SearchFormProperty searchFormProperty) throws ExceptionsHandling;
}