package file.system.commands;

import file.system.Terminal;

public interface Command {
	String execute (String[] words, Terminal dir);
}
