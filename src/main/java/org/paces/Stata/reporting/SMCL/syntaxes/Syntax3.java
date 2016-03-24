package org.paces.Stata.reporting.SMCL.syntaxes;

import java.util.regex.Pattern;

/**
 * Interface used to define the behavior of Syntax 3
 * @author Billy Buchanan
 * @version 0.0.0
 */
public interface Syntax3 {


	public final String intent = "do whatever it is that {xyz} does, as modified by args";

	public final Boolean sameLineMatching = true;

	default Pattern syntaxPattern(String name) {

		return Pattern.compile("\\{" + name + " .*\\}");

	}


}
