/**
 */
package org.w3.owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.w3.rdfs.RDFDatatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of object properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.ObjectProperty#getPropertyChainAxiom <em>Property Chain Axiom</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getObjectProperty()
 * @model
 * @generated
 */
public interface ObjectProperty extends RDFDatatype {
	/**
	 * Returns the value of the '<em><b>Property Chain Axiom</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ObjectNodeOrderingKind}.
	 * The literals are from the enumeration {@link org.eclipse.uml2.uml.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Chain Axiom</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Chain Axiom</em>' attribute list.
	 * @see org.eclipse.uml2.uml.ObjectNodeOrderingKind
	 * @see org.w3.owl.OwlPackage#getObjectProperty_PropertyChainAxiom()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ObjectNodeOrderingKind> getPropertyChainAxiom();

} // ObjectProperty
