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
    public Optional<Owner> findOwnerById(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    public Optional<Owner> findOwnerByAfm(String afm) {
        return ownerRepository.findOwnerByAfm(afm);
    }

    @Override
    public Optional<Owner> findOwnerByEmail(String email) {
        return ownerRepository.findOwnerByEmail(email);
    }

    @Override
    public Owner updateOwner(Owner owner, Owner dbOwner) {
        if (!dbOwner.getAddress().equals(dbOwner.getAddress()))
            ownerRepository.updateAddress(owner.getId(),owner.getAddress());
        return dbOwner;
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner addOwnerProperty(Owner owner) {
        if (owner == null) return null;
        return ownerRepository.save(owner);
    }
}
