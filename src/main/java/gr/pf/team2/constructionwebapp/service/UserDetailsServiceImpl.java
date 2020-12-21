package gr.pf.team2.constructionwebapp.service;


import gr.pf.team2.constructionwebapp.domain.Owner;
import gr.pf.team2.constructionwebapp.models.LoginResponse;
import gr.pf.team2.constructionwebapp.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;


public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // here we would search into the repo for the user.
        // for not we are just going to send always a successful response.
        Owner owner = ownerRepository.findOwnerByEmail(email);

        if (owner == null) {
            throw new UsernameNotFoundException(email);
        }


        return new LoginResponse(owner.getEmail(), owner.getPassword(), Arrays.asList(new SimpleGrantedAuthority(owner.getRole().name())));
    }
}
