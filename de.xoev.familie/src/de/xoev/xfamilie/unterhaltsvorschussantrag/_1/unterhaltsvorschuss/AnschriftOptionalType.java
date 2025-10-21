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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anschrift Optional Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur Anschrift. Da beim Unterhaltsvorschuss die antragstellende Person Angaben zum anderen Elternteil machen soll und davon ausgegangen werden muss, dass die Angaben unvollständig sein werden, sind alle Angaben der Anschrift optional.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummerBuchstabeZusatzziffer <em>Hausnummer Buchstabe Zusatzziffer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStockwerkswohnungsnummer <em>Stockwerkswohnungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getTeilnummerDerHausnummer <em>Teilnummer Der Hausnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnort <em>Wohnort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnortFruehererGemeindename <em>Wohnort Frueherer Gemeindename</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnungsinhaber <em>Wohnungsinhaber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getZusatzangaben <em>Zusatzangaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStaat <em>Staat</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType()
 * @model extendedMetaData="name='Anschrift.optionalType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnschriftOptionalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es sind nur die Ziffern einer Hausnummer anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hausnummer</em>' attribute.
	 * @see #setHausnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Hausnummer()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftHausnummerType"
	 *        extendedMetaData="kind='element' name='hausnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHausnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummer <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummer</em>' attribute.
	 * @see #getHausnummer()
	 * @generated
	 */
	void setHausnummer(String value);

	/**
	 * Returns the value of the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es sind Buchstaben oder Zusatzziffern zur Hausnummer anzugeben. Beispiel: 124 A, 109.5
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hausnummer Buchstabe Zusatzziffer</em>' attribute.
	 * @see #setHausnummerBuchstabeZusatzziffer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_HausnummerBuchstabeZusatzziffer()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftHausnummerBuchstabeZusatzzifferType"
	 *        extendedMetaData="kind='element' name='hausnummerBuchstabeZusatzziffer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHausnummerBuchstabeZusatzziffer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getHausnummerBuchstabeZusatzziffer <em>Hausnummer Buchstabe Zusatzziffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hausnummer Buchstabe Zusatzziffer</em>' attribute.
	 * @see #getHausnummerBuchstabeZusatzziffer()
	 * @generated
	 */
	void setHausnummerBuchstabeZusatzziffer(String value);

	/**
	 * Returns the value of the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist die Postleitzahl anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postleitzahl</em>' attribute.
	 * @see #setPostleitzahl(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Postleitzahl()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftPostleitzahlType"
	 *        extendedMetaData="kind='element' name='postleitzahl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostleitzahl();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getPostleitzahl <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postleitzahl</em>' attribute.
	 * @see #getPostleitzahl()
	 * @generated
	 */
	void setPostleitzahl(String value);

	/**
	 * Returns the value of the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es können Stockwerks- oder Wohnungsnummern angegeben werden, soweit sie für die Adressierung erforderlich sind. Beispiele: 7OG, 13OG, P für Parterre, HP für Hochparterre, St für Souterrain oder (Wohnung) 115.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stockwerkswohnungsnummer</em>' attribute.
	 * @see #setStockwerkswohnungsnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Stockwerkswohnungsnummer()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftStockwerkswohnungsnummerType"
	 *        extendedMetaData="kind='element' name='stockwerkswohnungsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStockwerkswohnungsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStockwerkswohnungsnummer <em>Stockwerkswohnungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stockwerkswohnungsnummer</em>' attribute.
	 * @see #getStockwerkswohnungsnummer()
	 * @generated
	 */
	void setStockwerkswohnungsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist die Bezeichnung der Straße in der amtlichen Schreibweise anzugeben. Es ist möglich hier Straße, Hausnummer und Hausnummerzusatz in einem Feld zu übertragen, damit Daten aus der E-ID direkt übernehmbar sind. Es wird aber davon abgeraten. Bei Überschreitung einer Feldlänge von 55 Zeichen muss sinnvoll abgekürzt werden. Ist keine Straßenbezeichnung - wohl aber eine Hausnummer - vorhanden, so ist die Zeichenkette Hausnummer anzugeben. Sind weder Straßenbezeichnung noch Hausnummer vorhanden, so ist die Zeichenkette ohne Hausnummer anzugeben. Zusätze, die nicht der Straßenbezeichnung dienen, sind nicht zulässig. Soweit Angaben wie z. B. Weg A 2 und 12 oder Weg B zur Adressierung benötigt werden, sind diese im Element zusatzangaben zu übermitteln. Siehe DSMeld-Blatt 1205.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strasse</em>' attribute.
	 * @see #setStrasse(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Strasse()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftStrasseType"
	 *        extendedMetaData="kind='element' name='strasse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStrasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStrasse <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strasse</em>' attribute.
	 * @see #getStrasse()
	 * @generated
	 */
	void setStrasse(String value);

	/**
	 * Returns the value of the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es sind Teilnummern zur Hausnummer anzugeben. Beispiel: 16 1/7
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teilnummer Der Hausnummer</em>' attribute.
	 * @see #setTeilnummerDerHausnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_TeilnummerDerHausnummer()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftTeilnummerDerHausnummerType"
	 *        extendedMetaData="kind='element' name='teilnummerDerHausnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTeilnummerDerHausnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getTeilnummerDerHausnummer <em>Teilnummer Der Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teilnummer Der Hausnummer</em>' attribute.
	 * @see #getTeilnummerDerHausnummer()
	 * @generated
	 */
	void setTeilnummerDerHausnummer(String value);

	/**
	 * Returns the value of the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist die postalische Wohnortsbezeichnung anzugeben. Bei Überschreitung einer Länge von 25 Zeichen darf sinnvoll abgekürzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnort</em>' attribute.
	 * @see #setWohnort(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Wohnort()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftWohnortType"
	 *        extendedMetaData="kind='element' name='wohnort' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWohnort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnort <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnort</em>' attribute.
	 * @see #getWohnort()
	 * @generated
	 */
	void setWohnort(String value);

	/**
	 * Returns the value of the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es ist der frühere Gemeindename anzugeben, der als Stadt- bzw. Ortsteilname dem jetzigen Gemeindenamen hinzugefügt werden kann.Der frühere Gemeindename (jetziger Ortsteil- oder Stadtteilname) ist bei Adressierungen unterhalb des Namens (oberhalb der Straßenbezeichnung) anzugeben.Beispiel: Frau Rita Scholl Zuffenhausen Am Stadtpark 12 70123 Stuttgart Bei Überschreitung einer Länge von 25 Zeichen darf sinnvoll abgekürzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnort Frueherer Gemeindename</em>' attribute.
	 * @see #setWohnortFruehererGemeindename(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_WohnortFruehererGemeindename()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftWohnortFruehererGemeindenameType"
	 *        extendedMetaData="kind='element' name='wohnortFruehererGemeindename' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWohnortFruehererGemeindename();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnortFruehererGemeindename <em>Wohnort Frueherer Gemeindename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnort Frueherer Gemeindename</em>' attribute.
	 * @see #getWohnortFruehererGemeindename()
	 * @generated
	 */
	void setWohnortFruehererGemeindename(String value);

	/**
	 * Returns the value of the '<em><b>Wohnungsinhaber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element ist der Hauptmieter oder Eigentümer der Wohnung anzugeben, soweit dies für die Adressierung erforderlich ist. Bei Überschreitung einer Länge von 26 Zeichen darf sinnvoll abgekürzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wohnungsinhaber</em>' attribute.
	 * @see #setWohnungsinhaber(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Wohnungsinhaber()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftWohnungsinhaberType"
	 *        extendedMetaData="kind='element' name='wohnungsinhaber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWohnungsinhaber();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getWohnungsinhaber <em>Wohnungsinhaber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wohnungsinhaber</em>' attribute.
	 * @see #getWohnungsinhaber()
	 * @generated
	 */
	void setWohnungsinhaber(String value);

	/**
	 * Returns the value of the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Es sind Zusatzangaben zur Anschrift anzugeben. Beispiele: Hinterhaus, Gartenhaus. Bei Überschreitung einer Länge von 21 Zeichen darf sinnvoll abgekürzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzangaben</em>' attribute.
	 * @see #setZusatzangaben(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Zusatzangaben()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftZusatzangabenType"
	 *        extendedMetaData="kind='element' name='zusatzangaben' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZusatzangaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getZusatzangaben <em>Zusatzangaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzangaben</em>' attribute.
	 * @see #getZusatzangaben()
	 * @generated
	 */
	void setZusatzangaben(String value);

	/**
	 * Returns the value of the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Aufenthaltsland des anderen Elternteils. Regel: Falls der andere Elternteil nicht in Deutschland lebt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staat</em>' containment reference.
	 * @see #setStaat(CodeStaatType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAnschriftOptionalType_Staat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staat' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeStaatType getStaat();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AnschriftOptionalType#getStaat <em>Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staat</em>' containment reference.
	 * @see #getStaat()
	 * @generated
	 */
	void setStaat(CodeStaatType value);

} // AnschriftOptionalType
