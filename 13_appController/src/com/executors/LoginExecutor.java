/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.executors;

import com.commands.Command;
import com.commands.LoginCommand;
import com.executors.Executor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginExecutor implements Executor{

    public String execute(Command command)
    {
        LoginCommand lc=(LoginCommand) command;
        String  userName=lc.getUsername();
        String password=lc.getPassword();
        System.out.println("UserName:" +userName);
        System.out.println("Password:" +password);
       
        if(userName==null || password==null)
            return "failure";
        else if(userName.equals("user") && password.equals("user"))
                return "success";
        else
                return "failure";
    }

}
