package br.edu.ifpb.pps.factory;

import br.edu.ifpb.pps.models.ISala;

public abstract class IFabricaSala {
	public abstract ISala getSalaTipo(String tipo);
}
