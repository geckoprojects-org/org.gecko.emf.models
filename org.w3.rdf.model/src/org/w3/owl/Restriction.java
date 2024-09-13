/**
 */
package org.w3.owl;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.w3.rdfs.RDFResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of property restrictions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.Restriction#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.Restriction#getMaxCardinality <em>Max Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.Restriction#getMaxQualifiedCardinality <em>Max Qualified Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.Restriction#getMinCardinality <em>Min Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.Restriction#getMinQualifiedCardinality <em>Min Qualified Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.Restriction#getQualifiedCardinality <em>Qualified Cardinality</em>}</li>
 *   <li>{@link org.w3.owl.Restriction#getHasSelf <em>Has Self</em>}</li>
 *   <li>{@link org.w3.owl.Restriction#getOnProperites <em>On Properites</em>}</li>
 * </ul>
 *
 * @see org.w3.owl.OwlPackage#getRestriction()
 * @model
 * @generated
 */
public interface Restriction extends org.w3.owl.Class {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(BigInteger)
	 * @see org.w3.owl.OwlPackage#getRestriction_Cardinality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" ordered="false"
	 * @generated
	 */
	BigInteger getCardinality();

	/**
	 * Sets the value of the '{@link org.w3.owl.Restriction#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cardinality</em>' attribute.
	 * @see #setMaxCardinality(BigInteger)
	 * @see org.w3.owl.OwlPackage#getRestriction_MaxCardinality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" ordered="false"
	 * @generated
	 */
	BigInteger getMaxCardinality();

	/**
	 * Sets the value of the '{@link org.w3.owl.Restriction#getMaxCardinality <em>Max Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cardinality</em>' attribute.
	 * @see #getMaxCardinality()
	 * @generated
	 */
	void setMaxCardinality(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Qualified Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Qualified Cardinality</em>' attribute.
	 * @see #setMaxQualifiedCardinality(BigInteger)
	 * @see org.w3.owl.OwlPackage#getRestriction_MaxQualifiedCardinality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" ordered="false"
	 * @generated
	 */
	BigInteger getMaxQualifiedCardinality();

	/**
	 * Sets the value of the '{@link org.w3.owl.Restriction#getMaxQualifiedCardinality <em>Max Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Qualified Cardinality</em>' attribute.
	 * @see #getMaxQualifiedCardinality()
	 * @generated
	 */
	void setMaxQualifiedCardinality(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cardinality</em>' attribute.
	 * @see #setMinCardinality(BigInteger)
	 * @see org.w3.owl.OwlPackage#getRestriction_MinCardinality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" ordered="false"
	 * @generated
	 */
	BigInteger getMinCardinality();

	/**
	 * Sets the value of the '{@link org.w3.owl.Restriction#getMinCardinality <em>Min Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cardinality</em>' attribute.
	 * @see #getMinCardinality()
	 * @generated
	 */
	void setMinCardinality(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Qualified Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Qualified Cardinality</em>' attribute.
	 * @see #setMinQualifiedCardinality(BigInteger)
	 * @see org.w3.owl.OwlPackage#getRestriction_MinQualifiedCardinality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" ordered="false"
	 * @generated
	 */
	BigInteger getMinQualifiedCardinality();

	/**
	 * Sets the value of the '{@link org.w3.owl.Restriction#getMinQualifiedCardinality <em>Min Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Qualified Cardinality</em>' attribute.
	 * @see #getMinQualifiedCardinality()
	 * @generated
	 */
	void setMinQualifiedCardinality(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Cardinality</em>' attribute.
	 * @see #setQualifiedCardinality(BigInteger)
	 * @see org.w3.owl.OwlPackage#getRestriction_QualifiedCardinality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" ordered="false"
	 * @generated
	 */
	BigInteger getQualifiedCardinality();

	/**
	 * Sets the value of the '{@link org.w3.owl.Restriction#getQualifiedCardinality <em>Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Cardinality</em>' attribute.
	 * @see #getQualifiedCardinality()
	 * @generated
	 */
	void setQualifiedCardinality(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Has Self</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Self</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Self</em>' reference.
	 * @see #setHasSelf(RDFResource)
	 * @see org.w3.owl.OwlPackage#getRestriction_HasSelf()
	 * @model
	 * @generated
	 */
	RDFResource getHasSelf();

	/**
	 * Sets the value of the '{@link org.w3.owl.Restriction#getHasSelf <em>Has Self</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Self</em>' reference.
	 * @see #getHasSelf()
	 * @generated
	 */
	void setHasSelf(RDFResource value);

	/**
	 * Returns the value of the '<em><b>On Properites</b></em>' reference list.
	 * The list contents are of type {@link org.w3.rdfs.RDFResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Properites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Properites</em>' reference list.
	 * @see org.w3.owl.OwlPackage#getRestriction_OnProperites()
	 * @model
	 * @generated
	 */
	EList<RDFResource> getOnProperites();

} // Restriction
