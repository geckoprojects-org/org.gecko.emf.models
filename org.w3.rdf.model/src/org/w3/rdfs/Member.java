/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A member of the subject resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.Member#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3.rdfs.Member#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFResource#getRdfMembers <em>Rdf Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getMember_Resource()
	 * @see org.w3.rdfs.RDFResource#getRdfMembers
	 * @model opposite="rdfMembers" required="true" ordered="false"
	 * @generated
	 */
	RDFResource getResource();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.Member#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(RDFResource value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getMember_Member()
	 * @model ordered="false"
	 * @generated
	 */
	RDFResource getMember();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.Member#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(RDFResource value);

} // Member
