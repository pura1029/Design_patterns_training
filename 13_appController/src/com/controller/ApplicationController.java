/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

 
import java.io.InputStream;
 

import com.commands.Command;
 
import com.factories.ExecutorFactory;
import com.factories.ViewFactory;

import com.executors.Executor;


 
public class ApplicationController {
   
    private Executor executor;
    
    public ApplicationController(InputStream ecfile,InputStream vcfile)
    {
		ExecutorFactory.createExcecutors(ecfile);
		ViewFactory.createViews(vcfile);	
    }


    public String process(String actualPath, Command command)
    {
        String forward=null;
        
        executor=ExecutorFactory.getExecutor(actualPath);
        if(executor!=null)
              forward= executor.execute(command);
        else
        	throw new RuntimeException("Action Not Found");
       
        String view= ViewFactory.getView(forward);
        return view;
        
     }
        
    

}
