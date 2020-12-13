package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.enums.UserType;
import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm2;
import gr.pf.team2.constructionwebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static gr.pf.team2.constructionwebapp.enums.UserType.OWNER;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Optional<Owner> findOwnerById(Long id) { return ownerRepository.findById(id); }

    @Override
    public Optional<Owner> findOwnerByAfm(String afm) {
        return ownerRepository.findOwnerByAfm(afm);
    }

    @Override
    public Optional<Owner> findOwnerByEmail(String email) {
        return ownerRepository.findOwnerByEmail(email);
    }

    @Override
    public List<Owner> getAllOwners() { return ownerRepository.findAll(); }

//    @Override
//    public Owner addOwnerProperty(Owner owner) {
//        if (owner == null) return null;
//        return ownerRepository.save(owner);
//    }

    @Override
    public Owner register(RegisterOwnerForm2 registerOwnerForm2){
        Owner owner = new Owner(
                registerOwnerForm2.getAfm(),
                registerOwnerForm2.getName(),
                registerOwnerForm2.getSurname(),
                registerOwnerForm2.getAddress(),
                registerOwnerForm2.getTel(),
                registerOwnerForm2.getEmail(),
                registerOwnerForm2.getPassword(),
                TypeOfProperty.valueOf(registerOwnerForm2.getTypeOfProperty()),
                OWNER

        );
        Owner savedOwner = ownerRepository.save(owner);
        return savedOwner;
    }

}
