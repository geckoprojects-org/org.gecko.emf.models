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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anschrift Kind Optional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Anschrift des Kindes zum Zeitpunkt der ersten Antragstellung. Hierbei handelt es sich nicht zwangsläufig um die Meldeanschrift des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getWohnort <em>Wohnort</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftKindOptionalType()
 * @model extendedMetaData="name='AnschriftKind.optionalType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnschriftKindOptionalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es sind nur die Ziffern einer Hausnummer anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hausnummer</em>' attribute.
	 * @see #setHausnummer(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftKindOptionalType_Hausnummer()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftHausnummerType"
	 *        extendedMetaData="kind='element' name='hausnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHausnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getHausnummer <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummer</em>' attribute.
	 * @see #getHausnummer()
	 * @generated
	 */
	void setHausnummer(String value);

	/**
	 * Returns the value of the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist die Postleitzahl anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postleitzahl</em>' attribute.
	 * @see #setPostleitzahl(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftKindOptionalType_Postleitzahl()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftPostleitzahlType"
	 *        extendedMetaData="kind='element' name='postleitzahl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostleitzahl();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getPostleitzahl <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postleitzahl</em>' attribute.
	 * @see #getPostleitzahl()
	 * @generated
	 */
	void setPostleitzahl(String value);

	/**
	 * Returns the value of the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist die Bezeichnung der Straße in der amtlichen Schreibweise anzugeben. Es ist möglich hier Straße, Hausnummer und Hausnummerzusatz in einem Feld zu übertragen, damit Daten aus der E-ID direkt übernehmbar sind. Es wird aber davon abgeraten. Bei Überschreitung einer Feldlänge von 55 Zeichen muss sinnvoll abgekürzt werden. Ist keine Straßenbezeichnung - wohl aber eine Hausnummer - vorhanden, so ist die Zeichenkette Hausnummer anzugeben. Sind weder Straßenbezeichnung noch Hausnummer vorhanden, so ist die Zeichenkette ohne Hausnummer anzugeben. Zusätze, die nicht der Straßenbezeichnung dienen, sind nicht zulässig. Soweit Angaben wie z. B. Weg A 2 und 12 oder Weg B zur Adressierung benötigt werden, sind diese im Element zusatzangaben zu übermitteln. Siehe DSMeld-Blatt 1205.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strasse</em>' attribute.
	 * @see #setStrasse(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftKindOptionalType_Strasse()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftStrasseType"
	 *        extendedMetaData="kind='element' name='strasse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStrasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getStrasse <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strasse</em>' attribute.
	 * @see #getStrasse()
	 * @generated
	 */
	void setStrasse(String value);

	/**
	 * Returns the value of the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist die postalische Wohnortsbezeichnung anzugeben. Bei Überschreitung einer Länge von 25 Zeichen darf sinnvoll abgekürzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnort</em>' attribute.
	 * @see #setWohnort(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getAnschriftKindOptionalType_Wohnort()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftWohnortType"
	 *        extendedMetaData="kind='element' name='wohnort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWohnort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType#getWohnort <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnort</em>' attribute.
	 * @see #getWohnort()
	 * @generated
	 */
	void setWohnort(String value);

} // AnschriftKindOptionalType
