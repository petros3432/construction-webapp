package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Optional<Owner> findOwnerById(Long id);
    Optional<Owner> findOwnerByAfm(String afm);
    Optional<Owner> findOwnerByEmail(String email);

    List<Owner> getAllOwners();

    Owner addOwnerProperty(Owner owner);



}
