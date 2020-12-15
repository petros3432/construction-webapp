package gr.pf.team2.constructionwebapp.service;

import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.enums.TypeOfProperty;
import gr.pf.team2.constructionwebapp.forms.RegisterOwnerForm;
import gr.pf.team2.constructionwebapp.maps.OwnerMapper;
import gr.pf.team2.constructionwebapp.models.OwnerModel;
import gr.pf.team2.constructionwebapp.models.RepairModel;
import gr.pf.team2.constructionwebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static gr.pf.team2.constructionwebapp.enums.UserType.OWNER;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public OwnerModel findOwnerById(Long id) {
        return ownerMapper.ownerToModel(ownerRepository.findById(id).orElseThrow());
    }

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
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner register(RegisterOwnerForm registerOwnerForm){
        Owner owner = new Owner(
                registerOwnerForm.getAfm(),
                registerOwnerForm.getName(),
                registerOwnerForm.getSurname(),
                registerOwnerForm.getAddress(),
                registerOwnerForm.getTel(),
                registerOwnerForm.getEmail(),
                registerOwnerForm.getPassword(),
                TypeOfProperty.valueOf(registerOwnerForm.getTypeOfProperty()),
                OWNER

        );
        Owner savedOwner = ownerRepository.save(owner);
        return savedOwner;
    }


    /* @Override
     public List<String> findAllNames() {
         return ownerRepository
                 .findAll()
                 .stream()
                 .map(owner -> ownerMapper.ownerToName(owner))
                 .collect(Collectors.toList());
     }*/
    @Autowired
    public List<OwnerModel> firstTenOwners() {
        return ownerRepository
                .firstTenOwners()
                .stream()
                .map(owner -> ownerMapper.ownerToModel(owner))
                .collect(Collectors.toList());
    }

    public OwnerModel updateOwner(OwnerModel ownerModel) {
        Owner owner = ownerRepository.findById(ownerModel.getId()).get();
        owner.setAddress(ownerModel.getAddress());
        owner.setAfm(ownerModel.getAfm());
        owner.setId(ownerModel.getId());
        owner.setName(ownerModel.getName());
        owner.setSurname(ownerModel.getSurname());
        owner.setTel(ownerModel.getTel());
        owner.setEmail(ownerModel.getEmail());
        Owner owner1 = ownerRepository.save(owner);
        return ownerMapper.ownerToModel(owner1);
    }
}
