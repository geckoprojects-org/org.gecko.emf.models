/**
 */
package org.w3.rdfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A human-readable name for the subject.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.RDFLabel#getResource <em>Resource</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFLabel#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getRDFLabel()
 * @model
 * @generated
 */
public interface RDFLabel extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFResource#getRdfLabel <em>Rdf Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(RDFResource)
	 * @see org.w3.rdfs.RdfsPackage#getRDFLabel_Resource()
	 * @see org.w3.rdfs.RDFResource#getRdfLabel
	 * @model opposite="rdfLabel" required="true" transient="false" ordered="false"
	 * @generated
	 */
	RDFResource getResource();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFLabel#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(RDFResource value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(RDFLiteral)
	 * @see org.w3.rdfs.RdfsPackage#getRDFLabel_Label()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RDFLiteral getLabel();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFLabel#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(RDFLiteral value);

} // RDFLabel
