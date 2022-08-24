/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.executors;

import com.commands.Command;
import com.commands.RegisterCommand;

public class RegistrationExecutor implements Executor {

	public String execute(Command c1) {
		RegisterCommand lc = (RegisterCommand) c1;
		if (lc.getUsername().equals("admin") && lc.getPassword().equals("admin"))
			return "RegiSuccess.jsp";
		return "registration.jsp";

	}
}
