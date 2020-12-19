package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.exceptions.ExceptionsHandling;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.forms.SearchFormProperty;
import gr.pf.team2.constructionwebapp.maps.PropertyMapper;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import gr.pf.team2.constructionwebapp.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private RepairService repairService;

    @Autowired
    private PropertyMapper propertyMapper;

    @Override
    public Optional<Property> findPropertyByAddress(String address) { return propertyRepository.findPropertyByAddress(address); }

    @Override
    public Optional<Property> findPropertyByAfm(String afm) { return propertyRepository.findPropertyByAfm(afm); }

    @Override
    public PropertyModel findPropertyById(Long id) {
        return propertyMapper.propertyToModel(propertyRepository.findById(id).orElseThrow());
    }

    @Override
    public PropertyModel createProperty(CreatePropertyForm createPropertyForm) {
        Property property = propertyMapper.propertyFormToProperty(createPropertyForm);
        Property property1 = propertyRepository.save(property);
        return propertyMapper.propertyToModel(property1);
    }

    @Override
    public void deleteById(Long id) { propertyRepository.deleteById(id); }

    @Override
    public PropertyModel updateProperty(PropertyModel propertyModel) {
        Property property = propertyRepository.findById(propertyModel.getId()).get();
        property.setTypeOfProperty(propertyModel.getTypeOfProperty());
        property.setYear(propertyModel.getYear());
        property.setPropertyE9(propertyModel.getPropertyE9());
        property.setAfm(propertyModel.getAfm());
        if (!property.getAddress().equals(propertyModel.getAddress()))
            repairService.updateAddressFromProperty(property.getId(),propertyModel.getAddress());
        property.setAddress(propertyModel.getAddress());
        Property property1 = propertyRepository.save(property);
        return propertyMapper.propertyToModel(property1);
    }
    public List<PropertyModel> firstTenProperties() {
        return propertyRepository
                .firstTenProperties()
                .stream()
                .map(property -> propertyMapper.propertyToModel(property))
                .collect(Collectors.toList());
    }
    @Override
    public List<PropertyModel> searchAdvanced(SearchFormProperty searchFormProperty) throws ExceptionsHandling {

        if (!searchFormProperty.getAfm().equals("") && searchFormProperty.getPropertyE9().equals("")){
            return propertyRepository.advSearchAfm(searchFormProperty.getAfm())
                    .stream()
                    .map(property -> propertyMapper.propertyToModel(property))
                    .collect(Collectors.toList());
        }

        if (searchFormProperty.getAfm().equals("") && !searchFormProperty.getPropertyE9().equals("")){
            return propertyRepository.advSearchE9(searchFormProperty.getPropertyE9())
                    .stream()
                    .map(property -> propertyMapper.propertyToModel(property))
                    .collect(Collectors.toList());
        }

        if (!searchFormProperty.getAfm().equals("") && !searchFormProperty.getPropertyE9().equals("")){
            return propertyRepository.advSearchE9Afm(searchFormProperty.getPropertyE9(),searchFormProperty.getAfm())
                    .stream()
                    .map(property -> propertyMapper.propertyToModel(property))
                    .collect(Collectors.toList());
        }

        return null;
    }

    @Override
    public void updateAfmFromOwner(Long id, String afm) {
        propertyRepository.updateProperty(id,afm);
    }
}
