package com.daubajee.marketmatrix.agent.behaviour;

import com.daubajee.marketmatrix.agent.MarketAgent;

import jade.core.behaviours.Behaviour;

public class SellerBehaviour extends Behaviour {

	public SellerBehaviour(MarketAgent marketAgent) {
		marketAgent.printMsg(getClass().getSimpleName() + " initialised");
	}

	@Override
	public void action() {

	}

	@Override
	public boolean done() {
		return true;
	}

}
