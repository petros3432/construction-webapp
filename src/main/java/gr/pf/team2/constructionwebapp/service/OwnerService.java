package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.forms.SearchFormOwner;
import gr.pf.team2.constructionwebapp.models.OwnerModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    OwnerModel findOwnerById(Long id);

    Optional<OwnerModel> findOwnerByAfm(String afm);

    Optional<Owner> findOwnerByAfmOwner(String afm);

    List<OwnerModel> firstTenOwners();

    Optional<Owner> findOwnerByEmail(String email);

//    Owner addOwnerProperty(Owner owner);

    List<Owner> getAllOwners();

    Owner register(RegisterOwnerForm registerOwnerForm);

    OwnerModel updateOwner(OwnerModel ownerModel);
    //List<String> findAllNames();

    List<OwnerModel> searchAdvanced(SearchFormOwner searchFormOwner);

}
