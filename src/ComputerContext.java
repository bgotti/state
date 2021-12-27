/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class ComputerContext implements State {

	private State ComputerState;

	public void setState(State state) {
		this.ComputerState=state;
	}

	public State getState() {
		return this.ComputerState;
	}

	@Override
	public void doAction() {
		this.ComputerState.doAction();
	}

}