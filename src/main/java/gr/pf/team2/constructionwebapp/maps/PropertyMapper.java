package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Property;
import gr.pf.team2.constructionwebapp.forms.CreatePropertyForm;
import gr.pf.team2.constructionwebapp.models.PropertyModel;
import org.springframework.stereotype.Component;

@Component
public class PropertyMapper {

    public Property propertyFormToProperty(CreatePropertyForm createPropertyForm){
        Property property = new Property();

        property.setAddress(createPropertyForm.getAddress());
        property.setAfm(createPropertyForm.getAfm());
        property.setPropertyE9(createPropertyForm.getPropertyE9());
        property.setYear(createPropertyForm.getYear());
        property.setTypeOfProperty(createPropertyForm.getTypeOfProperty());

        return property;
    }

    public PropertyModel propertyToModel(Property property){
        PropertyModel propertyModel = new PropertyModel();

        propertyModel.setAddress(property.getAddress());
        propertyModel.setAfm(property.getAfm());
        propertyModel.setId(property.getId());
        propertyModel.setPropertyE9(property.getPropertyE9());
        propertyModel.setYear(property.getYear());
        propertyModel.setTypeOfProperty(property.getTypeOfProperty());

        return propertyModel;
    }
}
