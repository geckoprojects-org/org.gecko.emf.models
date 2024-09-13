/**
 */
package org.w3.owl;

import org.eclipse.emf.common.util.EList;
import org.w3.rdf.RDFProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of OWL classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.Class#getHasKey <em>Has Key</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Has Key</b></em>' reference list.
	 * The list contents are of type {@link org.w3.rdf.RDFProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key</em>' reference list.
	 * @see org.w3.owl.OwlPackage#getClass_HasKey()
	 * @model
	 * @generated
	 */
	EList<RDFProperty> getHasKey();

} // Class
