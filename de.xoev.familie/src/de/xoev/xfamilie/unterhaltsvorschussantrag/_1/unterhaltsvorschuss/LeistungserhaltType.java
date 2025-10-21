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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungserhaltType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leistungserhalt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu sonstigen Leistungen (z.B. SGB-II-Bezug).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLeistungserhaltType()
 * @model extendedMetaData="name='LeistungserhaltType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LeistungserhaltType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der sonstigen Leistung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeLeistungserhaltType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLeistungserhaltType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeLeistungserhaltType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LeistungserhaltType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeLeistungserhaltType value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLeistungserhaltType_Nachweis()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNachweis();

} // LeistungserhaltType
