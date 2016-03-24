package org.paces.Stata.reporting.SMCL.directives;

import java.io.*;
import java.util.*;

/**
 * @author Billy Buchanan
 * @version 0.0.0
 */
public interface Includes {

	/**
	 * Method that consumes the file specified by the include directive and
	 * stores the lines of the file in a list of Strings.
	 * @param fileName The file name to include in the document
	 * @return A list of strings containing the file's contents
	 */
	default List<String> include(String fileName) {
		List<String> contents = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) contents.add(line);
		} catch (IOException e) {
		}
		return contents;
	}


}
