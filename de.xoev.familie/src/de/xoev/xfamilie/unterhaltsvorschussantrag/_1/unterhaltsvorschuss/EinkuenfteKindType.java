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

import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkuenfte Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu Einkünften des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getZeitraum <em>Zeitraum</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteKindType()
 * @model extendedMetaData="name='Einkuenfte.KindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkuenfteKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Einkünfte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeEinkuenfteKindType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteKindType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeEinkuenfteKindType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeEinkuenfteKindType value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteKindType_Nachweis()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNachweis();

	/**
	 * Returns the value of the '<em><b>Betrag Der Einkuenfte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten für den jeweiligen Betrag der Einkünfte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betrag Der Einkuenfte</em>' attribute.
	 * @see #setBetragDerEinkuenfte(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteKindType_BetragDerEinkuenfte()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='betragDerEinkuenfte' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetragDerEinkuenfte();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betrag Der Einkuenfte</em>' attribute.
	 * @see #getBetragDerEinkuenfte()
	 * @generated
	 */
	void setBetragDerEinkuenfte(String value);

	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Zeitraum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getEinkuenfteKindType_Zeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraum();

} // EinkuenfteKindType
