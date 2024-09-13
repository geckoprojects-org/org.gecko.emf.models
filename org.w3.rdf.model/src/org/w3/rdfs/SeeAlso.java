/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>See Also</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Further information about the subject resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.SeeAlso#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3.rdfs.SeeAlso#getSeeAlso <em>See Also</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getSeeAlso()
 * @model
 * @generated
 */
public interface SeeAlso extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFResource#getSeeAlso <em>See Also</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getSeeAlso_Resource()
	 * @see org.w3.rdfs.RDFResource#getSeeAlso
	 * @model opposite="seeAlso" required="true" ordered="false"
	 * @generated
	 */
	RDFResource getResource();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SeeAlso#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(RDFResource value);

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>See Also</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See Also</em>' reference.
	 * @see #setSeeAlso(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getSeeAlso_SeeAlso()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFResource getSeeAlso();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.SeeAlso#getSeeAlso <em>See Also</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See Also</em>' reference.
	 * @see #getSeeAlso()
	 * @generated
	 */
	void setSeeAlso(RDFResource value);

} // SeeAlso
