package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Optional<Owner> findOwner(Long id);

    List<Owner> getAllOwners();
}
