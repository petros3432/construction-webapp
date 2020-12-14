package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.models.OwnerModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Optional<Owner> findOwnerById(Long id);
    Optional<OwnerModel> findOwnerByAfm(String afm);

    Optional<Owner> findOwnerByAfmOwner(String afm);

    Optional<Owner> findOwnerByEmail(String email);

    List<Owner> getAllOwners();

}
