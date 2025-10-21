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
package de.xoev.xfamilie.baukasten._1.baukasten;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erreichbarkeit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * "Kommunikation" fasst Angaben zur Erreichbarkeit über elektronische Kommunikationskanäle (z.B. Telefon, Fax, E-Mail) zusammen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKanal <em>Kanal</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKennung <em>Kennung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getZusatz <em>Zusatz</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getErreichbarkeitType()
 * @model extendedMetaData="name='ErreichbarkeitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ErreichbarkeitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der "kanal" gibt an, über welchen Kommunikationskanal eine Erreichbarkeit besteht. Beispiele: Telefon, Fax, E-Mail
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kanal</em>' containment reference.
	 * @see #setKanal(CodeErreichbarkeitType)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getErreichbarkeitType_Kanal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kanal' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeErreichbarkeitType getKanal();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKanal <em>Kanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kanal</em>' containment reference.
	 * @see #getKanal()
	 * @generated
	 */
	void setKanal(CodeErreichbarkeitType value);

	/**
	 * Returns the value of the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die "kennung" beinhaltet die konkreten Angaben zur Erreichbarkeit über einen Kommunikationskanal, d.h. die Telefonnummer, Faxnummer, E-Mail-Adresse oder dergleichen. Die Kennung soll strukturiert erfasst werden. Anmerkung: Die Erfassung von Telefonnummern oder Faxnummern kann nach der Gliederungsvorschrift von DIN 5008 oder E.123 der internationalen Fernmeldeunion erfolgen. Als allgemeine Gliederungsvorschrift gilt nach DIN 5008 die Trennung von Ländervorwahl, Ortskennzahl und Teilnehmernummer durch ein Leerzeichen und die Abtrennung der Durchwahl durch einen Bindestrich. Nach E.123 werden Ländervorwahl, Ortskennzahl und Teilnehmernummer ebenfalls durch Leerzeichen getrennt, bei nationalen Rufnummern wird die Ortskennzahl als vernachlässigbarer Teil zusätzlich in Klammern gesetzt. Eine E-Mail-Adresse wird aufgeteilt in einen local-part und einen domain-part, die durch @(at)-Zeichen getrennt werden. Die zulässigen Zeichen für den local part definiert RFC 2822, für den domain-part gelten die Syntaxregeln des Domain Name Systems. Beispiele: +49 30 12345-67 (internationale Rufnummer nach DIN 5008) 030 12345-67 ( nationale Rufnummern nach DIN 5008) +49 89 1234567 (internationale Rufnummer nach E.123) (089) 123456) (nationale Rufnummer nach E.123) tel:+49-30-1234567 (Uniform Resource Identifier nach RFC 3966)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennung</em>' attribute.
	 * @see #setKennung(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getErreichbarkeitType_Kennung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='kennung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKennung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKennung <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennung</em>' attribute.
	 * @see #getKennung()
	 * @generated
	 */
	void setKennung(String value);

	/**
	 * Returns the value of the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im "zusatz" können zusätzliche freie Angaben zur Erreichbarkeit über einen Kommunikationskanal gemacht werden. Beispiel: erreichbar tagsüber zwischen 9 und 16 Uhr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatz</em>' attribute.
	 * @see #setZusatz(String)
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage#getErreichbarkeitType_Zusatz()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zusatz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusatz();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getZusatz <em>Zusatz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatz</em>' attribute.
	 * @see #getZusatz()
	 * @generated
	 */
	void setZusatz(String value);

} // ErreichbarkeitType
