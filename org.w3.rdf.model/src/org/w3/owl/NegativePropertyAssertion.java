/**
 */
package org.w3.owl;

import org.w3.rdf.RDFProperty;
import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Property Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of negative property assertions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.NegativePropertyAssertion#getSourceIndividual <em>Source Individual</em>}</li>
 *   <li>{@link org.w3.owl.NegativePropertyAssertion#getTargetIndividual <em>Target Individual</em>}</li>
 *   <li>{@link org.w3.owl.NegativePropertyAssertion#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link org.w3.owl.NegativePropertyAssertion#getAssertionProperty <em>Assertion Property</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getNegativePropertyAssertion()
 * @model
 * @generated
 */
public interface NegativePropertyAssertion extends RDFResource {
	/**
	 * Returns the value of the '<em><b>Source Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Individual</em>' reference.
	 * @see #setSourceIndividual(Thing)
	 * @see org.w3.owl.OwlPackage#getNegativePropertyAssertion_SourceIndividual()
	 * @model ordered="false"
	 * @generated
	 */
	Thing getSourceIndividual();

	/**
	 * Sets the value of the '{@link org.w3.owl.NegativePropertyAssertion#getSourceIndividual <em>Source Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Individual</em>' reference.
	 * @see #getSourceIndividual()
	 * @generated
	 */
	void setSourceIndividual(Thing value);

	/**
	 * Returns the value of the '<em><b>Target Individual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Individual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Individual</em>' reference.
	 * @see #setTargetIndividual(Thing)
	 * @see org.w3.owl.OwlPackage#getNegativePropertyAssertion_TargetIndividual()
	 * @model ordered="false"
	 * @generated
	 */
	Thing getTargetIndividual();

	/**
	 * Sets the value of the '{@link org.w3.owl.NegativePropertyAssertion#getTargetIndividual <em>Target Individual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Individual</em>' reference.
	 * @see #getTargetIndividual()
	 * @generated
	 */
	void setTargetIndividual(Thing value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' reference.
	 * @see #setTargetValue(Datatype)
	 * @see org.w3.owl.OwlPackage#getNegativePropertyAssertion_TargetValue()
	 * @model
	 * @generated
	 */
	Datatype getTargetValue();

	/**
	 * Sets the value of the '{@link org.w3.owl.NegativePropertyAssertion#getTargetValue <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(Datatype value);

	/**
	 * Returns the value of the '<em><b>Assertion Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertion Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion Property</em>' reference.
	 * @see #setAssertionProperty(RDFProperty)
	 * @see org.w3.owl.OwlPackage#getNegativePropertyAssertion_AssertionProperty()
	 * @model
	 * @generated
	 */
	RDFProperty getAssertionProperty();

	/**
	 * Sets the value of the '{@link org.w3.owl.NegativePropertyAssertion#getAssertionProperty <em>Assertion Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion Property</em>' reference.
	 * @see #getAssertionProperty()
	 * @generated
	 */
	void setAssertionProperty(RDFProperty value);

} // NegativePropertyAssertion
