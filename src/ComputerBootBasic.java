/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class ComputerBootBasic {

	private String state="";
	
	public void setState(String state){
		this.state=state;
	}
	
	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("Computer is turned ON");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("Computer is turned OFF");
		}
	}

	public static void main(String args[]){
		ComputerBootBasic remote = new ComputerBootBasic();
		
		remote.setState("ON");
		remote.doAction();
		
		remote.setState("OFF");
		remote.doAction();
	}

}