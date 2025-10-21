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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType;
import de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bewilligungsantrag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getStandortReproduktionsklinik <em>Standort Reproduktionsklinik</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getBundesland <em>Bundesland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungherbeifuehrungSchwangerschaft <em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getKonfigurationsfragen <em>Konfigurationsfragen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isGleicherHaushalt <em>Gleicher Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getGruendegetrennterWohnsitz <em>Gruendegetrennter Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAltersgrenze <em>Altersgrenze</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getArtBehandlung <em>Art Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAntragstellendePerson <em>Antragstellende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNichtaustragendePerson <em>Nichtaustragende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAngabenBehandlung <em>Angaben Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFinanzierungsplan <em>Finanzierungsplan</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getEinwilligungen <em>Einwilligungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType()
 * @model extendedMetaData="name='BewilligungsantragType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BewilligungsantragType extends EObject {
	/**
	 * Returns the value of the '<em><b>Standort Reproduktionsklinik</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standort Reproduktionsklinik</em>' attribute.
	 * @see #setStandortReproduktionsklinik(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_StandortReproduktionsklinik()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='standortReproduktionsklinik' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStandortReproduktionsklinik();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getStandortReproduktionsklinik <em>Standort Reproduktionsklinik</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standort Reproduktionsklinik</em>' attribute.
	 * @see #getStandortReproduktionsklinik()
	 * @generated
	 */
	void setStandortReproduktionsklinik(String value);

	/**
	 * Returns the value of the '<em><b>Bundesland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundesland</em>' containment reference.
	 * @see #setBundesland(CodeBundeslandType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_Bundesland()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bundesland' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeBundeslandType getBundesland();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getBundesland <em>Bundesland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundesland</em>' containment reference.
	 * @see #getBundesland()
	 * @generated
	 */
	void setBundesland(CodeBundeslandType value);

	/**
	 * Returns the value of the '<em><b>Datenschutzerklaerung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenschutzerklaerung Schwangerschaft</em>' attribute.
	 * @see #setDatenschutzerklaerungSchwangerschaft(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_DatenschutzerklaerungSchwangerschaft()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzerklaerungSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatenschutzerklaerungSchwangerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutzerklaerung Schwangerschaft</em>' attribute.
	 * @see #getDatenschutzerklaerungSchwangerschaft()
	 * @generated
	 */
	void setDatenschutzerklaerungSchwangerschaft(String value);

	/**
	 * Returns the value of the '<em><b>Datenschutzerklaerungherbeifuehrung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>' attribute.
	 * @see #setDatenschutzerklaerungherbeifuehrungSchwangerschaft(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_DatenschutzerklaerungherbeifuehrungSchwangerschaft()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzerklaerungherbeifuehrungSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDatenschutzerklaerungherbeifuehrungSchwangerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungherbeifuehrungSchwangerschaft <em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>' attribute.
	 * @see #getDatenschutzerklaerungherbeifuehrungSchwangerschaft()
	 * @generated
	 */
	void setDatenschutzerklaerungherbeifuehrungSchwangerschaft(String value);

	/**
	 * Returns the value of the '<em><b>Konfigurationsfragen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Konfigurationsfragen</em>' containment reference.
	 * @see #setKonfigurationsfragen(KonfigurationsfragenBewilligungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_Konfigurationsfragen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='konfigurationsfragen' namespace='##targetNamespace'"
	 * @generated
	 */
	KonfigurationsfragenBewilligungType getKonfigurationsfragen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getKonfigurationsfragen <em>Konfigurationsfragen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Konfigurationsfragen</em>' containment reference.
	 * @see #getKonfigurationsfragen()
	 * @generated
	 */
	void setKonfigurationsfragen(KonfigurationsfragenBewilligungType value);

	/**
	 * Returns the value of the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Familienstand</em>' containment reference.
	 * @see #setFamilienstand(FamilienstandType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_Familienstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='familienstand' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilienstandType getFamilienstand();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFamilienstand <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienstand</em>' containment reference.
	 * @see #getFamilienstand()
	 * @generated
	 */
	void setFamilienstand(FamilienstandType value);

	/**
	 * Returns the value of the '<em><b>Gleicher Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gleicher Haushalt</em>' attribute.
	 * @see #isSetGleicherHaushalt()
	 * @see #unsetGleicherHaushalt()
	 * @see #setGleicherHaushalt(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_GleicherHaushalt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='gleicherHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isGleicherHaushalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isGleicherHaushalt <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleicher Haushalt</em>' attribute.
	 * @see #isSetGleicherHaushalt()
	 * @see #unsetGleicherHaushalt()
	 * @see #isGleicherHaushalt()
	 * @generated
	 */
	void setGleicherHaushalt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isGleicherHaushalt <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGleicherHaushalt()
	 * @see #isGleicherHaushalt()
	 * @see #setGleicherHaushalt(boolean)
	 * @generated
	 */
	void unsetGleicherHaushalt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isGleicherHaushalt <em>Gleicher Haushalt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gleicher Haushalt</em>' attribute is set.
	 * @see #unsetGleicherHaushalt()
	 * @see #isGleicherHaushalt()
	 * @see #setGleicherHaushalt(boolean)
	 * @generated
	 */
	boolean isSetGleicherHaushalt();

	/**
	 * Returns the value of the '<em><b>Gruendegetrennter Wohnsitz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gruendegetrennter Wohnsitz</em>' attribute.
	 * @see #setGruendegetrennterWohnsitz(String)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_GruendegetrennterWohnsitz()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='gruendegetrennterWohnsitz' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGruendegetrennterWohnsitz();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getGruendegetrennterWohnsitz <em>Gruendegetrennter Wohnsitz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gruendegetrennter Wohnsitz</em>' attribute.
	 * @see #getGruendegetrennterWohnsitz()
	 * @generated
	 */
	void setGruendegetrennterWohnsitz(String value);

	/**
	 * Returns the value of the '<em><b>Altersgrenze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altersgrenze</em>' containment reference.
	 * @see #setAltersgrenze(AltersgrenzeType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_Altersgrenze()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altersgrenze' namespace='##targetNamespace'"
	 * @generated
	 */
	AltersgrenzeType getAltersgrenze();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAltersgrenze <em>Altersgrenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altersgrenze</em>' containment reference.
	 * @see #getAltersgrenze()
	 * @generated
	 */
	void setAltersgrenze(AltersgrenzeType value);

	/**
	 * Returns the value of the '<em><b>Art Behandlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Art Behandlung</em>' containment reference.
	 * @see #setArtBehandlung(ArtDerBehandlungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_ArtBehandlung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='artBehandlung' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtDerBehandlungType getArtBehandlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getArtBehandlung <em>Art Behandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Behandlung</em>' containment reference.
	 * @see #getArtBehandlung()
	 * @generated
	 */
	void setArtBehandlung(ArtDerBehandlungType value);

	/**
	 * Returns the value of the '<em><b>Antragstellende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antragstellende Person</em>' containment reference.
	 * @see #setAntragstellendePerson(PersonendatenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_AntragstellendePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragstellendePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getAntragstellendePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAntragstellendePerson <em>Antragstellende Person</em>}' containment reference.
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
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_NichtaustragendePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nichtaustragendePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonendatenType getNichtaustragendePerson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNichtaustragendePerson <em>Nichtaustragende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nichtaustragende Person</em>' containment reference.
	 * @see #getNichtaustragendePerson()
	 * @generated
	 */
	void setNichtaustragendePerson(PersonendatenType value);

	/**
	 * Returns the value of the '<em><b>Angaben Behandlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Behandlung</em>' containment reference.
	 * @see #setAngabenBehandlung(AngabenZurBehandlungType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_AngabenBehandlung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angabenBehandlung' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenZurBehandlungType getAngabenBehandlung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAngabenBehandlung <em>Angaben Behandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Behandlung</em>' containment reference.
	 * @see #getAngabenBehandlung()
	 * @generated
	 */
	void setAngabenBehandlung(AngabenZurBehandlungType value);

	/**
	 * Returns the value of the '<em><b>Finanzierungsplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finanzierungsplan</em>' containment reference.
	 * @see #setFinanzierungsplan(FinanzierungsplanType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_Finanzierungsplan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='finanzierungsplan' namespace='##targetNamespace'"
	 * @generated
	 */
	FinanzierungsplanType getFinanzierungsplan();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFinanzierungsplan <em>Finanzierungsplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finanzierungsplan</em>' containment reference.
	 * @see #getFinanzierungsplan()
	 * @generated
	 */
	void setFinanzierungsplan(FinanzierungsplanType value);

	/**
	 * Returns the value of the '<em><b>Nachweise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachweise</em>' containment reference.
	 * @see #setNachweise(NachweiseKinderwunschType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_Nachweise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweise' namespace='##targetNamespace'"
	 * @generated
	 */
	NachweiseKinderwunschType getNachweise();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNachweise <em>Nachweise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachweise</em>' containment reference.
	 * @see #getNachweise()
	 * @generated
	 */
	void setNachweise(NachweiseKinderwunschType value);

	/**
	 * Returns the value of the '<em><b>Einwilligungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einwilligungen</em>' containment reference.
	 * @see #setEinwilligungen(EinwilligungenType)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_Einwilligungen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='einwilligungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EinwilligungenType getEinwilligungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getEinwilligungen <em>Einwilligungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligungen</em>' containment reference.
	 * @see #getEinwilligungen()
	 * @generated
	 */
	void setEinwilligungen(EinwilligungenType value);

	/**
	 * Returns the value of the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute.
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getBewilligungsantragType_BestaetigungRichtigkeitAngaben()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='bestaetigungRichtigkeitAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBestaetigungRichtigkeitAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
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
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @generated
	 */
	void unsetBestaetigungRichtigkeitAngaben();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bestaetigung Richtigkeit Angaben</em>' attribute is set.
	 * @see #unsetBestaetigungRichtigkeitAngaben()
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @see #setBestaetigungRichtigkeitAngaben(boolean)
	 * @generated
	 */
	boolean isSetBestaetigungRichtigkeitAngaben();

} // BewilligungsantragType
