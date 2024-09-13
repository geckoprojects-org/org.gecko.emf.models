/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;
import org.w3.rdf.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A range of the subject property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.Range#getProperty <em>Property</em>}</li>
 *   <li>{@link org.w3.rdfs.Range#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(RDFProperty)
	 * @see org.w3.rdfs.RdfsPackage#getRange_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFProperty getProperty();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.Range#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(RDFProperty value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(RDFClass)
	 * @see org.w3.rdfs.RdfsPackage#getRange_Range()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFClass getRange();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.Range#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(RDFClass value);

} // Range
