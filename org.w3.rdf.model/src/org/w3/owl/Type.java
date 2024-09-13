/**
 */
package org.w3.owl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The abstract Type class is used to help aggregate things that have either class or data values in OWL 2, to limit extraneous duplication of language in the profile.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.Type#getDisjointUnionOf <em>Disjoint Union Of</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Disjoint Union Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Union Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Union Of</em>' reference.
	 * @see #setDisjointUnionOf(Type)
	 * @see org.w3.owl.OwlPackage#getType_DisjointUnionOf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Type getDisjointUnionOf();

	/**
	 * Sets the value of the '{@link org.w3.owl.Type#getDisjointUnionOf <em>Disjoint Union Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoint Union Of</em>' reference.
	 * @see #getDisjointUnionOf()
	 * @generated
	 */
	void setDisjointUnionOf(Type value);

} // Type
