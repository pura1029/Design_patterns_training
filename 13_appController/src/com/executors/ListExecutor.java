package com.executors;

import com.commands.Command;
import com.commands.ListCommand;
import com.model.Product;

import java.util.ArrayList;



public class ListExecutor implements Executor {
	
	public String execute(Command com)
	{
		ListCommand lc=(ListCommand)com;
		ArrayList<Product> prd_list=null;
		
		prd_list=lc.getPrd_list();
		System.out.print("wuz here lc-->" +lc);
		if(prd_list==null)
		return "failure";
		else
		return "list";
	}

}
