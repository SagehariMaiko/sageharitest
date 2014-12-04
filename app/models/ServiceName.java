package models;

import java.util.*;

import javax.persistence.*;

import play.db.jpa.*;
import util.common.ViewNames;

@Entity
@Table(name=ViewNames.V_SERVICE_FALSECOUNT) 
public class ServiceName extends Model {
	
	public int ID;
	public String formSerCd;
	public String service_name;
	public String table_name;
	public int rowcnt;
	
}
