/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hash Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Informationen zum Überprüfen eventuell nicht dokumentierter oder nicht berechtigter Änderungen am Objekt. Diese Angaben werden durch das Speichersystem automatisch berechnet und aufgezeichnet. Durch den Abgleich des Hash-Wertes bei der Übernahme in das empfangende System kann sichergestellt werden, dass empfangene und gesendete Dateien identisch sind. Es ist entweder das Element Algorithmus oder das Element SonstigerAlgorithmus zu befüllen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.HashType#getWert <em>Wert</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HashType#getAlgorithmus <em>Algorithmus</em>}</li>
 *   <li>{@link de.xoev.domea.domea.HashType#getSonstigerAlgorithmus <em>Sonstiger Algorithmus</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getHashType()
 * @model extendedMetaData="name='HashType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HashType extends EObject {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Hash-Wertes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHashType_Wert()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Wert' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HashType#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

	/**
	 * Returns the value of the '<em><b>Algorithmus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des zur Berechnung des Hash-Wertes verwendeten Algorithmus als Code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithmus</em>' containment reference.
	 * @see #setAlgorithmus(KryptographischeAlgorithmenCodeType)
	 * @see de.xoev.domea.domea.DomeaPackage#getHashType_Algorithmus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Algorithmus' namespace='##targetNamespace'"
	 * @generated
	 */
	KryptographischeAlgorithmenCodeType getAlgorithmus();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HashType#getAlgorithmus <em>Algorithmus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithmus</em>' containment reference.
	 * @see #getAlgorithmus()
	 * @generated
	 */
	void setAlgorithmus(KryptographischeAlgorithmenCodeType value);

	/**
	 * Returns the value of the '<em><b>Sonstiger Algorithmus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der sonstige Algorithmus als Text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstiger Algorithmus</em>' attribute.
	 * @see #setSonstigerAlgorithmus(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getHashType_SonstigerAlgorithmus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SonstigerAlgorithmus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSonstigerAlgorithmus();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.HashType#getSonstigerAlgorithmus <em>Sonstiger Algorithmus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstiger Algorithmus</em>' attribute.
	 * @see #getSonstigerAlgorithmus()
	 * @generated
	 */
	void setSonstigerAlgorithmus(String value);

} // HashType
