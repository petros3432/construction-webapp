package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.domain.Property;

import java.util.Optional;

public interface PropertyService {

    Optional<Property> findPropertyByAddress(String address);
}
