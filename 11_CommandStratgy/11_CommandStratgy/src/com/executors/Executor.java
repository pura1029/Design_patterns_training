/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.executors;

import com.commands.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public interface Executor {
    public String execute(Command c1);
}
