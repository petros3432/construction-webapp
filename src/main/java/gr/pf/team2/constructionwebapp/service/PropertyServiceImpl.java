package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.maps.PropertyMapper;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyMapper propertyMapper;

    @Override
    public Optional<Property> findPropertyByAddress(String address) { return propertyRepository.findPropertyByAddress(address); }

    @Override
    public Optional<Property> findPropertyByAfm(String afm) { return propertyRepository.findPropertyByAfm(afm); }

    @Override
    public PropertyModel createProperty(CreatePropertyForm createPropertyForm) {
        Property property = propertyMapper.propertyFormToProperty(createPropertyForm);
        Property property1 = propertyRepository.save(property);
        return propertyMapper.propertyToModel(property1);
    }
}
