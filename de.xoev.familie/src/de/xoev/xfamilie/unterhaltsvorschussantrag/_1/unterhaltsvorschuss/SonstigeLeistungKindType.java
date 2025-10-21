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
 * A representation of the model object '<em><b>Sonstige Leistung Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zu sonstigen Leistungen (z.B. SGB II) des Kindes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungserhaltKindergeld <em>Leistungserhalt Kindergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungsgewaehrung <em>Leistungsgewaehrung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameJobcenter <em>Name Jobcenter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameTraeger <em>Name Traeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBezugUV <em>Bezug UV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getZeitraum <em>Zeitraum</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType()
 * @model extendedMetaData="name='SonstigeLeistung.KindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SonstigeLeistungKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der sonstigen Leistung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art</em>' containment reference.
	 * @see #setArt(CodeSonstigeLeistungenUVType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_Art()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='art' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSonstigeLeistungenUVType getArt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getArt <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' containment reference.
	 * @see #getArt()
	 * @generated
	 */
	void setArt(CodeSonstigeLeistungenUVType value);

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden.; Regel: Nachweis ist die Sterbeurkunde
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_Nachweis()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNachweis();

	/**
	 * Returns the value of the '<em><b>Leistungserhalt Kindergeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Person, die die Leistung erhält. Regel: Falls "Art" "Kindergeld" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leistungserhalt Kindergeld</em>' containment reference.
	 * @see #setLeistungserhaltKindergeld(LeistungserhaltType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_LeistungserhaltKindergeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leistungserhaltKindergeld' namespace='##targetNamespace'"
	 * @generated
	 */
	LeistungserhaltType getLeistungserhaltKindergeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungserhaltKindergeld <em>Leistungserhalt Kindergeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leistungserhalt Kindergeld</em>' containment reference.
	 * @see #getLeistungserhaltKindergeld()
	 * @generated
	 */
	void setLeistungserhaltKindergeld(LeistungserhaltType value);

	/**
	 * Returns the value of the '<em><b>Leistungsgewaehrung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Status der Leistungsgewährung ist. Regel: Für Kindergeld wird es nur ausgefüllt, wenn Kindergeld noch nicht bezogen wird. Für Waisengeld wird es nur ausgefüllt, wenn der andere Elternteil oder Stiefelternteil verstorben ist und noch kein Waisengeld bezogen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leistungsgewaehrung</em>' containment reference.
	 * @see #setLeistungsgewaehrung(LeistungsgewaehrungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_Leistungsgewaehrung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leistungsgewaehrung' namespace='##targetNamespace'"
	 * @generated
	 */
	LeistungsgewaehrungType getLeistungsgewaehrung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getLeistungsgewaehrung <em>Leistungsgewaehrung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leistungsgewaehrung</em>' containment reference.
	 * @see #getLeistungsgewaehrung()
	 * @generated
	 */
	void setLeistungsgewaehrung(LeistungsgewaehrungType value);

	/**
	 * Returns the value of the '<em><b>Name Jobcenter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Namen des Jobcenter. Regel: Falls "Art" "SGB II" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Jobcenter</em>' attribute.
	 * @see #setNameJobcenter(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_NameJobcenter()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nameJobcenter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameJobcenter();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameJobcenter <em>Name Jobcenter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Jobcenter</em>' attribute.
	 * @see #getNameJobcenter()
	 * @generated
	 */
	void setNameJobcenter(String value);

	/**
	 * Returns the value of the '<em><b>Bedarfsgemeinschaftsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zu der Bedarfsgemeinschaftnummer. Regel: Falls "Art" "SGB II" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedarfsgemeinschaftsnummer</em>' attribute.
	 * @see #setBedarfsgemeinschaftsnummer(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_Bedarfsgemeinschaftsnummer()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='bedarfsgemeinschaftsnummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBedarfsgemeinschaftsnummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBedarfsgemeinschaftsnummer <em>Bedarfsgemeinschaftsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedarfsgemeinschaftsnummer</em>' attribute.
	 * @see #getBedarfsgemeinschaftsnummer()
	 * @generated
	 */
	void setBedarfsgemeinschaftsnummer(String value);

	/**
	 * Returns the value of the '<em><b>Name Traeger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu dem Namen des Trägers. Regel: Falls "Art" "SGB XII" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Traeger</em>' attribute.
	 * @see #setNameTraeger(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_NameTraeger()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='nameTraeger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNameTraeger();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getNameTraeger <em>Name Traeger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Traeger</em>' attribute.
	 * @see #getNameTraeger()
	 * @generated
	 */
	void setNameTraeger(String value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum des Aktenzeichens. Regel: Falls "Art" "SGB XII" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #setAktenzeichen(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_Aktenzeichen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='aktenzeichen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getAktenzeichen <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen</em>' attribute.
	 * @see #getAktenzeichen()
	 * @generated
	 */
	void setAktenzeichen(String value);

	/**
	 * Returns the value of the '<em><b>Betraege Zur Leistungshoehe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Betrag von Leistungen. Regel: Falls "Art" "Waisengeld" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betraege Zur Leistungshoehe</em>' attribute.
	 * @see #setBetraegeZurLeistungshoehe(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_BetraegeZurLeistungshoehe()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='betraegeZurLeistungshoehe' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBetraegeZurLeistungshoehe();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBetraegeZurLeistungshoehe <em>Betraege Zur Leistungshoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betraege Zur Leistungshoehe</em>' attribute.
	 * @see #getBetraegeZurLeistungshoehe()
	 * @generated
	 */
	void setBetraegeZurLeistungshoehe(String value);

	/**
	 * Returns the value of the '<em><b>Bezug UV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu früheren Unterhaltsvorschussbezügen. Regel: Falls "Art" "frueheren Unterhaltsvorschussbezug" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug UV</em>' containment reference.
	 * @see #setBezugUV(BezugUvKindType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_BezugUV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bezugUV' namespace='##targetNamespace'"
	 * @generated
	 */
	BezugUvKindType getBezugUV();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungKindType#getBezugUV <em>Bezug UV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug UV</em>' containment reference.
	 * @see #getBezugUV()
	 * @generated
	 */
	void setBezugUV(BezugUvKindType value);

	/**
	 * Returns the value of the '<em><b>Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Zeitraum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getSonstigeLeistungKindType_Zeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZeitraumType> getZeitraum();

} // SonstigeLeistungKindType
