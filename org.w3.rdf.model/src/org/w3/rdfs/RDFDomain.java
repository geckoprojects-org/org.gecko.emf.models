/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;
import org.w3.rdf.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A domain of the subject property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.RDFDomain#getProperty <em>Property</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFDomain#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getRDFDomain()
 * @model
 * @generated
 */
public interface RDFDomain extends EObject {
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
	 * @see org.w3.rdfs.RdfsPackage#getRDFDomain_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFProperty getProperty();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFDomain#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(RDFProperty value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(RDFClass)
	 * @see org.w3.rdfs.RdfsPackage#getRDFDomain_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFClass getDomain();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFDomain#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(RDFClass value);

} // RDFDomain
