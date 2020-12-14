package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.models.RepairModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Optional<Owner> findOwnerById(Long id);
    OwnerModel findOwnerByAfm(String afm);

    Optional<Owner> findOwnerByEmail(String email);

    List<Owner> getAllOwners();

    List<OwnerModel> firstTenOwners();
//    Owner addOwnerProperty(Owner owner);

    Owner register(RegisterOwnerForm registerOwnerForm);
    OwnerModel updateOwner(OwnerModel ownerModel);



}
