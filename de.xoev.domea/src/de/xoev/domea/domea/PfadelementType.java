/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pfadelement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pfadelement eines Strukturpfads.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.PfadelementType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PfadelementType#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.xoev.domea.domea.PfadelementType#getPfadelement <em>Pfadelement</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getPfadelementType()
 * @model extendedMetaData="name='PfadelementType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PfadelementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Pfadelements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getPfadelementType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PfadelementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des Pfadelements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typ</em>' containment reference.
	 * @see #setTyp(StrukturelementTypCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getPfadelementType_Typ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Typ' namespace='##targetNamespace'"
	 * @generated
	 */
	StrukturelementTypCodeType getTyp();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PfadelementType#getTyp <em>Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' containment reference.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(StrukturelementTypCodeType value);

	/**
	 * Returns the value of the '<em><b>Pfadelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das nächsttiefere Pfadelement eines Strukturpfads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pfadelement</em>' containment reference.
	 * @see #setPfadelement(PfadelementType)
	 * @see de.xoev.domea.domea.DomeaPackage#getPfadelementType_Pfadelement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pfadelement' namespace='##targetNamespace'"
	 * @generated
	 */
	PfadelementType getPfadelement();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.PfadelementType#getPfadelement <em>Pfadelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfadelement</em>' containment reference.
	 * @see #getPfadelement()
	 * @generated
	 */
	void setPfadelement(PfadelementType value);

} // PfadelementType
