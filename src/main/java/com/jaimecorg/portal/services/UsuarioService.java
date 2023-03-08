package com.jaimecorg.portal.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jaimecorg.portal.model.Permiso;
import com.jaimecorg.portal.model.Usuario;
import com.jaimecorg.portal.repository.UsuarioRepository;



@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository userRepository;

    public Usuario createUser(Usuario user) {
        return userRepository.save(user);
    }

    public Usuario updateUser(Usuario user) {
        return userRepository.save(user);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    public Usuario getUser(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public List<Usuario> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario user = userRepository.findByNombre(username);
        List<Permiso> permissions = user.getPermissions();
        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();

        for (Permiso p : permissions) {
            roles.add(new SimpleGrantedAuthority(p.getNombre()));
        }

        UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
                .username(user.getNombre())
                .password(user.getPassword())
                .authorities(roles)
                .build();

        return userDetails;

    }

}
