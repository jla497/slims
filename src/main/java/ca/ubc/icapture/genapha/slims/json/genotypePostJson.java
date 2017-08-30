/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.ubc.icapture.genapha.slims.json;

/**
 *
 * @author JLee05
 */
/**Genotype Search API*/
public class genotypePostJson {
    String snpRSNumber;
    String snpChromosome;
    String snpGene;
    public genotypePostJson(){}
    public String getSnpRSNumber() {
        return snpRSNumber;
    }

    public void setSnpRSNumber(String snpRSNumber) {
        this.snpRSNumber = snpRSNumber;
    }

    public String getSnpChromosome() {
        return snpChromosome;
    }

    public void setSnpChromosome(String snpChromosome) {
        this.snpChromosome = snpChromosome;
    }

    public String getSnpGene() {
        return snpGene;
    }

    public void setSnpGene(String snpGene) {
        this.snpGene = snpGene;
    }

    @Override
    public String toString() {
        return "genotypePostJson{" + "snpRSNumber=" + snpRSNumber + ", snpChromosome=" + snpChromosome + ", snpGene=" + snpGene + '}';
    }
    
    
    
}
