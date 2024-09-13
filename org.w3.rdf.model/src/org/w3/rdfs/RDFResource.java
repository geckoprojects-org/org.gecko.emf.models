/**
 */
package org.w3.rdfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.w3.rdf.RDFType;
import org.w3.rdf.RDFValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDF Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class provides a proxy for the class of RDF resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.rdfs.RDFResource#getRdfComment <em>Rdf Comment</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFResource#getIsDefinedBy <em>Is Defined By</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFResource#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFResource#getRdfMembers <em>Rdf Members</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFResource#getRdfLabel <em>Rdf Label</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFResource#getRdfType <em>Rdf Type</em>}</li>
 *   <li>{@link org.w3.rdfs.RDFResource#getRdfValue <em>Rdf Value</em>}</li>
 * </ul>
 *
 * @see org.w3.rdfs.RdfsPackage#getRDFResource()
 * @model
 * @generated
 */
public interface RDFResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Rdf Comment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFComment#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Comment</em>' containment reference.
	 * @see #setRdfComment(RDFComment)
	 * @see org.w3.rdfs.RdfsPackage#getRDFResource_RdfComment()
	 * @see org.w3.rdfs.RDFComment#getResource
	 * @model opposite="resource" containment="true" required="true" ordered="false"
	 * @generated
	 */
	RDFComment getRdfComment();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFResource#getRdfComment <em>Rdf Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Comment</em>' containment reference.
	 * @see #getRdfComment()
	 * @generated
	 */
	void setRdfComment(RDFComment value);

	/**
	 * Returns the value of the '<em><b>Is Defined By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Defined By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Defined By</em>' reference.
	 * @see #setIsDefinedBy(IsDefinedBy)
	 * @see org.w3.rdfs.RdfsPackage#getRDFResource_IsDefinedBy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IsDefinedBy getIsDefinedBy();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFResource#getIsDefinedBy <em>Is Defined By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Defined By</em>' reference.
	 * @see #getIsDefinedBy()
	 * @generated
	 */
	void setIsDefinedBy(IsDefinedBy value);

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.SeeAlso#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>See Also</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See Also</em>' reference.
	 * @see #setSeeAlso(SeeAlso)
	 * @see org.w3.rdfs.RdfsPackage#getRDFResource_SeeAlso()
	 * @see org.w3.rdfs.SeeAlso#getResource
	 * @model opposite="resource" required="true" ordered="false"
	 * @generated
	 */
	SeeAlso getSeeAlso();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFResource#getSeeAlso <em>See Also</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See Also</em>' reference.
	 * @see #getSeeAlso()
	 * @generated
	 */
	void setSeeAlso(SeeAlso value);

	/**
	 * Returns the value of the '<em><b>Rdf Members</b></em>' reference list.
	 * The list contents are of type {@link org.w3.rdfs.Member}.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.Member#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Members</em>' reference list.
	 * @see org.w3.rdfs.RdfsPackage#getRDFResource_RdfMembers()
	 * @see org.w3.rdfs.Member#getResource
	 * @model opposite="resource" ordered="false"
	 * @generated
	 */
	EList<Member> getRdfMembers();

	/**
	 * Returns the value of the '<em><b>Rdf Label</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdfs.RDFLabel#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Label</em>' containment reference.
	 * @see #setRdfLabel(RDFLabel)
	 * @see org.w3.rdfs.RdfsPackage#getRDFResource_RdfLabel()
	 * @see org.w3.rdfs.RDFLabel#getResource
	 * @model opposite="resource" containment="true" required="true" ordered="false"
	 * @generated
	 */
	RDFLabel getRdfLabel();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFResource#getRdfLabel <em>Rdf Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Label</em>' containment reference.
	 * @see #getRdfLabel()
	 * @generated
	 */
	void setRdfLabel(RDFLabel value);

	/**
	 * Returns the value of the '<em><b>Rdf Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.w3.rdf.RDFType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Type</em>' reference.
	 * @see #setRdfType(RDFType)
	 * @see org.w3.rdfs.RdfsPackage#getRDFResource_RdfType()
	 * @see org.w3.rdf.RDFType#getResource
	 * @model opposite="resource" required="true" ordered="false"
	 * @generated
	 */
	RDFType getRdfType();

	/**
	 * Sets the value of the '{@link org.w3.rdfs.RDFResource#getRdfType <em>Rdf Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Type</em>' reference.
	 * @see #getRdfType()
	 * @generated
	 */
	void setRdfType(RDFType value);

	/**
	 * Returns the value of the '<em><b>Rdf Value</b></em>' reference list.
	 * The list contents are of type {@link org.w3.rdf.RDFValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdf Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Value</em>' reference list.
	 * @see org.w3.rdfs.RdfsPackage#getRDFResource_RdfValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RDFValue> getRdfValue();

} // RDFResource
