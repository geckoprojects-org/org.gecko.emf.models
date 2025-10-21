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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Krankenversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zur Krankenversicherung des antragstellenden Elternteils.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersicherungsart <em>Versicherungsart</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getBezeichnungKrankenkasse <em>Bezeichnung Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftKrankenkasse <em>Anschrift Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersichertennummer <em>Versichertennummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftPostfachKrankenkasse <em>Anschrift Postfach Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getNachweisKrankenversicherung <em>Nachweis Krankenversicherung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankenversicherungType()
 * @model extendedMetaData="name='KrankenversicherungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KrankenversicherungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Versicherungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Versicherung. Für den Elterngeldantrag sind folgende Codewerte zu nutzen: 02, 03 , 04, 07, 08, 09.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versicherungsart</em>' containment reference.
	 * @see #setVersicherungsart(CodeVersicherungsartType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankenversicherungType_Versicherungsart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='versicherungsart' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeVersicherungsartType getVersicherungsart();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersicherungsart <em>Versicherungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versicherungsart</em>' containment reference.
	 * @see #getVersicherungsart()
	 * @generated
	 */
	void setVersicherungsart(CodeVersicherungsartType value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Krankenkasse, nur zu befüllen, wenn freiwillig gesetzlich oder gesetzlich pflichtversichert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Krankenkasse</em>' attribute.
	 * @see #setBezeichnungKrankenkasse(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankenversicherungType_BezeichnungKrankenkasse()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='bezeichnungKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBezeichnungKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getBezeichnungKrankenkasse <em>Bezeichnung Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Krankenkasse</em>' attribute.
	 * @see #getBezeichnungKrankenkasse()
	 * @generated
	 */
	void setBezeichnungKrankenkasse(String value);

	/**
	 * Returns the value of the '<em><b>Anschrift Krankenkasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anschrift der Krankenkassenur zu befüllen, wenn freiwillig gesetzlich oder gesetzlich pflichtversichert
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Krankenkasse</em>' containment reference.
	 * @see #setAnschriftKrankenkasse(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankenversicherungType_AnschriftKrankenkasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAnschriftKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftKrankenkasse <em>Anschrift Krankenkasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Krankenkasse</em>' containment reference.
	 * @see #getAnschriftKrankenkasse()
	 * @generated
	 */
	void setAnschriftKrankenkasse(PostalischeInlandsanschriftBasisType value);

	/**
	 * Returns the value of the '<em><b>Versichertennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Krankenversichertennummer, die den Versicherten bei einer Krankenkasse identifiziert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versichertennummer</em>' attribute.
	 * @see #setVersichertennummer(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankenversicherungType_Versichertennummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='versichertennummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersichertennummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getVersichertennummer <em>Versichertennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versichertennummer</em>' attribute.
	 * @see #getVersichertennummer()
	 * @generated
	 */
	void setVersichertennummer(String value);

	/**
	 * Returns the value of the '<em><b>Anschrift Postfach Krankenkasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anschrift Postfach Krankenkasse</em>' containment reference.
	 * @see #setAnschriftPostfachKrankenkasse(PostalischeInlandsanschriftPostfachanschriftType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankenversicherungType_AnschriftPostfachKrankenkasse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftPostfachKrankenkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftPostfachanschriftType getAnschriftPostfachKrankenkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankenversicherungType#getAnschriftPostfachKrankenkasse <em>Anschrift Postfach Krankenkasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Postfach Krankenkasse</em>' containment reference.
	 * @see #getAnschriftPostfachKrankenkasse()
	 * @generated
	 */
	void setAnschriftPostfachKrankenkasse(PostalischeInlandsanschriftPostfachanschriftType value);

	/**
	 * Returns the value of the '<em><b>Nachweis Krankenversicherung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier können Nachweise zur Krankenversicherung hochgeladen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis Krankenversicherung</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getKrankenversicherungType_NachweisKrankenversicherung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisKrankenversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisKrankenversicherung();

} // KrankenversicherungType
