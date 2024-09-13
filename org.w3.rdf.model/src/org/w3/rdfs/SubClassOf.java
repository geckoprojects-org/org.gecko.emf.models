/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Class Of</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The subject is a subclass of a class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.SubClassOf#getRdfClass <em>Rdf Class</em>}</li>
 *   <li>{@link org.w3.rdfs.SubClassOf#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getSubClassOf()
 * @model
 * @generated
 */
public interface SubClassOf extends EObject {
	/**
	 * Returns the value of the '<em><b>Rdf Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFClass#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Class</em>' reference.
	 * @see #setRdfClass(RDFClass)
	 * @see org.w3.rdfs.RdfsPackage#getSubClassOf_RdfClass()
	 * @see org.w3.rdfs.RDFClass#getSubClassOf
	 * @model opposite="subClassOf" required="true" ordered="false"
	 * @generated
	 */
	RDFClass getRdfClass();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SubClassOf#getRdfClass <em>Rdf Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Class</em>' reference.
	 * @see #getRdfClass()
	 * @generated
	 */
	void setRdfClass(RDFClass value);

	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference.
	 * @see #setSubClassOf(RDFClass)
	 * @see org.w3.rdfs.RdfsPackage#getSubClassOf_SubClassOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFClass getSubClassOf();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SubClassOf#getSubClassOf <em>Sub Class Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class Of</em>' reference.
	 * @see #getSubClassOf()
	 * @generated
	 */
	void setSubClassOf(RDFClass value);

} // SubClassOf
