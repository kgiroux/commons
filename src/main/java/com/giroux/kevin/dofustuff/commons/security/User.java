package com.giroux.kevin.dofustuff.commons.security;

import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * Class user;
 *
 * @author Kévin Giroux
 */
public class User {
    /**
     * User id;
     */
    private String id;
    /**
     * User login
     */
    private String login;

    /**
     * User password hash
     */
    private String password;

    /**
     * User email
     */
    private String email;

    /**
     * Type d'utilisateur.
     */
    private TypeUser typeUser;

    /**
     * User related profiles
     */
    private List<Profile> profiles;

    /**
     * Default constructor
     */
    public User() {
    }


    public User(List<Profile> profiles) {
        this.profiles = profiles;
    }

    /**
     * Constructor with user's attributes
     *
     * @param pLogin The user pLogin
     * @param pEmail the user email
     */
    public User(String pEmail, String pLogin) {
        email = pEmail;
        login = pLogin;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int compareTo(User arg0) {
        // TODO supprimer les tests inutiles lorsque le portail saura bloquer les création avec un nom null
        if (login != null && arg0.login != null) {
            return login.compareTo(arg0.login);
        } else {
            if (login == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /**
     * @return the typeUser
     */
    public TypeUser getTypeUser() {
        return typeUser;
    }

    /**
     * @param typeUser the typeUser to set
     */
    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    /**
     * @return the profiles
     */
    public List<Profile> getProfiles() {
        return profiles;
    }

    /**
     * @param profiles the profiles to set
     */
    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
        if (!CollectionUtils.isEmpty(this.profiles)) {
            Collections.sort(profiles);
        }
    }


}