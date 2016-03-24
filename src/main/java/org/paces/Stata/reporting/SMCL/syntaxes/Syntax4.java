package org.paces.Stata.reporting.SMCL.syntaxes;

import java.util.regex.Pattern;

/**
 * Interface used to define the behavior of Syntax 4
 * @author Billy Buchanan
 * @version 0.0.0
 */
public interface Syntax4 {

	public final String intent = "do whatever it is that {xyz} does, " +
		"as modified by args, do it on the text text, and then stop doing it";

	public final Boolean sameLineMatching = true;

	default Pattern syntaxPattern(String name) {

		return Pattern.compile("\\{" + name + ":.*\\}");

	}


}
