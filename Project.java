
public class Project {

	String[][] relation;
	
	public Project(String[][] relation){
		this.relation = relation;
	}
	
	public boolean isWellSorted ( String[] sequence){
		if(sequence.length <= 1){
			return false;
		}
		
		for(int i=0;i<sequence.length;++i){
			for(int j=1+1;j<sequence.length;++j){
				for(int k=0;k<relation.length;++k){
					if(sequence[i].equals(relation[k][1]) && sequence[j].equals(relation[k][0])){
						return false;
					}
				}
			}
		}
		return true;
	}
	
}
