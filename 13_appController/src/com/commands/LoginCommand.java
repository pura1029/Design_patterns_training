/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.commands;


public class LoginCommand implements Command
{
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

	public LoginCommand(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public LoginCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginCommand [password=" + password + ", username=" + username
				+ "]";
	}

    

}
