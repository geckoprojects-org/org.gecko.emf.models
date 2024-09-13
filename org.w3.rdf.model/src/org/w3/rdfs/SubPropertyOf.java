/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;
import org.w3.rdf.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Property Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subject is a subproperty of a property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.SubPropertyOf#getProperty <em>Property</em>}</li>
 *   <li>{@link org.w3.rdfs.SubPropertyOf#getSubPropertyOf <em>Sub Property Of</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getSubPropertyOf()
 * @model
 * @generated
 */
public interface SubPropertyOf extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFProperty#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(RDFProperty)
	 * @see org.w3.rdfs.RdfsPackage#getSubPropertyOf_Property()
	 * @see org.w3.rdf.RDFProperty#getSubPropertyOf
	 * @model opposite="subPropertyOf" required="true" ordered="false"
	 * @generated
	 */
	RDFProperty getProperty();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SubPropertyOf#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(RDFProperty value);

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference.
	 * @see #setSubPropertyOf(RDFProperty)
	 * @see org.w3.rdfs.RdfsPackage#getSubPropertyOf_SubPropertyOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFProperty getSubPropertyOf();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SubPropertyOf#getSubPropertyOf <em>Sub Property Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Property Of</em>' reference.
	 * @see #getSubPropertyOf()
	 * @generated
	 */
	void setSubPropertyOf(RDFProperty value);

} // SubPropertyOf
