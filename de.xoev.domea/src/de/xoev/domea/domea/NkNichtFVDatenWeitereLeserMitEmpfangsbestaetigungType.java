/*
 */
package de.xoev.domea.domea;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Kopf der Nachricht enthält allgemeine Informationen für den Leser einer Nachricht, bei der es sich nicht um eine Empfangs-/Importnachricht auf eine andere Nachricht handelt, die mehrere Leser besitzen kann und mit der eine Empfangsbestätigung angefordert werden kann.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung <em>Empfangsbestaetigung</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType()
 * @model extendedMetaData="name='NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType extends NkNichtFVDatenWeitereLeserType {
	/**
	 * Returns the value of the '<em><b>Empfangsbestaetigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Angabe, ob vom Leser der Nachricht eine Empfangsbestätigung angefordert wird. Eine angeforderte Empfangsbestätigung wird mit "1" gekennzeichnet. Wird keine Empfangsbestätigung angefordert, so wird dies mit "0" gekennzeichnet. Der Leser ist bei angeforderter Empfangsbestätigung aber nicht verpflichtet, eine Empfangsbestätigung zu versenden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Empfangsbestaetigung</em>' attribute.
	 * @see #isSetEmpfangsbestaetigung()
	 * @see #unsetEmpfangsbestaetigung()
	 * @see #setEmpfangsbestaetigung(boolean)
	 * @see de.xoev.domea.domea.DomeaPackage#getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Empfangsbestaetigung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEmpfangsbestaetigung();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung <em>Empfangsbestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empfangsbestaetigung</em>' attribute.
	 * @see #isSetEmpfangsbestaetigung()
	 * @see #unsetEmpfangsbestaetigung()
	 * @see #isEmpfangsbestaetigung()
	 * @generated
	 */
	void setEmpfangsbestaetigung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung <em>Empfangsbestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmpfangsbestaetigung()
	 * @see #isEmpfangsbestaetigung()
	 * @see #setEmpfangsbestaetigung(boolean)
	 * @generated
	 */
	void unsetEmpfangsbestaetigung();

	/**
	 * Returns whether the value of the '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung <em>Empfangsbestaetigung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Empfangsbestaetigung</em>' attribute is set.
	 * @see #unsetEmpfangsbestaetigung()
	 * @see #isEmpfangsbestaetigung()
	 * @see #setEmpfangsbestaetigung(boolean)
	 * @generated
	 */
	boolean isSetEmpfangsbestaetigung();

} // NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType
