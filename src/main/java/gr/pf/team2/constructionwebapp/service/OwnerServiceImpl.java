package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.forms.SearchForm;
import gr.pf.team2.constructionwebapp.maps.OwnerMapper;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public Optional<Owner> findOwnerById(Long id) { return ownerRepository.findById(id); }

    @Override
    public Optional<OwnerModel> findOwnerByAfm(String afm) {
        return ownerRepository.findOwnerByAfm(afm);
    }

    @Override
    public Optional<Owner> findOwnerByAfmOwner(String afm) {
        return ownerRepository.findOwnerByAfmOwner(afm);
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


   /* @Override
    public List<String> findAllNames() {
        return ownerRepository
                .findAll()
                .stream()
                .map(owner -> ownerMapper.ownerToName(owner))
                .collect(Collectors.toList());
    }*/

}
