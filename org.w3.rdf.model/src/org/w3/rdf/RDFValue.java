/**
 */
package org.w3.rdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Idiomatic property used for structured values. (Not recommended for use.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.RDFValue#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3.rdf.RDFValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRDFValue()
 * @model
 * @generated
 */
public interface RDFValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(RDFResource)
	 * @see org.w3.rdf.RdfPackage#getRDFValue_Resource()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFResource getResource();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFValue#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(RDFResource value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.w3.rdfs.RDFResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.w3.rdf.RdfPackage#getRDFValue_Value()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RDFResource> getValue();

} // RDFValue
