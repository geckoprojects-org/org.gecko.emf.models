/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staat Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Staat leitet sich von der entsprechenden XÖV-Kernkomponente ab. Als Staat bezeichnet man eine politische Ordnung, die ein gemeinsames als Staatsgebiet abgegrenztes Territorium, ein dazugehöriges Staatsvolk und eine Machtausübung über dieses umfasst.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.StaatType#getStaat <em>Staat</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getStaatType()
 * @model extendedMetaData="name='StaatType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaatType extends EObject {
	/**
	 * Returns the value of the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Staat enthält einen Schlüssel zur Identifikation eines Staates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staat</em>' containment reference.
	 * @see #setStaat(StaatCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getStaatType_Staat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Staat' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatCodeType getStaat();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.StaatType#getStaat <em>Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staat</em>' containment reference.
	 * @see #getStaat()
	 * @generated
	 */
	void setStaat(StaatCodeType value);

} // StaatType
