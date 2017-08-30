/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

import ca.ubc.icapture.genapha.slims.model.Tblphenotypes;

/**
 *
 * @author Administrator
 */
public class PhenotypeDTO {
        String name;
        String description;
        String value;
        int subjectId;
        String stringSubjectId;

        public PhenotypeDTO() {
            this.name = "";
            this.description = "";
            this.value = "";
            this.subjectId = -1;
            this.stringSubjectId = "";
        }
        
          public PhenotypeDTO(Tblphenotypes p) {
            this.name = p.getTblphenotypelookup().getName();
            this.description = p.getTblphenotypelookup().getDescription();
            this.value = p.getValue();
 
        }

    public String getStringSubjectId() {
        return stringSubjectId;
    }

    public void setStringSubjectId(String stringSubjectId) {
        this.stringSubjectId = stringSubjectId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

        
        @Override
        public String toString() {
            return "Phenotype{" + "name=" + name + ", description=" + description + ", value=" + value + '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        
        
    }
