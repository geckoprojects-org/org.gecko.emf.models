/**
 */
package org.w3.rdf;

import org.w3.rdfs.RDFDomain;
import org.w3.rdfs.RDFResource;
import org.w3.rdfs.Range;
import org.w3.rdfs.SubPropertyOf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of RDF properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.RDFProperty#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.w3.rdf.RDFProperty#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link org.w3.rdf.RDFProperty#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRDFProperty()
 * @model
 * @generated
 */
public interface RDFProperty extends RDFResource {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(RDFDomain)
	 * @see org.w3.rdf.RdfPackage#getRDFProperty_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFDomain getDomain();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFProperty#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(RDFDomain value);

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.SubPropertyOf#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference.
	 * @see #setSubPropertyOf(SubPropertyOf)
	 * @see org.w3.rdf.RdfPackage#getRDFProperty_SubPropertyOf()
	 * @see org.w3.rdfs.SubPropertyOf#getProperty
	 * @model opposite="property" required="true" ordered="false"
	 * @generated
	 */
	SubPropertyOf getSubPropertyOf();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFProperty#getSubPropertyOf <em>Sub Property Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Property Of</em>' reference.
	 * @see #getSubPropertyOf()
	 * @generated
	 */
	void setSubPropertyOf(SubPropertyOf value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(Range)
	 * @see org.w3.rdf.RdfPackage#getRDFProperty_Range()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFProperty#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

} // RDFProperty
