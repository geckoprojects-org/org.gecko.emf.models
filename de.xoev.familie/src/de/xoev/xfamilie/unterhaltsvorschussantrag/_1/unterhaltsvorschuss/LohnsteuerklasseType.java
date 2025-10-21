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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lohnsteuerklasse Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Lohnsteuerklasse.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#isLohnsteuerklasseVeranlagung <em>Lohnsteuerklasse Veranlagung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLohnsteuerklasseType()
 * @model extendedMetaData="name='LohnsteuerklasseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LohnsteuerklasseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lohnsteuerklasse Veranlagung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sind Sie zur Lohnsteuer veranlagt?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lohnsteuerklasse Veranlagung</em>' attribute.
	 * @see #isSetLohnsteuerklasseVeranlagung()
	 * @see #unsetLohnsteuerklasseVeranlagung()
	 * @see #setLohnsteuerklasseVeranlagung(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLohnsteuerklasseType_LohnsteuerklasseVeranlagung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='lohnsteuerklasseVeranlagung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLohnsteuerklasseVeranlagung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#isLohnsteuerklasseVeranlagung <em>Lohnsteuerklasse Veranlagung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lohnsteuerklasse Veranlagung</em>' attribute.
	 * @see #isSetLohnsteuerklasseVeranlagung()
	 * @see #unsetLohnsteuerklasseVeranlagung()
	 * @see #isLohnsteuerklasseVeranlagung()
	 * @generated
	 */
	void setLohnsteuerklasseVeranlagung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#isLohnsteuerklasseVeranlagung <em>Lohnsteuerklasse Veranlagung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLohnsteuerklasseVeranlagung()
	 * @see #isLohnsteuerklasseVeranlagung()
	 * @see #setLohnsteuerklasseVeranlagung(boolean)
	 * @generated
	 */
	void unsetLohnsteuerklasseVeranlagung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#isLohnsteuerklasseVeranlagung <em>Lohnsteuerklasse Veranlagung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lohnsteuerklasse Veranlagung</em>' attribute is set.
	 * @see #unsetLohnsteuerklasseVeranlagung()
	 * @see #isLohnsteuerklasseVeranlagung()
	 * @see #setLohnsteuerklasseVeranlagung(boolean)
	 * @generated
	 */
	boolean isSetLohnsteuerklasseVeranlagung();

	/**
	 * Returns the value of the '<em><b>Lohnsteuerklasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Falls die Frage mit "Ja" beantwortet wurde, erfolgt die Abfrage "Bitte kreuzen Sie an, welche Steuerklasse besteht." mit den Antwortmöglichkeiten der Zahlen "1-6".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lohnsteuerklasse</em>' containment reference.
	 * @see #setLohnsteuerklasse(CodeSteuerklasseType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLohnsteuerklasseType_Lohnsteuerklasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lohnsteuerklasse' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSteuerklasseType getLohnsteuerklasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lohnsteuerklasse</em>' containment reference.
	 * @see #getLohnsteuerklasse()
	 * @generated
	 */
	void setLohnsteuerklasse(CodeSteuerklasseType value);

} // LohnsteuerklasseType
