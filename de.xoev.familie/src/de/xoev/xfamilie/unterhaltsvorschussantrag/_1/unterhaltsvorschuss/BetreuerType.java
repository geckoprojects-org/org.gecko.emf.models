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

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Betreuer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Betreuer. Der Betreuer ist eine Art von Vertretung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getEMailAdresse <em>EMail Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getTelefonnummer <em>Telefonnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getBestallungsurkunde <em>Bestallungsurkunde</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBetreuerType()
 * @model extendedMetaData="name='BetreuerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BetreuerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Betreuers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBetreuerType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Anschrift des Betreuers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBetreuerType_Anschrift()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>EMail Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum E-Mail Kontakt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EMail Adresse</em>' attribute.
	 * @see #setEMailAdresse(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBetreuerType_EMailAdresse()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='eMailAdresse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEMailAdresse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getEMailAdresse <em>EMail Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail Adresse</em>' attribute.
	 * @see #getEMailAdresse()
	 * @generated
	 */
	void setEMailAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Aktenzeichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #setAktenzeichen(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBetreuerType_Aktenzeichen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aktenzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getAktenzeichen <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #getAktenzeichen()
	 * @generated
	 */
	void setAktenzeichen(String value);

	/**
	 * Returns the value of the '<em><b>Telefonnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Telefon Kontakt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telefonnummer</em>' attribute.
	 * @see #setTelefonnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBetreuerType_Telefonnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='telefonnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTelefonnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType#getTelefonnummer <em>Telefonnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefonnummer</em>' attribute.
	 * @see #getTelefonnummer()
	 * @generated
	 */
	void setTelefonnummer(String value);

	/**
	 * Returns the value of the '<em><b>Bestallungsurkunde</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bestallungsurkunde</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBetreuerType_Bestallungsurkunde()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='bestallungsurkunde' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getBestallungsurkunde();

} // BetreuerType
