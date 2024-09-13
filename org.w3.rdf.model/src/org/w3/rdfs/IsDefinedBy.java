/**
 */
package org.w3.rdfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Defined By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of the subject resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.IsDefinedBy#getIsDefinedBy <em>Is Defined By</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getIsDefinedBy()
 * @model
 * @generated
 */
public interface IsDefinedBy extends SeeAlso {
	/**
	 * Returns the value of the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Defined By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Defined By</em>' reference.
	 * @see #setIsDefinedBy(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getIsDefinedBy_IsDefinedBy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RDFResource getIsDefinedBy();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.IsDefinedBy#getIsDefinedBy <em>Is Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defined By</em>' reference.
	 * @see #getIsDefinedBy()
	 * @generated
	 */
	void setIsDefinedBy(RDFResource value);

} // IsDefinedBy
