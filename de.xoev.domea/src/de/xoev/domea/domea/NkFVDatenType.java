/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nk FV Daten Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Kopf der Nachricht enthält allgemeine Informationen zu Nachrichten im Rahmen eines Austauschs von Fachverfahrensdaten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.NkFVDatenType#getEmpfangendesSystem <em>Empfangendes System</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getNkFVDatenType()
 * @model extendedMetaData="name='NkFVDatenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NkFVDatenType extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Empfangendes System</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.SystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Informationen zu dem System, das die Daten erhalten soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Empfangendes System</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getNkFVDatenType_EmpfangendesSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmpfangendesSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SystemType> getEmpfangendesSystem();

} // NkFVDatenType
