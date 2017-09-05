package XstreamAttrAlias;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class AuthorConverter implements SingleValueConverter {

	public String toString(Object obj) {
		return ((Author) obj).getName();
	}

	public Object fromString(String name) {
		return new Author(name);
	}

	public boolean canConvert(Class type) {
		return type.equals(Author.class);
	}
}
