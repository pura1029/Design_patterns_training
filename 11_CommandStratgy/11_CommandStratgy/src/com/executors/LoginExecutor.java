/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.executors;

import com.commands.Command;
import com.commands.LoginCommand;

public class LoginExecutor implements Executor {

	public String execute(Command c1) {
		LoginCommand lc = (LoginCommand) c1;
		if (lc.getUsername().equals("admin") && lc.getPassword().equals("admin"))
			return "success.jsp";
		return "login.jsp";

	}
}
