/**
 */
package org.w3.rdf;

import org.eclipse.emf.ecore.EObject;
import org.w3.rdfs.RDFClass;
import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subject is an instance of a class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.RDFType#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3.rdf.RDFType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRDFType()
 * @model
 * @generated
 */
public interface RDFType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFResource#getRdfType <em>Rdf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(RDFResource)
	 * @see org.w3.rdf.RdfPackage#getRDFType_Resource()
	 * @see org.w3.rdfs.RDFResource#getRdfType
	 * @model opposite="rdfType" required="true" ordered="false"
	 * @generated
	 */
	RDFResource getResource();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFType#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(RDFResource value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RDFClass)
	 * @see org.w3.rdf.RdfPackage#getRDFType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFClass getType();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RDFClass value);

} // RDFType
