/**
 */
package org.w3.rdf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The rest of the subject RDF list after the first item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.Rest#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRest()
 * @model
 * @generated
 */
public interface Rest extends RDFList {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFList#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(RDFList)
	 * @see org.w3.rdf.RdfPackage#getRest_Parent()
	 * @see org.w3.rdf.RDFList#getRest
	 * @model opposite="rest" required="true" ordered="false"
	 * @generated
	 */
	RDFList getParent();

	/**
	 * Sets the value of the '{@link org.w3.rdf.Rest#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RDFList value);

} // Rest
