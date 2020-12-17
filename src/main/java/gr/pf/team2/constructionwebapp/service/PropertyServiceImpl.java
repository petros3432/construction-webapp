package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Property;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService{
    @Override
    public Optional<Property> findPropertyByAddress(String address) {
        return Optional.empty();
    }
}
