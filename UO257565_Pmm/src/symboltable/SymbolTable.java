package symboltable;

import java.util.*;
import ast.definitions.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String, Definition>> table;
	public SymbolTable()  {
		this.table = new ArrayList<Map<String,Definition>>();
		this.table.add(new HashMap<String, Definition>());
	}

	public void set() {
		table.add(new HashMap<String, Definition>());
		scope++;
	}
	
	public void reset() {
		table.remove(table.size()-1);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		if(findInCurrentScope(definition.getName()) == null){
			definition.setScope(scope);
			this.table.get(scope).put(definition.getName(), definition);
			return true;
		}
		return false;
	}
	
	public Definition find(String id) {
		for(int i = this.table.size()-1; i >= 0 ; i--) {
			if (this.table.get(i).containsKey(id)) {
				return this.table.get(i).get(id);
			}
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		if(this.table.get(scope).containsKey(id)){
			return this.table.get(scope).get(id);
		}
		return null;
	}
}
