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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sonstige Leistungen Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu sonstigen Leistungen (z.B. SGB-II-Bezug o der Elterngeld für ein älteres Kind).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugElterngeldAusland <em>Bezug Elterngeld Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNachweisElterngeldAusland <em>Nachweis Elterngeld Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugALGII <em>Bezug ALGII</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNachweisALGII <em>Nachweis ALGII</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNameSozialleistungstraeger <em>Name Sozialleistungstraeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getAnschriftSozialleistungstraeger <em>Anschrift Sozialleistungstraeger</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSonstigeLeistungenBezugszeitraumType()
 * @model extendedMetaData="name='SonstigeLeistungenBezugszeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SonstigeLeistungenBezugszeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezug Elterngeld Ausland</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der sonstigen Leistung. Die Literale 11 bis 19 sind für sonstige Leistung für das Kind möglich auszufüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug Elterngeld Ausland</em>' attribute.
	 * @see #isSetBezugElterngeldAusland()
	 * @see #unsetBezugElterngeldAusland()
	 * @see #setBezugElterngeldAusland(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSonstigeLeistungenBezugszeitraumType_BezugElterngeldAusland()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bezugElterngeldAusland' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugElterngeldAusland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugElterngeldAusland <em>Bezug Elterngeld Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Elterngeld Ausland</em>' attribute.
	 * @see #isSetBezugElterngeldAusland()
	 * @see #unsetBezugElterngeldAusland()
	 * @see #isBezugElterngeldAusland()
	 * @generated
	 */
	void setBezugElterngeldAusland(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugElterngeldAusland <em>Bezug Elterngeld Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugElterngeldAusland()
	 * @see #isBezugElterngeldAusland()
	 * @see #setBezugElterngeldAusland(boolean)
	 * @generated
	 */
	void unsetBezugElterngeldAusland();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugElterngeldAusland <em>Bezug Elterngeld Ausland</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug Elterngeld Ausland</em>' attribute is set.
	 * @see #unsetBezugElterngeldAusland()
	 * @see #isBezugElterngeldAusland()
	 * @see #setBezugElterngeldAusland(boolean)
	 * @generated
	 */
	boolean isSetBezugElterngeldAusland();

	/**
	 * Returns the value of the '<em><b>Nachweis Elterngeld Ausland</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweis Elterngeld Ausland</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSonstigeLeistungenBezugszeitraumType_NachweisElterngeldAusland()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisElterngeldAusland' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisElterngeldAusland();

	/**
	 * Returns the value of the '<em><b>Bezug ALGII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob ALG II /Bürgergeld bezogen wird/wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug ALGII</em>' attribute.
	 * @see #isSetBezugALGII()
	 * @see #unsetBezugALGII()
	 * @see #setBezugALGII(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSonstigeLeistungenBezugszeitraumType_BezugALGII()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='bezugALGII' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBezugALGII();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugALGII <em>Bezug ALGII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug ALGII</em>' attribute.
	 * @see #isSetBezugALGII()
	 * @see #unsetBezugALGII()
	 * @see #isBezugALGII()
	 * @generated
	 */
	void setBezugALGII(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugALGII <em>Bezug ALGII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBezugALGII()
	 * @see #isBezugALGII()
	 * @see #setBezugALGII(boolean)
	 * @generated
	 */
	void unsetBezugALGII();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#isBezugALGII <em>Bezug ALGII</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bezug ALGII</em>' attribute is set.
	 * @see #unsetBezugALGII()
	 * @see #isBezugALGII()
	 * @see #setBezugALGII(boolean)
	 * @generated
	 */
	boolean isSetBezugALGII();

	/**
	 * Returns the value of the '<em><b>Nachweis ALGII</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Möglichkeit, Nachweise über den Bezug von ALG II /Bürgergeld zu übertragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis ALGII</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSonstigeLeistungenBezugszeitraumType_NachweisALGII()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisALGII' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisALGII();

	/**
	 * Returns the value of the '<em><b>Name Sozialleistungstraeger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der sonstigen Leistung. Die Literale 11 bis 19 sind für sonstige Leistung für das Kind möglich auszufüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Sozialleistungstraeger</em>' attribute.
	 * @see #setNameSozialleistungstraeger(String)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSonstigeLeistungenBezugszeitraumType_NameSozialleistungstraeger()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nameSozialleistungstraeger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameSozialleistungstraeger();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getNameSozialleistungstraeger <em>Name Sozialleistungstraeger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Sozialleistungstraeger</em>' attribute.
	 * @see #getNameSozialleistungstraeger()
	 * @generated
	 */
	void setNameSozialleistungstraeger(String value);

	/**
	 * Returns the value of the '<em><b>Anschrift Sozialleistungstraeger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der sonstigen Leistung. Die Literale 11 bis 19 sind für sonstige Leistung für das Kind möglich auszufüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift Sozialleistungstraeger</em>' containment reference.
	 * @see #setAnschriftSozialleistungstraeger(PostalischeInlandsanschriftBasisType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getSonstigeLeistungenBezugszeitraumType_AnschriftSozialleistungstraeger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschriftSozialleistungstraeger' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalischeInlandsanschriftBasisType getAnschriftSozialleistungstraeger();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType#getAnschriftSozialleistungstraeger <em>Anschrift Sozialleistungstraeger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift Sozialleistungstraeger</em>' containment reference.
	 * @see #getAnschriftSozialleistungstraeger()
	 * @generated
	 */
	void setAnschriftSozialleistungstraeger(PostalischeInlandsanschriftBasisType value);

} // SonstigeLeistungenBezugszeitraumType
