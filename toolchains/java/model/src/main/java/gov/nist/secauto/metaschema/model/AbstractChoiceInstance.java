package gov.nist.secauto.metaschema.model;

import java.util.Collections;
import java.util.Map;

import gov.nist.secauto.metaschema.markup.MarkupString;

public abstract class AbstractChoiceInstance implements ChoiceInstance {
	private final AssemblyDefinition containingAssembly;

	public AbstractChoiceInstance(AssemblyDefinition containingAssembly) {
		this.containingAssembly = containingAssembly;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public MarkupString getDescription() {
		return null;
	}

	@Override
	public Type getType() {
		return Type.CHOICE;
	}

	@Override
	public Metaschema getContainingMetaschema() {
		return containingAssembly.getContainingMetaschema();
	}

	@Override
	public boolean isReference() {
		return false;
	}

	@Override
	public InfoElementDefinition getDefinition() {
		return null;
	}

	@Override
	public InfoElementDefinition getContainingDefinition() {
		return containingAssembly;
	}

	@Override
	public FlagInstance getFlagInstanceByName(String name) {
		return null;
	}

	@Override
	public Map<String, ? extends FlagInstance> getFlagInstances() {
		return Collections.emptyMap();
	}

	@Override
	public FieldInstance getFieldInstanceByName(String name) {
		return getFieldInstances().get(name);
	}

	@Override
	public AssemblyInstance getAssemblyInstanceByName(String name) {
		return getAssemblyInstances().get(name);
	}
}
