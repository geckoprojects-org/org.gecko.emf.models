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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beistand Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum Beistand. Der Beistand ist eine Art von Vertretung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAnschriftJugendamt <em>Anschrift Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getJugendamtEMail <em>Jugendamt EMail</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getTelefonnummer <em>Telefonnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBeistandType()
 * @model extendedMetaData="name='BeistandType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BeistandType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Beistands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBeistandType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Anschrift Jugendamt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Anschrift des Jugendamtes, dessen Teil der Beistand ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Jugendamt</em>' containment reference.
	 * @see #setAnschriftJugendamt(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBeistandType_AnschriftJugendamt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftJugendamt' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAnschriftJugendamt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAnschriftJugendamt <em>Anschrift Jugendamt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Jugendamt</em>' containment reference.
	 * @see #getAnschriftJugendamt()
	 * @generated
	 */
	void setAnschriftJugendamt(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Jugendamt EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum E-Mail Kontakt des Jugendamts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jugendamt EMail</em>' attribute.
	 * @see #setJugendamtEMail(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBeistandType_JugendamtEMail()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='jugendamtEMail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJugendamtEMail();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getJugendamtEMail <em>Jugendamt EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jugendamt EMail</em>' attribute.
	 * @see #getJugendamtEMail()
	 * @generated
	 */
	void setJugendamtEMail(String value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Aktenzeichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #setAktenzeichen(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBeistandType_Aktenzeichen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='aktenzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getAktenzeichen <em>Aktenzeichen</em>}' attribute.
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
	 * Daten zum Telefon Kontakt des Jugendamts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telefonnummer</em>' attribute.
	 * @see #setTelefonnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBeistandType_Telefonnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='telefonnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTelefonnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#getTelefonnummer <em>Telefonnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefonnummer</em>' attribute.
	 * @see #getTelefonnummer()
	 * @generated
	 */
	void setTelefonnummer(String value);

	/**
	 * Returns the value of the '<em><b>Beauftragt Geltungsmachung UVanspruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zur Beauftragung der Geltungsmachung von Unterhaltsansprüchen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beauftragt Geltungsmachung UVanspruch</em>' attribute.
	 * @see #isSetBeauftragtGeltungsmachungUVanspruch()
	 * @see #unsetBeauftragtGeltungsmachungUVanspruch()
	 * @see #setBeauftragtGeltungsmachungUVanspruch(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getBeistandType_BeauftragtGeltungsmachungUVanspruch()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='beauftragtGeltungsmachungUVanspruch' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBeauftragtGeltungsmachungUVanspruch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beauftragt Geltungsmachung UVanspruch</em>' attribute.
	 * @see #isSetBeauftragtGeltungsmachungUVanspruch()
	 * @see #unsetBeauftragtGeltungsmachungUVanspruch()
	 * @see #isBeauftragtGeltungsmachungUVanspruch()
	 * @generated
	 */
	void setBeauftragtGeltungsmachungUVanspruch(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBeauftragtGeltungsmachungUVanspruch()
	 * @see #isBeauftragtGeltungsmachungUVanspruch()
	 * @see #setBeauftragtGeltungsmachungUVanspruch(boolean)
	 * @generated
	 */
	void unsetBeauftragtGeltungsmachungUVanspruch();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Beauftragt Geltungsmachung UVanspruch</em>' attribute is set.
	 * @see #unsetBeauftragtGeltungsmachungUVanspruch()
	 * @see #isBeauftragtGeltungsmachungUVanspruch()
	 * @see #setBeauftragtGeltungsmachungUVanspruch(boolean)
	 * @generated
	 */
	boolean isSetBeauftragtGeltungsmachungUVanspruch();

} // BeistandType
