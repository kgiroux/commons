package com.giroux.kevin.dofustuff.commons.security;

public class UserWrapper {

    /**
     * User
     */
    private User user;
    /**
     * New Password
     */
    private String updatePassword;

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the updatePassword
     */
    public String getUpdatePassword() {
        return updatePassword;
    }

    /**
     * @param updatePassword the updatePassword to set
     */
    public void setUpdatePassword(String updatePassword) {
        this.updatePassword = updatePassword;
    }
}
