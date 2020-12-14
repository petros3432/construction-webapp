package gr.pf.team2.constructionwebapp.maps;

import gr.pf.team2.constructionwebapp.domain.Owner;

import java.util.List;

public class OwnerMapper {

    public String ownerToName(Owner owner){
        return owner.getName() + owner.getSurname();
    }

}
