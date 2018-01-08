//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.01.08 à 04:08:22 PM CET 
//


package org.olat.oo.xml.manifest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns="http://www.openolat.org/xsd/oomd_v1p1" xmlns:xs="http://www.w3.org/2001/XMLSchema" align="left"&gt;This is the container for OpenOLAT-specific meta-data. This structure is designed to be used as an extension to the top-level categories within the IEEE LOM. All of its child elements are defined as local.&lt;/p&gt;
 * </pre>
 * 
 *             
 * 
 * <p>Classe Java pour OpenOLATMetadata.Type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OpenOLATMetadata.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="questionType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="sc"/>
 *               &lt;enumeration value="mc"/>
 *               &lt;enumeration value="truefalse"/>
 *               &lt;enumeration value="fib"/>
 *               &lt;enumeration value="kprim"/>
 *               &lt;enumeration value="essay"/>
 *               &lt;enumeration value="hotspot"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="difficulty" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="1.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="standardDeviation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="1.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="discriminationIndex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="-1.0"/>
 *               &lt;maxInclusive value="1.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="distractors" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="assessmentType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="summative"/>
 *               &lt;enumeration value="formative"/>
 *               &lt;enumeration value="both"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="usage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="qpoolIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="masterIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOLATMetadata.Type", propOrder = {
    "questionType",
    "difficulty",
    "standardDeviation",
    "discriminationIndex",
    "distractors",
    "assessmentType",
    "usage",
    "qpoolIdentifier",
    "masterIdentifier"
})
public class OpenOLATMetadataType {

    protected String questionType;
    protected Double difficulty;
    protected Double standardDeviation;
    protected Double discriminationIndex;
    protected Integer distractors;
    protected String assessmentType;
    protected Integer usage;
    protected String qpoolIdentifier;
    protected String masterIdentifier;

    /**
     * Obtient la valeur de la propriété questionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * Définit la valeur de la propriété questionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionType(String value) {
        this.questionType = value;
    }

    /**
     * Obtient la valeur de la propriété difficulty.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDifficulty() {
        return difficulty;
    }

    /**
     * Définit la valeur de la propriété difficulty.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDifficulty(Double value) {
        this.difficulty = value;
    }

    /**
     * Obtient la valeur de la propriété standardDeviation.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Définit la valeur de la propriété standardDeviation.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStandardDeviation(Double value) {
        this.standardDeviation = value;
    }

    /**
     * Obtient la valeur de la propriété discriminationIndex.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscriminationIndex() {
        return discriminationIndex;
    }

    /**
     * Définit la valeur de la propriété discriminationIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscriminationIndex(Double value) {
        this.discriminationIndex = value;
    }

    /**
     * Obtient la valeur de la propriété distractors.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistractors() {
        return distractors;
    }

    /**
     * Définit la valeur de la propriété distractors.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistractors(Integer value) {
        this.distractors = value;
    }

    /**
     * Obtient la valeur de la propriété assessmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentType() {
        return assessmentType;
    }

    /**
     * Définit la valeur de la propriété assessmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentType(String value) {
        this.assessmentType = value;
    }

    /**
     * Obtient la valeur de la propriété usage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsage() {
        return usage;
    }

    /**
     * Définit la valeur de la propriété usage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsage(Integer value) {
        this.usage = value;
    }

    /**
     * Obtient la valeur de la propriété qpoolIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQpoolIdentifier() {
        return qpoolIdentifier;
    }

    /**
     * Définit la valeur de la propriété qpoolIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQpoolIdentifier(String value) {
        this.qpoolIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété masterIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterIdentifier() {
        return masterIdentifier;
    }

    /**
     * Définit la valeur de la propriété masterIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterIdentifier(String value) {
        this.masterIdentifier = value;
    }

}
