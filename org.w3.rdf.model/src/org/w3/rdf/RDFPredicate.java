/**
 */
package org.w3.rdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The predicate of the subject RDF statement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdf.RDFPredicate#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.w3.rdf.RdfPackage#getRDFPredicate()
 * @model
 * @generated
 */
public interface RDFPredicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFStatement#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(RDFStatement)
	 * @see org.w3.rdf.RdfPackage#getRDFPredicate_Statement()
	 * @see org.w3.rdf.RDFStatement#getPredicate
	 * @model opposite="predicate" required="true" ordered="false"
	 * @generated
	 */
	RDFStatement getStatement();

	/**
	 * Sets the value of the '{@link org.w3.rdf.RDFPredicate#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(RDFStatement value);

} // RDFPredicate
