package gov.nist.secauto.metaschema.binding;

import com.fasterxml.jackson.core.JsonFactory;

import gov.nist.secauto.metaschema.binding.io.Configuration;
import gov.nist.secauto.metaschema.binding.model.AssemblyClassBinding;

class JsonSerializerImpl<CLASS> extends AbstractJsonSerializer<CLASS> {

	public JsonSerializerImpl(BindingContext bindingContext, AssemblyClassBinding<CLASS> classBinding,
			Configuration configuration) {
		super(bindingContext, classBinding, configuration);
	}

	@Override
	protected JsonFactory getJsonFactoryInstance() {
		return JsonFactoryFactory.singletonInstance();
	}

	
}
