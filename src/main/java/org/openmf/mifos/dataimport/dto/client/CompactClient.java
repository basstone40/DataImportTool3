package org.openmf.mifos.dataimport.dto.client;

import java.util.ArrayList;


public class CompactClient {
	
    private final Integer id;
	
    private final String displayName;
    
    private final String officeName;
    
    private final ArrayList<Integer> activationDate;
   
    private final String externalId;
	
    private final Boolean active;  

	public CompactClient(Integer id, String displayName,  String officeName, String externalId, ArrayList<Integer> activationDate, Boolean active) {
		this.id = id;
        this.displayName = displayName;
        this.activationDate = activationDate;
        this.externalId = externalId;
        this.officeName = officeName;
        this.active = active;
    }
	
	public Integer getId() {
		return this.id;
	}
	
	public String getDisplayName() {
        return this.displayName;
    }
    
    public ArrayList<Integer> getActivationDate() {
        return this.activationDate;
    }

    public String getExternalId() {
        return this.externalId;
    }
    
    public String getOfficeName() {
        return this.officeName;
    }
    
    public Boolean isActive() {
        return this.active;
    }
}
