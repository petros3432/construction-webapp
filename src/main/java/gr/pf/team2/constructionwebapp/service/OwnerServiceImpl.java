package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Optional<Owner> findOwner(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Owner> getAllOwners() {
        return null;
    }
}
