package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper {

    public OwnerModel ownerToModel(Owner owner){
        OwnerModel ownerModel = new OwnerModel();
        ownerModel.setName(owner.getName());
        ownerModel.setSurname(owner.getSurname());
        ownerModel.setAfm(owner.getAfm());
        ownerModel.setId(owner.getId());
        ownerModel.setPassword((owner.getPassword()));
        ownerModel.setAddress(owner.getAddress());
        ownerModel.setTel(owner.getTel());
        ownerModel.setEmail(owner.getEmail());
        ownerModel.setTypeOfProperty(owner.getTypeOfProperty());
        ownerModel.setUserType(owner.getUserType());
        return ownerModel;
    }


}
