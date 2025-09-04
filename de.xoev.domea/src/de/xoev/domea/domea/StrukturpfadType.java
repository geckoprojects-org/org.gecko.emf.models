/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strukturpfad Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe des Pfades im System zu einem Schriftgutobjekt, um insbesondere zusätzliche interne Strukturebenen über die 5-stufige Strukturierung mit (Teil-)Akte und (Teil-)Vorgang hinaus darstellen zu können (Beispiele: Register, Segment, Ordner). Das Objekt, dessen Pfad betrachtet wird, ist nicht selbst Teil des Pfades. Das erste Pfadelement entspricht dem obersten Element in der Struktur - meist die Akte. Die weiteren Elemente folgen hierarchisch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.StrukturpfadType#getPfadelement <em>Pfadelement</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getStrukturpfadType()
 * @model extendedMetaData="name='StrukturpfadType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StrukturpfadType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pfadelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pfadelement eines Strukturpfads.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pfadelement</em>' containment reference.
	 * @see #setPfadelement(PfadelementType)
	 * @see de.xoev.domea.domea.DomeaPackage#getStrukturpfadType_Pfadelement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pfadelement' namespace='##targetNamespace'"
	 * @generated
	 */
	PfadelementType getPfadelement();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.StrukturpfadType#getPfadelement <em>Pfadelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfadelement</em>' containment reference.
	 * @see #getPfadelement()
	 * @generated
	 */
	void setPfadelement(PfadelementType value);

} // StrukturpfadType
