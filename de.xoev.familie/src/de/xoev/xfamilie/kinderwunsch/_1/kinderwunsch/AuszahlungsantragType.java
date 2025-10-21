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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auszahlungsantrag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isAbfrageBewilligungsbescheid <em>Abfrage Bewilligungsbescheid</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getBundeslandFoerderstelle <em>Bundesland Foerderstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAktenzeichenBewilligungsantrag <em>Aktenzeichen Bewilligungsantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isZustimmungDatenschutzerklaerungHerbeifuehrung <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getKonfigurationsfragen <em>Konfigurationsfragen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAntragstellendePerson <em>Antragstellende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNichtaustragendePerson <em>Nichtaustragende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAngabenBankverbindung <em>Angaben Bankverbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNachweiseBerechnungZuwendung <em>Nachweise Berechnung Zuwendung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getEinwilligungenAuszahlungsantrag <em>Einwilligungen Auszahlungsantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType()
 * @model extendedMetaData="name='AuszahlungsantragType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuszahlungsantragType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abfrage Bewilligungsbescheid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abfrage Bewilligungsbescheid</em>' attribute.
	 * @see #isSetAbfrageBewilligungsbescheid()
	 * @see #unsetAbfrageBewilligungsbescheid()
	 * @see #setAbfrageBewilligungsbescheid(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_AbfrageBewilligungsbescheid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='abfrageBewilligungsbescheid' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAbfrageBewilligungsbescheid();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isAbfrageBewilligungsbescheid <em>Abfrage Bewilligungsbescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abfrage Bewilligungsbescheid</em>' attribute.
	 * @see #isSetAbfrageBewilligungsbescheid()
	 * @see #unsetAbfrageBewilligungsbescheid()
	 * @see #isAbfrageBewilligungsbescheid()
	 * @generated
	 */
	void setAbfrageBewilligungsbescheid(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isAbfrageBewilligungsbescheid <em>Abfrage Bewilligungsbescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbfrageBewilligungsbescheid()
	 * @see #isAbfrageBewilligungsbescheid()
	 * @see #setAbfrageBewilligungsbescheid(boolean)
	 * @generated
	 */
	void unsetAbfrageBewilligungsbescheid();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isAbfrageBewilligungsbescheid <em>Abfrage Bewilligungsbescheid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abfrage Bewilligungsbescheid</em>' attribute is set.
	 * @see #unsetAbfrageBewilligungsbescheid()
	 * @see #isAbfrageBewilligungsbescheid()
	 * @see #setAbfrageBewilligungsbescheid(boolean)
	 * @generated
	 */
	boolean isSetAbfrageBewilligungsbescheid();

	/**
	 * Returns the value of the '<em><b>Bundesland Foerderstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundesland Foerderstelle</em>' attribute.
	 * @see #setBundeslandFoerderstelle(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_BundeslandFoerderstelle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='bundeslandFoerderstelle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBundeslandFoerderstelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getBundeslandFoerderstelle <em>Bundesland Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundesland Foerderstelle</em>' attribute.
	 * @see #getBundeslandFoerderstelle()
	 * @generated
	 */
	void setBundeslandFoerderstelle(String value);

	/**
	 * Returns the value of the '<em><b>Aktenzeichen Bewilligungsantrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aktenzeichen Bewilligungsantrag</em>' attribute.
	 * @see #setAktenzeichenBewilligungsantrag(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_AktenzeichenBewilligungsantrag()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='aktenzeichenBewilligungsantrag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichenBewilligungsantrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAktenzeichenBewilligungsantrag <em>Aktenzeichen Bewilligungsantrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen Bewilligungsantrag</em>' attribute.
	 * @see #getAktenzeichenBewilligungsantrag()
	 * @generated
	 */
	void setAktenzeichenBewilligungsantrag(String value);

	/**
	 * Returns the value of the '<em><b>Datenschutzerklaerung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenschutzerklaerung Schwangerschaft</em>' attribute.
	 * @see #setDatenschutzerklaerungSchwangerschaft(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_DatenschutzerklaerungSchwangerschaft()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzerklaerungSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatenschutzerklaerungSchwangerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutzerklaerung Schwangerschaft</em>' attribute.
	 * @see #getDatenschutzerklaerungSchwangerschaft()
	 * @generated
	 */
	void setDatenschutzerklaerungSchwangerschaft(String value);

	/**
	 * Returns the value of the '<em><b>Zustimmung Datenschutzerklaerung Herbeifuehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>' attribute.
	 * @see #isSetZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #unsetZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #setZustimmungDatenschutzerklaerungHerbeifuehrung(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_ZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='zustimmungDatenschutzerklaerungHerbeifuehrung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isZustimmungDatenschutzerklaerungHerbeifuehrung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isZustimmungDatenschutzerklaerungHerbeifuehrung <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>' attribute.
	 * @see #isSetZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #unsetZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #isZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @generated
	 */
	void setZustimmungDatenschutzerklaerungHerbeifuehrung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isZustimmungDatenschutzerklaerungHerbeifuehrung <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #isZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #setZustimmungDatenschutzerklaerungHerbeifuehrung(boolean)
	 * @generated
	 */
	void unsetZustimmungDatenschutzerklaerungHerbeifuehrung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isZustimmungDatenschutzerklaerungHerbeifuehrung <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>' attribute is set.
	 * @see #unsetZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #isZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #setZustimmungDatenschutzerklaerungHerbeifuehrung(boolean)
	 * @generated
	 */
	boolean isSetZustimmungDatenschutzerklaerungHerbeifuehrung();

	/**
	 * Returns the value of the '<em><b>Konfigurationsfragen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Konfigurationsfragen</em>' containment reference.
	 * @see #setKonfigurationsfragen(KonfigurationsfragenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_Konfigurationsfragen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='konfigurationsfragen' namespace='##targetNamespace'"
	 * @generated
	 */
	KonfigurationsfragenType getKonfigurationsfragen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getKonfigurationsfragen <em>Konfigurationsfragen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Konfigurationsfragen</em>' containment reference.
	 * @see #getKonfigurationsfragen()
	 * @generated
	 */
	void setKonfigurationsfragen(KonfigurationsfragenType value);

	/**
	 * Returns the value of the '<em><b>Antragstellende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antragstellende Person</em>' containment reference.
	 * @see #setAntragstellendePerson(PersonendatenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_AntragstellendePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragstellendePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getAntragstellendePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAntragstellendePerson <em>Antragstellende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragstellende Person</em>' containment reference.
	 * @see #getAntragstellendePerson()
	 * @generated
	 */
	void setAntragstellendePerson(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Nichtaustragende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nichtaustragende Person</em>' containment reference.
	 * @see #setNichtaustragendePerson(PersonendatenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_NichtaustragendePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nichtaustragendePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getNichtaustragendePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNichtaustragendePerson <em>Nichtaustragende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nichtaustragende Person</em>' containment reference.
	 * @see #getNichtaustragendePerson()
	 * @generated
	 */
	void setNichtaustragendePerson(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Angaben Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Bankverbindung</em>' containment reference.
	 * @see #setAngabenBankverbindung(BankverbindungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_AngabenBankverbindung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenBankverbindung' namespace='##targetNamespace'"
	 * @generated
	 */
	BankverbindungType getAngabenBankverbindung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAngabenBankverbindung <em>Angaben Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Bankverbindung</em>' containment reference.
	 * @see #getAngabenBankverbindung()
	 * @generated
	 */
	void setAngabenBankverbindung(BankverbindungType value);

	/**
	 * Returns the value of the '<em><b>Nachweise Berechnung Zuwendung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweise Berechnung Zuwendung</em>' containment reference.
	 * @see #setNachweiseBerechnungZuwendung(NachweiseBerechnungZuwendungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_NachweiseBerechnungZuwendung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachweiseBerechnungZuwendung' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweiseBerechnungZuwendungType getNachweiseBerechnungZuwendung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNachweiseBerechnungZuwendung <em>Nachweise Berechnung Zuwendung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweise Berechnung Zuwendung</em>' containment reference.
	 * @see #getNachweiseBerechnungZuwendung()
	 * @generated
	 */
	void setNachweiseBerechnungZuwendung(NachweiseBerechnungZuwendungType value);

	/**
	 * Returns the value of the '<em><b>Einwilligungen Auszahlungsantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einwilligungen Auszahlungsantrag</em>' containment reference.
	 * @see #setEinwilligungenAuszahlungsantrag(EinwilligungenAuszahlungsantragType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_EinwilligungenAuszahlungsantrag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='einwilligungenAuszahlungsantrag' namespace='##targetNamespace'"
	 * @generated
	 */
	EinwilligungenAuszahlungsantragType getEinwilligungenAuszahlungsantrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getEinwilligungenAuszahlungsantrag <em>Einwilligungen Auszahlungsantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligungen Auszahlungsantrag</em>' containment reference.
	 * @see #getEinwilligungenAuszahlungsantrag()
	 * @generated
	 */
	void setEinwilligungenAuszahlungsantrag(EinwilligungenAuszahlungsantragType value);

	/**
	 * Returns the value of the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute.
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getAuszahlungsantragType_BestaetigungRichtigkeitAngaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bestaetigungRichtigkeitAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBestaetigungRichtigkeitAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute.
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @generated
	 */
	void setBestaetigungRichtigkeitAngaben(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @generated
	 */
	void unsetBestaetigungRichtigkeitAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute is set.
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @generated
	 */
	boolean isSetBestaetigungRichtigkeitAngaben();

} // AuszahlungsantragType
